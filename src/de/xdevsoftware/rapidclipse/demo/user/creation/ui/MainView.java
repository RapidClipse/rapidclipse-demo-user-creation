
package de.xdevsoftware.rapidclipse.demo.user.creation.ui;

import java.util.Arrays;

import com.vaadin.data.Property;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Window.CloseEvent;
import com.xdev.security.authentication.jpa.HashStrategy;
import com.xdev.ui.PopupWindow;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevHorizontalLayout;
import com.xdev.ui.XdevPasswordField;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevVerticalLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;
import com.xdev.ui.masterdetail.MasterDetail;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.User;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.User_;

public class MainView extends XdevView {

	/**
	 *
	 */
	public MainView() {
		super();
		this.initUI();

		this.fieldGroup.setItemDataSource(new User());
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #cmdNew}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdNew_buttonClick(final Button.ClickEvent event) {
		this.fieldGroup.setItemDataSource(new User());

		this.showNewPasswordLayout();
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdSaveAndNew}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdSaveAndNew_buttonClick(final Button.ClickEvent event) {

		if (this.txtPassword.isVisible() && this.txtRepeatPassword.isVisible())
		{
			//Gets the value from the password field
			final String password = this.txtPassword.getValue();
			//Gets the value from the second password field
			final String password2 = this.txtRepeatPassword.getValue();
			//Encrypts the value of the password field with SHA2. You can choose between SHA2, SHA1, MD5 or PBKDF2WithHmacSHA1.
			//It depends on your Authentication implementation. See MyAuthenticationProvider.
			final byte[] firstPassword = new HashStrategy.SHA2().hashPassword(password.getBytes());
			final byte[] secondPassword = new HashStrategy.SHA2().hashPassword(password2.getBytes());
			//Compares the value from the first password field with the value from the second password field.
			if(Arrays.equals(firstPassword, secondPassword))
			{
				//Sets the password in the current User entity.
				this.fieldGroup.getItemDataSource().getBean().setPassword(firstPassword);
				//Saves the new user.
				this.fieldGroup.save();
				//Sets a new user to the form (fieldGroup).
				this.fieldGroup.setItemDataSource(new User());
				this.table.getBeanContainerDataSource().refresh();
				//Sets the components for the new user layout.
				this.showNewPasswordLayout();
			}
			else
			{
				Notification.show("Error", "The passwords do not match.", Type.ERROR_MESSAGE);
			}
		}
		else
		{
			this.fieldGroup.save();

			this.fieldGroup.setItemDataSource(new User());
			this.table.getBeanContainerDataSource().refresh();

			this.showNewPasswordLayout();
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevTable} {@link #table}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void table_valueChange(final Property.ValueChangeEvent event) {

		if(event.getProperty() != null && this.table.getSelectedItem() != null)
		{
			//Sets the components for the change password layout.
			this.showChangePasswordLayout();
		}

	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdChangePassword}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdChangePassword_buttonClick(final Button.ClickEvent event) {
		//Opens the PopupWindow
		PopupWindow.For(new ChangePasswordPopup(this.fieldGroup.getItemDataSource().getBean()))
				   .closable(false)
				   .draggable(false)
				   .resizable(false)
				   .modal(true)
				   .size(450, 350, Unit.PIXELS)
				   .onClose(this::popupClose)
				   .show();
	}

	private void popupClose(final CloseEvent event)
	{
		final byte[] newPassword = ((ChangePasswordPopup)event.getWindow().getContent()).getNewPassword();

		if(newPassword != null)
		{
			this.fieldGroup.getItemDataSource().getBean().setPassword(newPassword);
		}
	}

	private void showNewPasswordLayout()
	{
		this.txtPassword.clear();
		this.txtRepeatPassword.clear();

		this.txtPassword.setVisible(true);
		this.txtRepeatPassword.setVisible(true);
		this.cmdChangePassword.setVisible(false);
	}

	private void showChangePasswordLayout()
	{
		this.txtPassword.clear();
		this.txtRepeatPassword.clear();

		this.txtPassword.setVisible(false);
		this.txtRepeatPassword.setVisible(false);
		this.cmdChangePassword.setVisible(true);
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.form = new XdevGridLayout();
		this.txtUsername = new XdevTextField();
		this.horizontalLayout2 = new XdevVerticalLayout();
		this.txtPassword = new XdevPasswordField();
		this.txtRepeatPassword = new XdevPasswordField();
		this.cmdChangePassword = new XdevButton();
		this.txtFirstname = new XdevTextField();
		this.txtLastname = new XdevTextField();
		this.horizontalLayout = new XdevHorizontalLayout();
		this.cmdNew = new XdevButton();
		this.cmdSaveAndNew = new XdevButton();
		this.fieldGroup = new XdevFieldGroup<>(User.class);
		this.table = new XdevTable<>();

		this.form.setMargin(new MarginInfo(false));
		this.txtUsername.setCaption("Username");
		this.horizontalLayout2.setMargin(new MarginInfo(false));
		this.txtPassword.setCaption("Password");
		this.txtRepeatPassword.setCaption("Repeat Password");
		this.cmdChangePassword.setIcon(FontAwesome.KEY);
		this.cmdChangePassword.setCaption("Change Password");
		this.cmdChangePassword.setStyleName("friendly");
		this.cmdChangePassword.setVisible(false);
		this.txtFirstname.setCaption("Firstname");
		this.txtLastname.setCaption("Lastname");
		this.horizontalLayout.setMargin(new MarginInfo(false));
		this.cmdNew.setCaption("New");
		this.cmdSaveAndNew.setIcon(FontAwesome.SAVE);
		this.cmdSaveAndNew.setCaption("Save or Update");
		this.cmdSaveAndNew.setStyleName("primary");
		this.fieldGroup.bind(this.txtUsername, User_.username.getName());
		this.fieldGroup.bind(this.txtFirstname, User_.firstname.getName());
		this.fieldGroup.bind(this.txtLastname, User_.lastname.getName());
		this.table.setContainerDataSource(User.class);
		this.table.setVisibleColumns(User_.username.getName(), User_.firstname.getName(), User_.lastname.getName());

		MasterDetail.connect(this.table, this.fieldGroup);

		this.txtPassword.setWidth(100, Unit.PERCENTAGE);
		this.txtPassword.setHeight(-1, Unit.PIXELS);
		this.horizontalLayout2.addComponent(this.txtPassword);
		this.horizontalLayout2.setComponentAlignment(this.txtPassword, Alignment.MIDDLE_CENTER);
		this.txtRepeatPassword.setWidth(100, Unit.PERCENTAGE);
		this.txtRepeatPassword.setHeight(-1, Unit.PIXELS);
		this.horizontalLayout2.addComponent(this.txtRepeatPassword);
		this.horizontalLayout2.setComponentAlignment(this.txtRepeatPassword, Alignment.MIDDLE_CENTER);
		this.cmdChangePassword.setWidth(100, Unit.PERCENTAGE);
		this.cmdChangePassword.setHeight(-1, Unit.PIXELS);
		this.horizontalLayout2.addComponent(this.cmdChangePassword);
		this.horizontalLayout2.setComponentAlignment(this.cmdChangePassword, Alignment.MIDDLE_CENTER);
		this.cmdNew.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdNew);
		this.horizontalLayout.setComponentAlignment(this.cmdNew, Alignment.MIDDLE_LEFT);
		this.cmdSaveAndNew.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdSaveAndNew);
		this.horizontalLayout.setComponentAlignment(this.cmdSaveAndNew, Alignment.MIDDLE_LEFT);
		this.form.setColumns(2);
		this.form.setRows(5);
		this.txtUsername.setWidth(100, Unit.PERCENTAGE);
		this.txtUsername.setHeight(-1, Unit.PIXELS);
		this.form.addComponent(this.txtUsername, 1, 0);
		this.horizontalLayout2.setWidth(100, Unit.PERCENTAGE);
		this.horizontalLayout2.setHeight(-1, Unit.PIXELS);
		this.form.addComponent(this.horizontalLayout2, 1, 1);
		this.txtFirstname.setWidth(100, Unit.PERCENTAGE);
		this.txtFirstname.setHeight(-1, Unit.PIXELS);
		this.form.addComponent(this.txtFirstname, 1, 2);
		this.txtLastname.setWidth(100, Unit.PERCENTAGE);
		this.txtLastname.setHeight(-1, Unit.PIXELS);
		this.form.addComponent(this.txtLastname, 1, 3);
		this.horizontalLayout.setSizeUndefined();
		this.form.addComponent(this.horizontalLayout, 0, 4, 1, 4);
		this.form.setComponentAlignment(this.horizontalLayout, Alignment.TOP_RIGHT);
		this.form.setColumnExpandRatio(1, 100.0F);
		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(1);
		this.form.setWidth(100, Unit.PERCENTAGE);
		this.form.setHeight(-1, Unit.PIXELS);
		this.gridLayout.addComponent(this.form, 0, 0);
		this.table.setSizeFull();
		this.gridLayout.addComponent(this.table, 1, 0);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		this.gridLayout.setColumnExpandRatio(1, 20.0F);
		this.gridLayout.setRowExpandRatio(0, 10.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();

		this.cmdChangePassword.addClickListener(event -> this.cmdChangePassword_buttonClick(event));
		this.cmdNew.addClickListener(event -> this.cmdNew_buttonClick(event));
		this.cmdSaveAndNew.addClickListener(event -> this.cmdSaveAndNew_buttonClick(event));
		this.table.addValueChangeListener(event -> this.table_valueChange(event));
	} // </generated-code>

	// <generated-code name="variables">
	public XdevFieldGroup<User> fieldGroup;
	public XdevButton cmdChangePassword, cmdNew, cmdSaveAndNew;
	public XdevHorizontalLayout horizontalLayout;
	public XdevPasswordField txtPassword, txtRepeatPassword;
	public XdevGridLayout gridLayout, form;
	public XdevTextField txtUsername, txtFirstname, txtLastname;
	public XdevVerticalLayout horizontalLayout2;
	public XdevTable<User> table;
	// </generated-code>

}

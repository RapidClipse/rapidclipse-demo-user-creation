package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xdev.dal.DAO;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.util.Caption;

import de.xdevsoftware.rapidclipse.demo.user.creation.dal.UserDAO;

@Entity
@DAO(daoClass = UserDAO.class)
@Table(name = "`USER`")
public class User implements CredentialsUsernamePassword {

	private byte[] password;
	private String username;
	private String firstname;
	private String lastname;

	public User() {
		super();
	}

	@Caption("Username")
	@Id
	@Column(name = "USERNAME", unique = true, nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@Caption("Password")
	@Column(name = "`PASSWORD`", nullable = false)
	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(final byte[] password) {
		this.password = password;
	}

	@Override
	public String username() {
		return this.getUsername();
	}

	@Override
	public byte[] password() {
		return this.getPassword();
	}

	@Caption("Firstname")
	@Column(name = "FIRSTNAME")
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(final String noname) {
		this.firstname = noname;
	}

	@Caption("Lastname")
	@Column(name = "LASTNAME")
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(final String noname2) {
		this.lastname = noname2;
	}

}

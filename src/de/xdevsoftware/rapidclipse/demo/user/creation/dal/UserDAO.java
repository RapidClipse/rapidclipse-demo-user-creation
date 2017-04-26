package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import com.xdev.dal.JPADAO;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.User;

public class UserDAO extends JPADAO<User, String> {

	public UserDAO() {
		super(User.class);
	}

}

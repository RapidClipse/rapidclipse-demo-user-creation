
package de.xdevsoftware.rapidclipse.demo.user.creation.business;

import com.xdev.security.authentication.Authenticator;
import com.xdev.security.authentication.AuthenticatorProvider;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.security.authentication.jpa.JPAAuthenticator;
import com.xdev.security.authentication.jpa.HashStrategy.SHA2;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.User;

public class MyAuthenticationProvider
		implements AuthenticatorProvider<CredentialsUsernamePassword, CredentialsUsernamePassword> {
	private static MyAuthenticationProvider INSTANCE;

	public static MyAuthenticationProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MyAuthenticationProvider();
		}

		return INSTANCE;
	}

	private JPAAuthenticator authenticator;

	private MyAuthenticationProvider() {
	}

	@Override
	public Authenticator<CredentialsUsernamePassword, CredentialsUsernamePassword> provideAuthenticator() {
		if (this.authenticator == null) {
			this.authenticator = new JPAAuthenticator(User.class);
			this.authenticator.setHashStrategy(new SHA2());
		}

		return this.authenticator;
	}
}

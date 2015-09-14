package designpattern.factory;

import designpattern.factory.login.Login;
import designpattern.factory.login.LoginManager;

public class LoginTest {

	public static void main(String[] args) {
		String loginType = "password";
		String name = "waikei.tam";
		String password = "123456";
		Login login = LoginManager.factory(loginType);
		boolean pass = login.verify(name, password);

		if (pass) {
			/**
			 * µÇÂ¼³É¹¦
			 */
		} else {
			/**
			 * µÇÂ¼Ê§°Ü
			 */
		}

//		Login passwordLogin = new PasswordLogin();
//		Login domainLogin = new DomainLogin();
	}

}

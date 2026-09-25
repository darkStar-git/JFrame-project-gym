import view.TelaLogin;
import controller.LoginController;

public class main {
	public static void main(String[] args) {

		TelaLogin loginView = new TelaLogin();
		new LoginController(loginView);
		loginView.setVisible(true);

	}
}
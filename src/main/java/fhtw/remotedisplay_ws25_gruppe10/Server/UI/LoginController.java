package fhtw.remotedisplay_ws25_gruppe10.Server.UI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import fhtw.remotedisplay_ws25_gruppe10.Server.auth.AuthService;
import fhtw.remotedisplay_ws25_gruppe10.Server.model.User;

public class LoginController {

    public TextField usernameField;
    public PasswordField passwordField;
    public Button loginButton;
    public Label statusLabel;

    private final AuthService authService = new AuthService();
    private User currentUser;

    public void onLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        try {
            currentUser = authService.login(username, password);
            statusLabel.setText("Angemeldet als " + currentUser.getUsername() + " (" + currentUser.getRole() + ")");
        } catch (AuthService.AuthenticationException ex) {
            statusLabel.setText("Login fehlgeschlagen: " + ex.getMessage());
        } catch (Exception ex) {
            statusLabel.setText("Unerwarteter Fehler.");
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
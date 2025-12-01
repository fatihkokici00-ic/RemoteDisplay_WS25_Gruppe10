package fhtw.remotedisplay_ws25_gruppe10.Server.auth;

import fhtw.remotedisplay_ws25_gruppe10.Server.model.User;

public class AuthService {

    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    public User login(String username, String password) throws AuthenticationException {
        if (username == null || username.isBlank()) {
            throw new AuthenticationException("Username darf nicht leer sein.");
        }
        if (password == null || password.isBlank()) {
            throw new AuthenticationException("Passwort darf nicht leer sein.");
        }
        if (!CredentialsStore.hasUser(username)) {
            throw new AuthenticationException("Unbekannter Benutzer.");
        }
        if (!CredentialsStore.passwordMatches(username, password)) {
            throw new AuthenticationException("Falsches Passwort.");
        }
        return new User(username, CredentialsStore.roleFor(username));
    }
}

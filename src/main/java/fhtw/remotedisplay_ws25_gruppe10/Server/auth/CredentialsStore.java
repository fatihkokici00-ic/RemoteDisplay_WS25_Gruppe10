package fhtw.remotedisplay_ws25_gruppe10.Server.auth;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CredentialsStore {
    private static final Map<String, String> PASSWORDS;
    private static final Map<String, String> ROLES;

    static {
        Map<String, String> pw = new HashMap<>();
        pw.put("admin", "password123");
        pw.put("user1", "mypassword");
        pw.put("guest", "guest123");
        PASSWORDS = Collections.unmodifiableMap(pw);

        Map<String, String> roles = new HashMap<>();
        roles.put("admin", "ADMIN");
        roles.put("user1", "USER");
        roles.put("guest", "GUEST");
        ROLES = Collections.unmodifiableMap(roles);
    }

    private CredentialsStore() {}

    public static boolean hasUser(String username) {
        return PASSWORDS.containsKey(username);
    }

    public static boolean passwordMatches(String username, String password) {
        String expected = PASSWORDS.get(username);
        return expected != null && expected.equals(password);
    }

    public static String roleFor(String username) {
        return ROLES.getOrDefault(username, "USER");
    }
}

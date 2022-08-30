package controllers;

public class ManageVendor {

    public boolean login (String username, String password) {
        String query = "SELECT email, name, id FROM users WHERE username=" + username + " and password=" + password + ";";
        return false;
    }
}

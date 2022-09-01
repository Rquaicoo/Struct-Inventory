package controllers;

import models.Vendor;

import java.util.HashMap;
import java.util.List;

public class ManageVendor {

    public HashMap<String, List<Vendor>> vendorInfo = new HashMap<String, List<Vendor>>();


    public boolean login (String username, String password) {
        String query = "SELECT email, name, id FROM users WHERE username=" + username + " and password=" + password + ";";
        return false;
    }
}

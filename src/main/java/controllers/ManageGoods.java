package controllers;

import models.Good;

import java.sql.*;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ManageGoods {
    private String url = "jdbc:mysql://localhost:3306/struct";
    private String username ="russell";
    private  String password ="12345";

    public void addGoodWithStack(Stack<Good> goods, int index) {
        try {
            Class.forName("com.mysql.cj.jbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement= connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT username, email FROM user");

            while (resultSet.next()) {
                System.out.println((resultSet.getString(0) + resultSet.getString(1)));
            }

            connection.close();
        }

        catch (Exception ex) {
            System.out.println("" + ex);
        }

        for(int i=0; i<index; i++) {

        }
    }

    public void addGoodWithQueue(Queue<Good> goods) {

    }

    public void addGoodWithList() {

    }

    public void connectDatabase() {

    }
}

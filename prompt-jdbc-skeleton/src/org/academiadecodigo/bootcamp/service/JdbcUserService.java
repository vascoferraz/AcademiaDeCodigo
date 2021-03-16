package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.ConnectionManager;
import org.academiadecodigo.bootcamp.utils.Security;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JdbcUserService implements UserService {

    private ConnectionManager connectionManager = new ConnectionManager();
    private Connection dbConnection;

    public JdbcUserService() {
        dbConnection = connectionManager.getConnection();
    }

    @Override
    public boolean authenticate(String username, String password) {

        String passwordHash = Security.getHash(password);

        String dbUsername;
        String dbPasswordHash;

        String query = "SELECT username, password FROM user;";
        PreparedStatement statement = null;

        try {
            statement = dbConnection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            for (int i = 0; i < count(); i++) {

                if (resultSet.next()) {
                    dbUsername = resultSet.getString(1);
                    dbPasswordHash = resultSet.getString(2);

                    if (dbUsername.equals(username) && dbPasswordHash.equals(passwordHash)) {
                        return true;
                    }
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    @Override
    public void add(User user) {

        String query = "INSERT INTO user (username, password, email, firstname, lastname, phone) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = null;

        if (findByName(user.getUsername()) == null) {
            try {
                statement = dbConnection.prepareStatement(query);
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setString(3, user.getEmail());
                statement.setString(4, user.getFirstName());
                statement.setString(5, user.getLastName());
                statement.setString(6, user.getPhone());

                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


    @Override
    public User findByName(String username) {

        String query = "SELECT username, firstname, phone, email, password, lastname FROM user WHERE username=?";
        PreparedStatement statement = null;
        User user = null;

        try {
            statement = dbConnection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String dbUsername = resultSet.getString(1);
                String dbFirstName = resultSet.getString(2);
                String dbPhone = resultSet.getString(3);
                String dbEmail = resultSet.getString(4);
                String dbPassword = resultSet.getString(5);
                String dbLastName = resultSet.getString(6);
                user = new User(dbUsername, dbEmail, dbPassword, dbFirstName, dbLastName, dbPhone);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user;

    }

    @Override
    public List<User> findAll() {

        Statement statement = null;
        List list = new LinkedList();

        try {
            statement = dbConnection.createStatement();
            String query = "SELECT username, firstname, phone, email, password, lastname FROM user";
            ResultSet resultSet = statement.executeQuery(query);

            for (int i = 0; i < count(); i++) {

                if (resultSet.next()) {
                    String dbUsername = resultSet.getString(1);
                    String dbFirstName = resultSet.getString(2);
                    String dbPhone = resultSet.getString(3);
                    String dbEmail = resultSet.getString(4);
                    String dbPassword = resultSet.getString(5);
                    String dbLastName = resultSet.getString(6);

                    User user = new User(dbUsername, dbEmail, dbPassword, dbFirstName, dbLastName, dbPhone);
                    list.add(user);
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    @Override
    public int count() {

        int result = 0;

        Statement statement = null;

        try {
            statement = dbConnection.createStatement();
            String query = "SELECT COUNT(*) FROM user";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                result = resultSet.getInt(1);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //System.out.println(result);
        return result;

    }
}

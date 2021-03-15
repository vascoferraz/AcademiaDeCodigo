package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * user service
 */
public interface UserService {

    /**
     * Authenticates the user using the given username and password
     *
     * @param username the user name
     * @param password the user password
     * @return true if authenticated
     */
    boolean authenticate(String username, String password);

    /**
     * Adds a new user
     *
     * @param user the new user to add
     */
    void add(User user);

    /**
     * Finds a user by name
     *
     * @param username the user name used to lookup a user
     * @return a new User if found, null otherwise
     */
    User findByName(String username);

    /**
     * Finds all users
     *
     * @return list of users if found, null otherwise
     */
    List<User> findAll();

    /**
     * Count the number of existing users
     *
     * @return the number of users
     */
    int count();

}

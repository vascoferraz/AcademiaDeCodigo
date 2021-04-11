package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.utils.Security;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * An in-memory mock user service backed by a HashMap
 */
public class MockUserService implements UserService {

    /**
     * The container of users
     */
    private Map<String, User> users;

    public MockUserService() {
        users = new HashMap<>();
    }

    public MockUserService(Map<String, User> users) {

        this.users = users;
    }


    /**
     * @see UserService#authenticate(String, String)
     */
    @Override
    public boolean authenticate(String username, String password) {

        return users.containsKey(username) && (users.get(username)).getPassword().equals(Security.getHash(password));

    }

    /**
     * @see UserService#add(User)
     */
    @Override
    public void add(User user) {
        if (!users.containsKey(user.getUsername())) {
            users.put(user.getUsername(), user);
        }
    }

    /**
     * @see UserService#findByName(String)
     */
    @Override
    public User findByName(String username) {
        return users.get(username);
    }


    /**
     * @see UserService#findAll()
     */
    @Override
    public List<User> findAll() {
        return new LinkedList<>(users.values());
    }


    /**
     * @see UserService#count()
     */
    @Override
    public int count() {
        return users.size();
    }


}

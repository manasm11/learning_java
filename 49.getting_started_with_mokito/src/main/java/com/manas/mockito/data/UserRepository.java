package com.manas.mockito.data;

import com.manas.mockito.User;

import java.util.HashMap;

public class UserRepository {

    private HashMap<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("manas", new User("manas", "heallo"));
        users.put("divya", new User("divya", "okies"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}

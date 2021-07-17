package com.example.trying_with_idea_ultimate.databases;

import com.example.trying_with_idea_ultimate.models.Message;
import com.example.trying_with_idea_ultimate.models.Profile;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    static {
        profiles.put("manas", new Profile("manas", "Manas", "Mishra", new Date()));
        profiles.put("divya", new Profile("divya", "Divya", "Tyagi", new Date()));
        messages.put(1L, new Message(1, "Hello", new Date(), "Some Author"));
        messages.put(2L, new Message(2, "Some Title", new Date(), "Some Other Authro"));
    }

    public static Map<Long, Message> getMessages() {
        System.out.println(messages);
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }

}

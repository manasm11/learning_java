package com.example.trying_with_idea_ultimate.services;

import com.example.trying_with_idea_ultimate.databases.DatabaseClass;
import com.example.trying_with_idea_ultimate.interfaces.MessageServiceInterface;
import com.example.trying_with_idea_ultimate.models.Message;

import java.util.*;
import java.util.stream.Collectors;

public class MessageService implements MessageServiceInterface {

    Map<Long, Message> messages = DatabaseClass.getMessages();

    @Override
    public List<Message> getAllMessages() {
        return new ArrayList<>(messages.values());
    }

    public List<Message> getAllMessagesWithYear(int year) {
        return messages.values().stream()
                .filter(message -> {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(message.getCreated());
                    return calendar.get(Calendar.YEAR) == year;
                })
                .collect(Collectors.toList());
    }

    public List<Message> getPaginatedMessages(int start, int size) {
        int end = Math.min(start + size, messages.size());
        return new ArrayList<>(messages.values()).subList(start, end);
    }

    @Override
    public Message getMessage(long id) {
        return messages.get(id);
    }

    @Override
    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    @Override
    public Message updateMessage(Message message) {
        return messages.put(message.getId(), message);
    }

    @Override
    public Message removeMessage(long id) {
        return messages.remove(id);
    }
}

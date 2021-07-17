package com.example.trying_with_idea_ultimate.interfaces;

import com.example.trying_with_idea_ultimate.models.Message;

import java.util.List;

public interface MessageServiceInterface {
    List<Message> getAllMessages();
    Message getMessage(long id);
    Message addMessage(Message message);
    Message updateMessage(Message message);
    Message removeMessage(long id);
}

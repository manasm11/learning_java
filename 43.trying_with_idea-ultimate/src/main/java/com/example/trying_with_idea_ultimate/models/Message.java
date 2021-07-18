package com.example.trying_with_idea_ultimate.models;

import java.beans.Transient;
import java.util.*;

public class Message {
    private long id;
    private String message;
    private Date created;
    private String author;
    private Map<String, String> links = new HashMap<>();
//    private List<Link> links = new ArrayList<>();


    //    @Transient
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                '}';
    }

    public Message(long id, String message, Date created, String author) {
        this.id = id;
        this.message = message;
        this.created = created;
        this.author = author;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }

    public void addLink(String rel, String link) {
        links.put(rel, link);
    }

//    public List<Link> getLinks() {
//        return links;
//    }

//    public void setLinks(List<Link> links) {
//        this.links = links;
//    }
}

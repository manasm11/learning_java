package com.example.trying_with_idea_ultimate.resources;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/messages")
public class MessageResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessages() {
        return "YO WORLD !!!";
    }
}

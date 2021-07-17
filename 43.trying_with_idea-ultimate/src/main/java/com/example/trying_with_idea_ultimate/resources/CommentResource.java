package com.example.trying_with_idea_ultimate.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/")
public class CommentResource {

    @GET
    public String getAllComments() {
        return "HELLO";
    }

    @GET
    @Path("/{commentId}")
    public String getComment(
            @PathParam("commentId") Long commentId,
            @PathParam("messageId") Long messageId
    ) {
        return "messageId: " + messageId + "\ncommentId: " + commentId;
    }
}

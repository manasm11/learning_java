package com.example.trying_with_idea_ultimate.resources;

import com.example.trying_with_idea_ultimate.models.Link;
import com.example.trying_with_idea_ultimate.models.Message;
import com.example.trying_with_idea_ultimate.resources.beans.MessageFilterBean;
import com.example.trying_with_idea_ultimate.services.MessageService;
import org.glassfish.jersey.server.Uri;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages(
            @BeanParam MessageFilterBean bean
    ) {
        if (bean.getYear() > 0)
            return messageService.getAllMessagesWithYear(bean.getYear());
        if (bean.getStart() >= 0 && bean.getSize() > 0)
            return messageService.getPaginatedMessages(bean.getStart(), bean.getSize());
        return messageService.getAllMessages();
    }

    @POST
    public Response postMessage(@Context UriInfo uriInfo, Message message) {
        Message newMessage = messageService.addMessage(message);
        URI uri = uriInfo.getAbsolutePathBuilder()
                .path(newMessage.getId().toString())
                .build();
        return Response.created(uri).entity(newMessage).build();
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") Long messageId, @Context UriInfo uriInfo) {
        Message message = messageService.getMessage(messageId);
        message.addLink("self", getMessageSelfUri(messageId, uriInfo));
        return message;
    }


    private String getMessageSelfUri(Long messageId, UriInfo uriInfo) {
        return uriInfo.getBaseUriBuilder()
                .path(MessageResource.class)
                .path(messageId.toString())
                .build().toString();
    }

    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") Long messageId, Message message) {
        message.setId(messageId);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    public void deleteMessage(@PathParam("messageId") Long messageId) {
        messageService.removeMessage(messageId);
    }

    @Path("/{messageId}/comments")
    public CommentResource getCommentResource() {
        return new CommentResource();
    }
}

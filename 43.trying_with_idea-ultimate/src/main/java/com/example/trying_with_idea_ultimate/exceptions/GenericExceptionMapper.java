package com.example.trying_with_idea_ultimate.exceptions;

import com.example.trying_with_idea_ultimate.models.ErrorMessage;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 500, "https://google.com");
        return Response.status(errorMessage.getErrorCode()).entity(errorMessage).header("Content-Type", "application/json").build();
    }
}

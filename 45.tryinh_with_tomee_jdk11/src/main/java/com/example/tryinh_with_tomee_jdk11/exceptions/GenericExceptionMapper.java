package com.example.tryinh_with_tomee_jdk11.exceptions;

import com.example.tryinh_with_tomee_jdk11.models.ErrorResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getClass().getSimpleName(), exception.getMessage());
        return Response.serverError().entity(errorResponse).build();
    }
}

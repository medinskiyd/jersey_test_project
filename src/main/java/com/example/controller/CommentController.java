package com.example.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.Date;

/**
 * Created by DMedinskiy on 03.06.2016.
 */
@Path("/")
public class CommentController {

    @GET
    public String getTest() {
        return new Date().toString();
    }

    @GET
    @Path("/{commentId}")
    public String getTest(@PathParam("commentId") String commentId) {
        return "Comment id = " + commentId ;
    }



}

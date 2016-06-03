package com.example.controller;

import com.example.Core.Health;
import com.example.Core.ParamFilterBean;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.Date;

/**
 * Created by DMedinskiy on 02.06.2016.
 */

@Component
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType)
public class TestController {

    @GET //localhost:8080/test/1/text?qparam=text
    @Path("/{id}/{param}")
    public String testGet(@PathParam ("id") Long id,
                          @PathParam ("param") String p,
                          @BeanParam ParamFilterBean paramFilterBean) { //@QueryParam ("qparam") @DefaultValue("default") String qp)

        return "Jersey: Get PathParam1 =" + id + " PathParam2 =" + p + " QueryParam =" + paramFilterBean.getQp();
    }

    @GET //localhost:8080/test;param=er
    public String testGet2(@MatrixParam ("param") String p,
                           @HeaderParam ("Content-Type") String h,
                           @CookieParam("name") String c) {

        return "Jersey: Get MatrixParam =" + p + " HeaderParam =" + h + " CookieParam =" + c;
    }



    @POST
    public String testPost(String str) {

        return "Jersey: POST " + str;
    }

    @GET //get path
    @Path("/path")
    public String getPath(@Context UriInfo uriInfo) {

        String path = uriInfo.getAbsolutePath().toString();

        return "Path = " + path;
    }

    @GET //get cookie
    @Path("/cookie")
    public String getCookie(@Context HttpHeaders headers) {

        String cookie = headers.getCookies().toString();

        return "Cookie = " + cookie;
    }

    //all request comments (subresources)
    @Path("/comments")
    public CommentController getComment() {
        return new CommentController();
    }


}

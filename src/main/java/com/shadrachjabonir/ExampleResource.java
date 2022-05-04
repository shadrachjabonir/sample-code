package com.shadrachjabonir;

import io.vertx.ext.web.Router;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    public void init(@Observes Router router ){
        router
                .get("/ping")
                .produces(MediaType.TEXT_PLAIN)
                .handler(routingContext -> routingContext.response().end("pong"));
    }
}
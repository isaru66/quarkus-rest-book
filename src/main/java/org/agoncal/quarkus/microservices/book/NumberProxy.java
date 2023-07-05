package org.agoncal.quarkus.microservices.book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient
@Path("/api/numbers")
@RegisterClientHeaders
public interface NumberProxy {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    IsbnNumber generateIsbnNumber();
}

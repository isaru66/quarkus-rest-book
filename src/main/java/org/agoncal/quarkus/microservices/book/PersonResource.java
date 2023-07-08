package org.agoncal.quarkus.microservices.book;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.LocalDate;

@Path("/api/person")
public class PersonResource {

    @Inject
    Logger logger;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Person createPerson(@FormParam("name") String name,
                               @FormParam("birth") String birth,
                               @FormParam("status") String status) {
        Person person = new Person(name,birth,status);
        logger.info("Person created : "+ person);
        return person;
    }
}

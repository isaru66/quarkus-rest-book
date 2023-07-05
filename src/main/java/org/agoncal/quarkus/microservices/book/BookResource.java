package org.agoncal.quarkus.microservices.book;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.time.Instant;

@Path("/api/books")
public class BookResource {

    @Inject
    @RestClient
    NumberProxy proxy;

    @Inject
    Logger logger;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createBook(@FormParam("title") String title,
                               @FormParam("author") String author,
                               @FormParam("yearOfPublication") int yearOfPublication,
                               @FormParam("genre") String genre) {
        Book book = new Book();
        IsbnNumber isbn13 = proxy.generateIsbnNumber();
        logger.info("ISBN: "+isbn13.isbn13);
        book.isbn13 = isbn13.isbn13;
        book.title = title;
        book.author = author;
        book.yearOfPublication = yearOfPublication;
        book.genre = genre;
        book.createDate = Instant.now();
        logger.info("Book created : "+ book);
        return Response.status(201).entity(book).build();
    }
}

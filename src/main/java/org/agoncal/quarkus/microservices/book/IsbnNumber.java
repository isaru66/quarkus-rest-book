package org.agoncal.quarkus.microservices.book;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

public class IsbnNumber {
    @JsonbProperty("isbn_13")
    public String isbn13;


    @JsonbProperty("isbn_10")
    public String isbn10;


    public String toString() {
        return "IsbnNumbers{ isbn13=" + isbn13 + ", isbn10=" + isbn10 + "}";
    }
}

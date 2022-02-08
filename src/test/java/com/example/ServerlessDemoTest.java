package com.example;

import com.example.ServerlessDemoTest.BookServiceClient;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@MicronautTest
class ServerlessDemoTest {

    @Test
    void testItWorks(BookServiceClient client) {
        List<String> results = client.list();
        assertEquals(2, results.size());
    }

    @Test
    void testAnother() {
        System.out.println("RUNNING!");
        
        Assertions.assertTrue(false);
    }


    @Test
    void testThird() {
        Assertions.assertTrue(false);
    }

    @Test
    void testFour() {
        Assertions.assertTrue(false);
    }

    @Client("/books")
    interface BookServiceClient {
        @Get
        List<String> list();
    }
}

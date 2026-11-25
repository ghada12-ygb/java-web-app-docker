
package com.rst.helloworld.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceTest {

    private HelloWorldService service;

    @Before
    public void setUp() {
        service = new HelloWorldService();
    }

    @Test
    public void testGetDesc() {
        String result = service.getDesc();

        assertEquals(
            "Maven + Spring MVC + Jenkins + Docker Example",
            result
        );
    }

    @Test
    public void testGetTitleWithEmptyName() {
        String result = service.getTitle("");

        assertEquals("Hello Docker", result);
    }

    @Test
    public void testGetTitleWithName() {
        String result = service.getTitle("Ghada");

        assertEquals("Hello Ghada", result);
    }

    @Test
    public void testGetTitleWithNullName() {
        String result = service.getTitle(null);

        assertEquals("Hello Docker", result);
    }
}


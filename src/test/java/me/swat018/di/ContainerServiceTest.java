package me.swat018.di;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ContainerServiceTest {

    @Test
    public void getOject_BookRepository() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertNotNull(bookRepository);
    }

    @Test
    public void getOject_BookService() {
        BookService bookService = ContainerService.getObject(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }
}

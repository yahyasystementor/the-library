package test.fullproject;

import main.fullproject.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BookTest {





    @Test
    void borrowShouldMakeBookUnavailable(){

        // Arrange
        Book book = new Book("1","Pippi långstrump", "Astrid lindgren", 1945);

        // Act
        boolean success = book.borrow();

        // Assert
        assertTrue(success);
        assertFalse(book.isAvailable());

    }

}

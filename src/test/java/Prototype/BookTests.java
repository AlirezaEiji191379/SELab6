package Prototype;

import Prototype.Models.Book;
import Prototype.Models.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTests {
    public BookTests(){

    }


    @Test
    public void Clone_ShouldCreateAnotherBookObjectWithDeepCopy_WhenTheBookCloneMethodIsInvoked() throws CloneNotSupportedException {
        //Arrange
        var writer = new Person("Reza",20);
        var book = new Book("TDD",1000,writer);
        //Act
        var newBook = book.clone();
        //Assert
        assertEquals(newBook.getName(),book.getName());
        assertEquals(newBook.getPrice(),book.getPrice());
        assertEquals(newBook.getWriter().getName(),book.getWriter().getName());
        assertEquals(newBook.getWriter().getAge(),book.getWriter().getAge());
        assertNotEquals(book,newBook);
        assertNotEquals(book.getWriter(),newBook.getWriter());
    }

}

package com.nexse.swat.springdataexample;

import com.nexse.swat.springdataexample.domain.Book;
import com.nexse.swat.springdataexample.repository.BookRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 17:27
 */
public class CommonTestCode {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void insertOneBook(){
        Assert.notNull(bookRepository);
        Book book = new Book();
        book.setTitle("test1");
        bookRepository.save(book);
        Assert.isTrue(bookRepository.count()==1);
        List<Book> books = bookRepository.findByTitle("test1");
        Assert.isTrue(books.size()==1);
    }

}

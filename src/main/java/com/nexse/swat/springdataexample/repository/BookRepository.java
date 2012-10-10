package com.nexse.swat.springdataexample.repository;

import com.nexse.swat.springdataexample.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 16:28
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    public List<Book> findByTitle(String title);
}


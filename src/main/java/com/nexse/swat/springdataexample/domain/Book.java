package com.nexse.swat.springdataexample.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 16:25
 */
@Entity
public class Book extends AbstractPersistable<Long> {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

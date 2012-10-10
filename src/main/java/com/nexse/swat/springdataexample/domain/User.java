package com.nexse.swat.springdataexample.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 12:09
 */
@Entity
public class User extends AbstractPersistable<Long> {
    private String name;
    private String Surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}

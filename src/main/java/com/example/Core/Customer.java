package com.example.Core;

import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by DMedinskiy on 31.05.2016.
 */
@Entity
public class Customer extends AbstractEntity {

    private String firstname, lastname;

    @Column
    private EmailAddress emailAddress;

    public Customer(String firstname, String lastname) {

        Assert.hasText(firstname);
        Assert.hasText(lastname);

        this.firstname = firstname;
        this.lastname = lastname;
    }

    protected Customer() {}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }
}

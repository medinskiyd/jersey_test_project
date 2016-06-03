package com.example.Core;

/**
 * Created by DMedinskiy on 31.05.2016.
 */
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }
}

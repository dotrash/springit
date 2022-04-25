package com.example.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
}

package com.example.springit.domain;

import javax.persistence.*;

@Entity
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    private String body;
    private int vote;
    @ManyToOne
    private Link link;
}

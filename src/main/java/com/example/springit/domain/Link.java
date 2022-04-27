package com.example.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    @OneToMany(mappedBy = "link")
    private List<Link> comments = new ArrayList<>();
}

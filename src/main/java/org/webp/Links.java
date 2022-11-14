package org.webp;

import javax.persistence.*;

@Entity
public class Links {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "order", nullable = false)
    private int order;

    @Column(name = "isActive", nullable = false)
    private char isActive;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "statistic", nullable = false)
    private int statistic;

    @JoinColumn(name = "user", nullable = false)
    @ManyToOne
    private Users user;
}

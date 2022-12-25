package org.webp;

import javax.persistence.*;

@Entity
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "photo")
    private String photo;

    @Column(name = "bio")
    private String bio;

    @Column(name = "profileTitle")
    private String profileTitle;

    @Column(name = "user", nullable = false)
    @OneToOne
    private Users user;
}

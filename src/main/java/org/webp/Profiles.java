package org.webp;

import javax.persistence.*;

@Entity
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "photo", nullable = false)
    private String photo;

    @Column(name = "bio", nullable = false)
    private String bio;

    @Column(name = "profileTitle", nullable = false)
    private String profileTitle;

    @Column(name = "user", nullable = false)
    @OneToOne
    private Users user;
}

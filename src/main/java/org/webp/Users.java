package org.webp;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    @Length(min = 2, max = 50)
    private String name;

    @Column(name = "link", nullable = false)
    private int link;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    @Length(min = 6, max = 255)
    private String password;

    @Column(name = "username", nullable = false)
    @Length(min = 2, max = 255)
    private String username;

    @Column(name = "profile", nullable = false)
    private int profile;

}

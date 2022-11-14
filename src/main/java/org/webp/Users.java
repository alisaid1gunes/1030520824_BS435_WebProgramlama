package org.webp;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.sql.Timestamp;
import java.util.List;


@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    @Length(min = 2, max = 50)
    private String name;

    @OneToMany
    private List<Links> link;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    @Length(min = 6, max = 255)
    private String password;

    @Column(name = "username", nullable = false)
    @Length(min = 2, max = 255)
    private String username;

    @JoinColumn(name = "profile", nullable = false)
    @OneToOne()
    private Profiles profile;

    @JoinColumn(name = "refreshToken", nullable = false)
    @OneToOne
    private RefreshTokens refreshToken;

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

}

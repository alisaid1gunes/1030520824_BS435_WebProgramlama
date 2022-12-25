package org.webp;

import javax.persistence.*;

@Entity
public class RefreshTokens {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "user", nullable = false)
    @OneToOne
    private Users user;


}

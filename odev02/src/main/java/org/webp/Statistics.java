package org.webp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "clicks")
    @OneToMany
    private List<Clicks> clicks;

    @Column(name = "views")
    @OneToMany
    private List<Views> views;

    @JoinColumn(name = "links", nullable = false)
    @OneToOne
    private Links links;

}

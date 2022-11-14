package org.webp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Views {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "viewDate")
    private Date viewDate;

    @JoinColumn(name = "statistics", nullable = false)
    @ManyToOne
    private Statistics statistics;
}

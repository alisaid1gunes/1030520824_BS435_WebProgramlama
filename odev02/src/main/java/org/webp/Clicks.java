package org.webp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Clicks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "clickDate", nullable = false)
    private Date clickDate;

    @JoinColumn(name = "statistics", nullable = false)
    @ManyToOne
    private Statistics statistics;
}

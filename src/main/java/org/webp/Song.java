package org.webp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "title_ID")
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_ID")
    private String author;

    public Song(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


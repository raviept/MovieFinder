package com.movie.finder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Movie implements Serializable{
    @Id
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(!(object instanceof Movie)) {
            return false;
        }

        Movie movie = (Movie) object;

        return movie.getTitle().equals(this.getTitle());
    }
}

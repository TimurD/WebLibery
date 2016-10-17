package com.java.spring.libery.interfaces;

import com.java.spring.libery.entity.Genre;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by timur_000 on 17.10.2016.
 */


public interface ShowGenre {
    public List<Genre> getGenres();
}

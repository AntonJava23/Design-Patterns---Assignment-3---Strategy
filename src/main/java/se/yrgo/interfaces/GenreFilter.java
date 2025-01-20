package se.yrgo.interfaces;

import se.yrgo.classes.Album;

public interface GenreFilter {
    boolean permit(Album a);
}

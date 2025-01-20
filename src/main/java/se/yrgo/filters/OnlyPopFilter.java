package se.yrgo.filters;

import se.yrgo.classes.Album;
import se.yrgo.interfaces.GenreFilter;

import java.util.Objects;

public class OnlyPopFilter implements GenreFilter {

    @Override
    public boolean permit(Album a) {
        return Objects.equals(a.genre(), "Pop");
    }
}

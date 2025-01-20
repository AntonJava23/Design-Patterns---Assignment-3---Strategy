package se.yrgo.classes;

import se.yrgo.filters.ExcludePopFilter;
import se.yrgo.filters.OnlyPopFilter;
import se.yrgo.interfaces.GenreFilter;

public class TestAlbum {

    public static void main(String[] args) {
        ExcludePopFilter noPopFilter = new ExcludePopFilter();
        OnlyPopFilter popFilter = new OnlyPopFilter();
        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        System.out.println(" -- No pop albums -- ");
        printAlbums(albums, noPopFilter);

        System.out.println("\n -- Only pop albums -- ");
        printAlbums(albums, popFilter);
    }

    static void printAlbums(Album[] albums, GenreFilter filter) {
        for (Album a : albums) {
            if (filter.permit(a)) {
                System.out.println(a);
            }
        }
    }
}

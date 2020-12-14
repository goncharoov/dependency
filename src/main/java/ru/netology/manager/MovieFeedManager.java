package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieFeedManager {
    private MovieItem[] movies = new MovieItem[0];
    private int countMovies = 10;

    public void add (MovieItem movie) {
        int length = movies.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
//        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = movie;
        movies = tmp;
    }

    public MovieItem[] getAll() {
        MovieItem[] result;
        if (movies.length > countMovies) {
            result = new MovieItem[countMovies];
        } else {
            result = new MovieItem[movies.length];
        }
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
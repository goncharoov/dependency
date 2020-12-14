package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieFeedManagerTest {

    @Test
    void shouldOutputTenMovies() {
        MovieFeedManager manager = new MovieFeedManager();
        MovieItem first = new MovieItem(1, 0, "Бладшот", "://1", "боевик");
        MovieItem second = new MovieItem(2, 1, "Вперед", "://2", "мультфильм");
        MovieItem third = new MovieItem(3, 2, "Отель 'Белград'", "://3", "комедия");
        MovieItem fourth = new MovieItem(4, 3, "Джентельмены", "://4", "боевик");
        MovieItem fifth = new MovieItem(5, 4, "Человек-невидимка", "://5", "ужасы");
        MovieItem sixth = new MovieItem(6, 5, "Тролли", "://6", "мультфильм");
        MovieItem seventh = new MovieItem(7, 6, "Номер один", "://7", "комедия");
        MovieItem eighth = new MovieItem(8, 7, "Матрица", "://8", "фантастика");
        MovieItem ninth = new MovieItem(9, 8, "Один дома", "://9", "комедия");
        MovieItem tenth = new MovieItem(10, 9, "Китобой", "10", "драма");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[] {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldOutputFiveMovies() {
        MovieFeedManager manager = new MovieFeedManager(5);
        MovieItem first = new MovieItem(1, 0, "Бладшот", "://1", "боевик");
        MovieItem second = new MovieItem(2, 1, "Вперед", "://2", "мультфильм");
        MovieItem third = new MovieItem(3, 2, "Отель 'Белград'", "://3", "комедия");
        MovieItem fourth = new MovieItem(4, 3, "Джентельмены", "://4", "боевик");
        MovieItem fifth = new MovieItem(5, 4, "Человек-невидимка", "://5", "ужасы");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[] {fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotOutput() {
        MovieFeedManager manager = new MovieFeedManager(0);
        MovieItem first = new MovieItem(1, 0, "Бладшот", "://1", "боевик");
        MovieItem second = new MovieItem(2, 1, "Вперед", "://2", "мультфильм");
        MovieItem third = new MovieItem(3, 2, "Отель 'Белград'", "://3", "комедия");
        MovieItem fourth = new MovieItem(4, 3, "Джентельмены", "://4", "боевик");
        MovieItem fifth = new MovieItem(5, 4, "Человек-невидимка", "://5", "ужасы");
        MovieItem sixth = new MovieItem(6, 5, "Тролли", "://6", "мультфильм");
        MovieItem seventh = new MovieItem(7, 6, "Номер один", "://7", "комедия");
        MovieItem eighth = new MovieItem(8, 7, "Матрица", "://8", "фантастика");
        MovieItem ninth = new MovieItem(9, 8, "Один дома", "://9", "комедия");
        MovieItem tenth = new MovieItem(10, 9, "Китобой", "10", "драма");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[] {};
        assertArrayEquals(expected, actual);
    }
}
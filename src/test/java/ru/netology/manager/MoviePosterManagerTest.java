package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieObject;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {


    @Test
        //покажет = лимиту фильмов
    void showTenFilms() {

        MoviePosterManager manager = new MoviePosterManager();

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        MovieObject[] expected = new MovieObject[]{ten, nine, eight, seventh, sixth, fifth, fourth, third, second, first};
        MovieObject[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
        //покажет выше лимита
    void willShowBelowTheLimit() {

        MoviePosterManager manager = new MoviePosterManager(12);

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);

        MovieObject[] expected = new MovieObject[]{twelve, eleven, ten, nine, eight, seventh, sixth, fifth, fourth, third, second, first};
        MovieObject[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
        // добавление определённого фильма
    void addingMovie() {

        MoviePosterManager manager = new MoviePosterManager();

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(third);

        MovieObject[] expected = new MovieObject[]{third};
        MovieObject[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
        // ниже лимита
    void belowTheLimit() {

        MoviePosterManager manager = new MoviePosterManager(8);

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);

        MovieObject[] expected = new MovieObject[]{twelve, eleven, ten, nine, eight};
        MovieObject[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }


    @Test
        // в списке нет фильмов
    void thereAreNoMoviesInTheList() {
        MoviePosterManager manager = new MoviePosterManager();

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        MovieObject[] expected = new MovieObject[]{};
        MovieObject[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
        // добавление фильма к добавленному
    void addingMovieToAnAddedOne() {
        MoviePosterManager manager = new MoviePosterManager();

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(third);
        manager.add(nine);

        MovieObject[] expected = new MovieObject[]{third, nine};
        MovieObject[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
        // добавление фильмов по порядку
    void addingMoviesInOrder() {
        MoviePosterManager manager = new MoviePosterManager(12);

        MovieObject first = new MovieObject(1, "Бладшот", "боевик");
        MovieObject second = new MovieObject(2, "Вперёд", "мультфильм");
        MovieObject third = new MovieObject(3, "Отель", "комедия");
        MovieObject fourth = new MovieObject(4, "Джентльмены", "боевик");
        MovieObject fifth = new MovieObject(5, "Человек-невидимка", "ужасы");
        MovieObject sixth = new MovieObject(6, "Тролли", "мультфильм");
        MovieObject seventh = new MovieObject(7, "Зелебоба", "драма");
        MovieObject eight = new MovieObject(8, "Шрек", "мультфильм");
        MovieObject nine = new MovieObject(9, "Гагарин", "документальный");
        MovieObject ten = new MovieObject(10, "Время", "фантастика");
        MovieObject eleven = new MovieObject(11, "Сталин", "документальный");
        MovieObject twelve = new MovieObject(12, "Пушкин", "документальный");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);

        MovieObject[] expected = new MovieObject[]{first, second, third, fourth, fifth, sixth, seventh, eight, nine, ten, eleven, twelve};
        MovieObject[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

}



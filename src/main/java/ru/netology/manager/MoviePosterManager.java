package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.MovieObject;


@AllArgsConstructor
@Data

public class MoviePosterManager {


    private MovieObject[] films = new MovieObject[0];
    private int numberFilms = 10;

    public MoviePosterManager() {

    }

    public MoviePosterManager(int numberFilms) {
        this.numberFilms = numberFilms;
    }

    //Добавление фильмов
    public void add(MovieObject film) {
        //Создаём новый массив на 1цу больше
        int length = films.length + 1;
        MovieObject[] tmp = new MovieObject[length];
        //Копируем по фильму
        System.arraycopy(films, 0, tmp, 0, films.length);
        //Закладываем последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;

    }

    // Метод получения последних фильмов
    public MovieObject[] getAll() {
        // вычисление правильного ожидаемого размера результирующего массива-ответа
        int resultLength = numberFilms;
        if (films.length <= resultLength) {
            resultLength = films.length;
        } else {
            resultLength = numberFilms;
        }
        // перебираем массив в порядке очерёдности,
        // но закладываем в результаты, в обратном порядке
        MovieObject[] result = new MovieObject[films.length];
        for (int i = 0; i < resultLength; i++) {
            int cell = films.length - i - 1;
            result[i] = films[cell];
        }
        return result;
    }

    //вывод всех фильмов в порядке добавления
    public MovieObject[] findAll() {
        MovieObject[] result = new MovieObject[films.length];
        System.arraycopy(films, 0, result, 0, result.length);
        return result;
    }


}

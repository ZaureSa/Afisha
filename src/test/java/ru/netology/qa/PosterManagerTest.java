package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void shouldAddFilms () {
        PosterManager manager = new PosterManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");


        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm () {
        PosterManager manager = new PosterManager();

        manager.addFilm("Вперед");

        String []expected = {"Вперед"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveFilms (){
        PosterManager manager = new PosterManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");


        String[]expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeFilms () {
        PosterManager manager = new PosterManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");


        String[]expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[]actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSevenFilms () {
        PosterManager manager = new PosterManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли.Мировой тур");
        manager.addFilm("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldAddFilmZero () {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastZero () {
        PosterManager manager = new PosterManager();

        String [] expected = {};
        String [] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
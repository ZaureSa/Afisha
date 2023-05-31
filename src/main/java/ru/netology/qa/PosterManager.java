package ru.netology.qa;

public class PosterManager {
    private String[] posters = new String[0];
    private int posterQuantity;

    public PosterManager() {
        this.posterQuantity = 5;
    }

    public PosterManager(int posterQuantity) {
        this.posterQuantity = posterQuantity;
    }

    public void addFilm(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int postersLimit;
        if (posters.length < posterQuantity) {
            postersLimit = posters.length;
        } else {
            postersLimit = posterQuantity;
        }
        String[] reversed = new String[postersLimit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }
}
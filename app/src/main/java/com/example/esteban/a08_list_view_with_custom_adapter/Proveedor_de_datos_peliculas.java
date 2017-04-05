package com.example.esteban.a08_list_view_with_custom_adapter;

/**
 * Created by esteban on 05/04/17.
 */

public class Proveedor_de_datos_peliculas {
    private int poster_pelicula;
    private String titulo_pelicula;
    private String raiting_pelicula;

    public Proveedor_de_datos_peliculas(int poster_pelicula, String titulo_pelicula, String raiting_pelicula) {
        this.poster_pelicula = poster_pelicula;
        this.titulo_pelicula = titulo_pelicula;
        this.raiting_pelicula = raiting_pelicula;
    }

    public int getPoster_pelicula() {
        return poster_pelicula;
    }

    public void setPoster_pelicula(int poster_pelicula) {
        this.poster_pelicula = poster_pelicula;
    }

    public String getTitulo_pelicula() {
        return titulo_pelicula;
    }

    public void setTitulo_pelicula(String titulo_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
    }

    public String getRaiting_pelicula() {
        return raiting_pelicula;
    }

    public void setRaiting_pelicula(String raiting_pelicula) {
        this.raiting_pelicula = raiting_pelicula;
    }
}

package com.example.esteban.a08_list_view_with_custom_adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esteban on 05/04/17.
 */

public class Adaptador_De_Datos_Peliculas extends ArrayAdapter {

    List lista = new ArrayList();


    static class Data_Handler{
        ImageView poster_pelicula;
        TextView titulo_pelicula;
        TextView rating_pelicula;
    }


    public Adaptador_De_Datos_Peliculas(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }


    @Override
    public void add(@Nullable Object object) {
        super.add(object);
        lista.add(object);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View fila = convertView;

        //Inicializamos el objeto de mi clase interna Dat_Hanlder
        Data_Handler data_handler = new Data_Handler();

        if(convertView == null){
            //La row no existe, tenemos que crear la row mediante la una class que la llame Data_Handler

            //creamos un objeto inflador de Layouts
            LayoutInflater inflador = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Inflamos la fila
            fila = inflador.inflate(R.layout.fila_layout, parent, false);




            //Inicializamos las variables de mi clase interna  apuntando a cada componente View.
            data_handler.poster_pelicula = (ImageView)fila.findViewById(R.id.imageview);
            data_handler.titulo_pelicula = (TextView) fila.findViewById(R.id.textview_nombre_pelicula);
            data_handler.rating_pelicula = (TextView) fila.findViewById(R.id.textview_rating_pelicula);

            //Attach los 3 componentes view a la fila
            fila.setTag(data_handler);

        } else if(convertView != null){
            //La row existe por ende no hay necesidad de crear la row nuevamente,entonces solo asigno los datos a la row
            data_handler = (Data_Handler) fila.getTag();
        }

        Proveedor_de_datos_peliculas proveedor_de_datos_peliculas;
        proveedor_de_datos_peliculas = (Proveedor_de_datos_peliculas) this.getItem(position);

        data_handler.poster_pelicula.setImageResource(proveedor_de_datos_peliculas.getPoster_pelicula());
        data_handler.titulo_pelicula.setText(proveedor_de_datos_peliculas.getTitulo_pelicula());
        data_handler.rating_pelicula.setText(proveedor_de_datos_peliculas.getRaiting_pelicula());

        return fila;
    }
}

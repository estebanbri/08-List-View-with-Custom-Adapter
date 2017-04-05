package com.example.esteban.a08_list_view_with_custom_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    int [] posters_peliculas = {R.drawable.matrix};
    String [] titulo_peliculas = {"Matrix"};
    String [] raiting_peliculas = {"Raiting 7.4/10"};

    Adaptador_De_Datos_Peliculas adaptador_personalizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciarlizar objeto de la clase ListView
        lv = (ListView) findViewById(R.id.mi_listView);

        //Inicializar adaptador_personalizado
        adaptador_personalizado = new Adaptador_De_Datos_Peliculas(this, R.layout.fila_layout);

        //Creacion de 10 objetos de tipo Proveedor_de_datos_pelicula
        int i = 0;
        for(String x : titulo_peliculas){
            Proveedor_de_datos_peliculas pddp = new Proveedor_de_datos_peliculas(posters_peliculas[i],titulo_peliculas[i],raiting_peliculas[i]);
            adaptador_personalizado.add(pddp);
            i++;
        }



        //Conecto el adaptador personalizado a mi ListView
        lv.setAdapter(adaptador_personalizado);
    }
}

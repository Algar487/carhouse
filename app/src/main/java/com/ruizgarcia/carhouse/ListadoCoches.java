package com.ruizgarcia.carhouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListadoCoches extends AppCompatActivity {

    ArrayList<Coche> listaCoches;
    RecyclerView recyclerCoches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listadocoches);
        getSupportActionBar().setTitle("Listado de coches");

        listaCoches=new ArrayList<>();
        recyclerCoches= (RecyclerView) findViewById(R.id.recyclerId);
        recyclerCoches.setLayoutManager(new LinearLayoutManager(this));

        llenarCoches();

        AdaptadorCoches adapter= new AdaptadorCoches(listaCoches);
        recyclerCoches.setAdapter(adapter);
    }

    private void llenarCoches() {
        listaCoches.add(new Coche("Porshe", "Carrera", "2050","2001","50cc","300c","25000",R.drawable.sold ));
        listaCoches.add(new Coche("Audi", "TT", "2050","2001","50cc","300c","25000",R.drawable.forsale ));

    }


    public void abrirPreferencias(View view) {

        Intent i = new Intent(this, ActividadPreferencias.class);
        startActivity(i);
    }

    public void abrirAnadirCoche(View view) {

        Intent i = new Intent(this, AnadirCoche.class);
        startActivity(i);
    }

    public void abrirEliminarCoche(View view) {

        Intent i = new Intent(this, EliminarCoche.class);
        startActivity(i);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu_principal) {
        getMenuInflater().inflate(R.menu.menu, menu_principal);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {
        int id = opcion_menu.getItemId();

        if (id == R.id.preferencias) {
            abrirPreferencias(null);
            return true;
        }
        if (id == R.id.añadir_coche) {
            abrirAnadirCoche(null);
            return true;
        }
        if (id == R.id.eliminar_coche) {
            abrirEliminarCoche(null);
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu);

    }


}

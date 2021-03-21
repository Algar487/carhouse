package com.ruizgarcia.carhouse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class EliminarCoche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eliminarcoche);
        getSupportActionBar().setTitle("Eliminar coche");
    }
}

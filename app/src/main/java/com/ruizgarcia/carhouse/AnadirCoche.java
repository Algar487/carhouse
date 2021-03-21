package com.ruizgarcia.carhouse;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnadirCoche extends AppCompatActivity {

    EditText textoModelo, textoAnio, textoKm, textoCC, textoCV, textoPrecio;
    CheckBox checkVendido;
    String textoMarca;
    Button botonGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anadircoche);
        getSupportActionBar().setTitle("Añadir coche");

        Spinner spinnerText=(Spinner) findViewById(R.id.spinnerOptions);
        textoMarca = spinnerText.getSelectedItem().toString();

        textoAnio=(EditText) findViewById(R.id.editTextAnio);
        textoKm=(EditText) findViewById(R.id.editTextKm);
        textoCC=(EditText) findViewById(R.id.editTextCC);
        textoCV=(EditText) findViewById(R.id.editTextCV);
        textoPrecio=(EditText) findViewById(R.id.editTextPrecio);
        botonGuardar=(Button) findViewById(R.id.botonGuardar);

        FeedReaderDbHelper dbHelper = new FeedReaderDbHelper(this);

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Gets the data repository in write mode
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                // Create a new map of values, where column names are the keys
                ContentValues values = new ContentValues();
                values.put(FeedReaderContract.FeedEntry.COLUMN_1, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_2, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_3, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_4, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_5, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_6, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_7, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_8, "usuario texto");
                values.put(FeedReaderContract.FeedEntry.COLUMN_9, "usuario texto");

                // Insert the new row, returning the primary key value of the new row
                long newRowId = db.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);

            }
        });

    }
}

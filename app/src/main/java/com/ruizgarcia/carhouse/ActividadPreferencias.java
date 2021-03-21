package com.ruizgarcia.carhouse;

import android.app.Activity;
import android.os.Bundle;


public class ActividadPreferencias extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new FragmentoPreferencias())
                .commit();
    }
}
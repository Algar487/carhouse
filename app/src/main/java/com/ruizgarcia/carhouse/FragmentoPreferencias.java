package com.ruizgarcia.carhouse;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class FragmentoPreferencias extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}


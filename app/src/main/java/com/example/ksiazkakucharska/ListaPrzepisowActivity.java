package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        int kategoria= getIntent().getIntExtra("kategoria",1);

    }
}
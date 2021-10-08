package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {
    private TextView tytulTextView;
    private ImageView imageView;
    private TextView skladnikiTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int id =(int)getIntent()
                .getIntExtra("idPrzepisu",
                        0);
        int kat=(int)getIntent()
                .getIntExtra("kategoria",
                        0);
        ArrayList <Przepis> wybrane
                =RepozytoriumPrzepisow.wybierz(kat);
        Przepis wyswietlanyPrzepis= wybrane.get(id);
        tytulTextView = (TextView) findViewById(R.id.textView3);
        tytulTextView
                .setText(wyswietlanyPrzepis.getNazwa());
        imageView =(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(
                wyswietlanyPrzepis.getIdObrazka());
        imageView.setContentDescription(
                wyswietlanyPrzepis.getNazwa());
        skladnikiTextView =
                (TextView) findViewById(R.id.textView6);
        skladnikiTextView
                .setText(wyswietlanyPrzepis.getSkladniki());
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent wyslijIntent=new Intent();
                        wyslijIntent.setAction(Intent.ACTION_SEND);
                        wyslijIntent.setType("text/plain");
                        wyslijIntent.putExtra("skladniki",
                                wyswietlanyPrzepis.getSkladniki());
                        Intent wybieraczIntent = Intent
                                .createChooser(wyslijIntent,
                                wyswietlanyPrzepis.getNazwa());
                        startActivity(wybieraczIntent);
                    }
                }
        );
    }
}
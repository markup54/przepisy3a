package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaPrzepisowActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        int kategoria= getIntent().getIntExtra("kategoria",1);
        String nazwa_kat= getIntent()
                        .getStringExtra("nazwa_kategorii");
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(nazwa_kat);
        ArrayAdapter <Przepis> przepisArrayAdapter
                =new ArrayAdapter<Przepis>(
                        this,
                android.R.layout.simple_list_item_1,
                RepozytoriumPrzepisow.wybierz(kategoria)
        );
        ListView przepisyListView =
                (ListView) findViewById(R.id.listView2);
        przepisyListView.setAdapter(przepisArrayAdapter);
        AdapterView.OnItemClickListener
                itemClickListener
                = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                Intent intent = new Intent(
                        ListaPrzepisowActivity.this,
                        PrzepisActivity.class
                );
                intent.putExtra("idPrzepisu",i);
                intent.putExtra("kategoria",kategoria);
                startActivity(intent);
            }
        };
        przepisyListView
                .setOnItemClickListener(itemClickListener);
    }
}
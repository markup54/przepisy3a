package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener wybrany
                = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int i,
                                    long l) {
                //i który element kliknięto

                Intent intent = new Intent(
                        MainActivity.this,
                        ListaPrzepisowActivity.class);
                intent.putExtra("kategoria",i);
                String kat = (String) adapterView.getItemAtPosition(i);
                intent.putExtra("nazwa_kategorii",kat);
                startActivity(intent);
            }
        };
        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setOnItemClickListener(wybrany);
    }
}
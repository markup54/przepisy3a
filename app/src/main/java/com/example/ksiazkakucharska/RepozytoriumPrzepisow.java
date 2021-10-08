package com.example.ksiazkakucharska;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    public static final Przepis[] przepisy = {
            new Przepis("muffinki",
                    3,
                    "mąka, mleko,olej kako,czekolada,budyń",
                    R.drawable.muffinki),
            new Przepis("pączusie",
                    3,
                    "drożdże, mąka,mleko,masło",
                    R.drawable.paczki
            )
    };
    public static ArrayList<Przepis> wybierz(int kategoria)
    {
        ArrayList<Przepis> wybrane = new ArrayList<>();
        for(Przepis przepisik : przepisy)
        {
            if(przepisik.getKategoria() == kategoria)
            { wybrane.add(przepisik); }
        }
        return wybrane;
    }
}

package com.example.bruna.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listaSignos;
    private String [] signos ={
      "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
            "Libras", "Escorpião", "Sargitário", "Capricónio", "Aquário",
            "Peixes"
    };

    private  String [] perfis = {
            "Impulsivo, o ariano não pensa muito sobre seus atos.",
            "Teimoso, o taurino é determinado e protetor.",
            "Espontâneo e um pouco instável.",
            "Família é a palavra-chave para o canceriano.",
            "O leonino gosta de chamar a atenção e ser o centro do mundo.",
            "Tímido, prefere programas tranquilos a grandes eventos.",
            "O libriano gosta do que é belo e harmonioso.",
            "Determinado, o escorpiano vai até o fim para conquistar os seus objetivos.",
            "Um signo de bem com a vida, que está sempre em busca de ação e que vive rodeado de amigos.",
            "Com paciência, ele se mostra um amigo leal e um companheiro fiel.",
            "Independente, o aquariano preza muito por sua liberdade.",
            "Sensível e carinhoso, acredita em contos de fadas e acha que todos merecem um final feliz."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listiViewId);
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);
        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(),perfis [codigoPosicao], Toast.LENGTH_LONG).show();

            }
        });
    }
}

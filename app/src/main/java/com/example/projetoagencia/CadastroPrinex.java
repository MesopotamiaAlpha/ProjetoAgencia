package com.example.projetoagencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CadastroPrinex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnSalvar = findViewById(R.id.btnSalvar);
        TextView lblTexto = findViewById(R.id.lblTexto);
        RecyclerView recyclerLista = findViewById(R.id.recyclerLista);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_prinex);
    }
}
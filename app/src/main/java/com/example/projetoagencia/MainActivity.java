package com.example.projetoagencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnprinex = findViewById(R.id.btnPrinex);
        btnprinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(MainActivity.this, CadastroPrinex.class);
                Toast.makeText(getApplicationContext(), "Clicado no botão Prinex",Toast.LENGTH_LONG).show();
                startActivity(tela);
            }
        });

    }
}
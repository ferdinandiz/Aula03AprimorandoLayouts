package com.fer.aula03_aprimorandolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ApertaActivity extends AppCompatActivity {
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn_apertado);

        btnVoltar = findViewById(R.id.button);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ApertaActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
package com.app.partner.dlv.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.partner.dlv.R;

public class RegistrarActivity extends AppCompatActivity {

    TextView textViewIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        textViewIniciarSesion = findViewById(R.id.textViewIiniciarSesionRegistrar);
        textViewIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegistrar = new Intent(RegistrarActivity.this, LoginActivity.class);
                intentRegistrar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intentRegistrar);
            }
        });
    }
}

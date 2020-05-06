package com.app.partner.dlv.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.partner.dlv.R;

public class LoginActivity extends AppCompatActivity {

    Button buttonIngresar;
    TextView textViewRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonIngresar = findViewById(R.id.buttonIngresarLogin);
        textViewRegistrar = findViewById(R.id.textViewRegistrarLogin);

        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        textViewRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegistrar = new Intent(LoginActivity.this, RegistrarActivity.class);
                startActivity(intentRegistrar);
            }
        });
    }
}

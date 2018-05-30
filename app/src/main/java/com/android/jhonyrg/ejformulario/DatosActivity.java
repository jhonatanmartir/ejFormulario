package com.android.jhonyrg.ejformulario;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {
    TextView dNombre;
    TextView dApellido;
    TextView dEmail;
    TextView dPass;
    Button dAceptar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        this.dNombre = findViewById(R.id.txtvNombre);
        this.dApellido = findViewById(R.id.txtvApellido);
        this.dEmail = findViewById(R.id.txtvEmail);
        this.dPass = findViewById(R.id.txtvPass);
        this.dAceptar = findViewById(R.id.btnAceptar);

        this.dNombre.setText(getIntent().getStringExtra("nombre"));
        this.dApellido.setText(getIntent().getStringExtra("apellido"));
        this.dEmail.setText(getIntent().getStringExtra("email"));
        this.dPass.setText(getIntent().getStringExtra("pass"));

        this.dAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

package com.android.jhonyrg.ejformulario;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextInputEditText nombre;
    TextInputEditText apellido;
    TextInputEditText correo;
    TextInputEditText pass;
    Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nombre = findViewById(R.id.etxtNombre);
        this.apellido = findViewById(R.id.etxtApellido);
        this.correo = findViewById(R.id.etxtCorreo);
        this.pass = findViewById(R.id.etxtPass);
        this.registrar = findViewById(R.id.btnRegistrar);

        /*this.nombre.setError(getString(R.string.errorNames));
        this.nombre.setError(null);
        this.apellido.setError(getString(R.string.errorNames));
        this.apellido.setError(null);
        this.correo.setError(getString(R.string.errorEmail));
        this.correo.setError(null);
        this.pass.setError(getString(R.string.errorNames));
        this.pass.setError(null);*/

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DatosActivity.class);
                i.putExtra("nombre", nombre.getText().toString());
                i.putExtra("apellido", apellido.getText().toString());
                i.putExtra("email", correo.getText().toString());
                i.putExtra("pass", pass.getText().toString());
                startActivity(i);
                //Toast.makeText(MainActivity.this, "Nombre: " + nombre.getText().toString() + " " + apellido.getText().toString() + "Correo: " + correo.getText().toString() + "Pass: " + pass.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

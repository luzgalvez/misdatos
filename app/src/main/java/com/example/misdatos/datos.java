package com.example.misdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class datos extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    String mNombre, mEmail, mTelefono;

    //variable de los campos de texto
    EditText txtNombre, txtEmail, txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        sharedPreferences=getSharedPreferences("misDatos", Context.MODE_PRIVATE);

        mNombre=sharedPreferences.getString("nombre", "");
        mEmail=sharedPreferences.getString("email", "");
        mTelefono=sharedPreferences.getString("telefono", "");

        txtNombre=findViewById(R.id.nombre);
        txtEmail=findViewById(R.id.email);
        txtTelefono=findViewById(R.id.telefono);

        txtNombre.setText(mNombre);
        txtEmail.setText(mEmail);
        txtTelefono.setText(mTelefono);


    }

    public void guardaDatos(View view){
        if(view.getId() == R.id.buttonluz) {
            SharedPreferences.Editor editor=sharedPreferences.edit();

            editor.putString("nombre", txtNombre.getText().toString());
            editor.putString("email",txtEmail.getText().toString());
            editor.putString("telefono",txtTelefono.getText().toString());
            editor.commit();
            Toast.makeText(this, "se guardaron los datos", Toast.LENGTH_LONG).show();
        }
    }
}

package com.example.misdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class otroMActivity extends AppCompatActivity {
public Button nuevoboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otroamain);

        nuevoboton = findViewById(R.id.button3);

        nuevoboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(otroMActivity.this, datos.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Hoola",Toast.LENGTH_LONG).show();

            }

        });
    }


    public void CambiarActivity(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.misDatos:
                Toast.makeText(this, "CambiarActivity", Toast.LENGTH_LONG).show();
                miIntent=new Intent(otroMActivity.this,datos.class);
                if (miIntent != null) {
                    startActivity(miIntent);
                }
                break;

        }


    }
}

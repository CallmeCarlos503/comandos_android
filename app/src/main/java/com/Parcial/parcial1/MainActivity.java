package com.Parcial.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn_ej1);
        btn2=findViewById(R.id.btn_ej2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallas("ejercicio1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallas("ejercicio2");
            }
        });
    }

    public void pantallas(String msj){
        Intent intentar= new Intent();
        if (msj.equals("ejercicio1")){
             intentar= new Intent(this,ejercicio1.class);
        } else if (msj.equals("ejercicio2")) {
             intentar= new Intent(this,ejercicio2.class);
        }
        startActivity(intentar);
    }
}
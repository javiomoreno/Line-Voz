package com.example.javier.linevoz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
    }

    public void onClickIniciarSesion(View v){
        finish();
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }
}

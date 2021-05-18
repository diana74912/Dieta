package com.example.dieta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btngoogle, btnyoutube1,btnusuario;
    Button btnIngresar, Comida,Salir,Cuidados;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btngoogle = findViewById(R.id.btngoogle);
        btnyoutube1 = findViewById(R.id.btnyoutube);
        mp= MediaPlayer.create(this,R.raw.click);
        btnusuario=findViewById(R.id.btnUsuario);
        btnIngresar=findViewById(R.id.btnIngresar);
        Comida=findViewById(R.id.btnComida);
        Salir=findViewById(R.id.btnSalir);
        Cuidados=findViewById(R.id.btnCuidados);


        //Comida
        Comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,Comida.class);
                startActivity(inten);

            }
        });
        //Ingresar
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,Ingresar.class);
                startActivity(inten);

            }
        });
        //Cuidados
        Cuidados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,Cuidados.class);
                startActivity(inten);

            }
        });
        //Usuario
        btnusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,Usuario.class);
                startActivity(inten);

            }
        });
        //salir
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });




    }

    public void google(View view){
        mp.start();

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thecatsmile.com/que-comen-perros-alimentacion-adecuada-mascota/"));
        startActivity(i);
    }
    public void youtube(View view){
        mp.start();

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9IGiISDAlKc"));
        startActivity(i);
    }
}









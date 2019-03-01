package com.videos.luisdalopez56.surface01;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl;
    SurfaceView sv;
    Button btn;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = findViewById(R.id.relative2);
        sv = new SurfaceView(this);

        //CREACION DE PARAMETROS 1
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params.topMargin = 40;
        sv.setLayoutParams(params);
        sv.setBackgroundColor(Color.argb(255,30,144,255));

        //CREACION DE PARAMETROS 2

        RelativeLayout.LayoutParams paramsTexto = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTexto.addRule(RelativeLayout.CENTER_HORIZONTAL);
        paramsTexto.topMargin = 75;

        //CREACION DE PARAMETROS 3

        RelativeLayout.LayoutParams paramsBoton = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsBoton.addRule(RelativeLayout.CENTER_IN_PARENT);
        paramsBoton.topMargin = 75;

        //TEXTO
        texto = new TextView(this);
        texto.setTextColor(Color.WHITE);
        texto.setTypeface(Typeface.DEFAULT_BOLD);
        texto.setTextSize(18);
        texto.setText("CREADO EN JAVA");
        texto.setLayoutParams(paramsTexto);

        //BOTON
        btn = new Button(this);
        btn.setText("PULSA PARA MENSAJE");
        btn.setLayoutParams(paramsBoton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"BOTON PULSADO", Toast.LENGTH_SHORT).show();
            }
        });

        //AÑADIR A VISTA
        rl.addView(sv);
        rl.addView(texto);
        rl.addView(btn);




    }
}

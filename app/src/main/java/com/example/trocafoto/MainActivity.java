package com.example.trocafoto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivFoto;
    private TextView tvNome;
    private ConstraintLayout fundoTela;

    private int[] fotosArray = {
            R.drawable.foto0,
            R.drawable.foto1,
            R.drawable.foto2,
            R.drawable.foto3,
            R.drawable.foto4,
            R.drawable.foto5
    };

    private String[] nomesArray ={
            "Ninguem",
            "João da Silva",
            "Paulo Moraes",
            "Ângelo Marques",
            "Mônica Nunes",
            "Ana Lopes"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFoto = findViewById(R.id.imageFoto);
        tvNome = findViewById(R.id.textNome);
        fundoTela = findViewById(R.id.LayFundo);

        ivFoto.setImageResource(fotosArray[0]);
        tvNome.setText(nomesArray[0]);






        fundoTela.setOnTouchListener(new OnSwipeTouchListener(this) {

            @Override
            public void onSwipeLeft()
            {
                tvNome.setText(nomesArray[1]);
                ivFoto.setImageResource(fotosArray[1]);

            }

             @Override
             public void onSwipeRight()
             {
                 tvNome.setText(nomesArray[2]);
                 ivFoto.setImageResource(fotosArray[2]);

             }


        }
        );


    }
}
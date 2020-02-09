package com.pengenalan.sukubudayajawa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.menu_pakaianadat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, PakaianadatActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_rumahadat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, RumahadatActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_senjataadat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, SenjataadatActivity.class);
                startActivity(intent);
            }
        });

    }
}

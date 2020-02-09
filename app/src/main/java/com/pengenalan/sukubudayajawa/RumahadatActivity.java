package com.pengenalan.sukubudayajawa;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RumahadatActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show, hide, pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahadat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_rumahadat);
        show = (ImageButton) findViewById(R.id.raaceh);
        hide = (ImageButton) findViewById(R.id.rasumaterautara);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        // Untuk menambahkan Button Suara
        final MediaPlayer SuaraRaaceh = MediaPlayer.create(this, R.raw.ra_aceh);
        final MediaPlayer SuaraRasumaterautara = MediaPlayer.create(this, R.raw.ra_sumatrautara);
        final MediaPlayer SuaraRasumaterabarat = MediaPlayer.create(this, R.raw.ra_sumatrabarat);
        final MediaPlayer SuaraRariau = MediaPlayer.create(this, R.raw.ra_riau);
        final MediaPlayer SuaraRakepriau = MediaPlayer.create(this, R.raw.ra_kepriau);
        final MediaPlayer SuaraRasumateraselatan = MediaPlayer.create(this, R.raw.ra_sumatraselatan);
        final MediaPlayer SuaraRabangkabelitung = MediaPlayer.create(this, R.raw.ra_bangkabelitung);
        final MediaPlayer SuaraRabengkulu = MediaPlayer.create(this, R.raw.ra_bengkulu);
        final MediaPlayer SuaraRalampung = MediaPlayer.create(this, R.raw.ra_lampung);
        final MediaPlayer SuaraRadkijakarta = MediaPlayer.create(this, R.raw.ra_dkijakarta);
        final MediaPlayer SuaraRajawabarat = MediaPlayer.create(this, R.raw.ra_jawabarat);
        final MediaPlayer SuaraRabanten = MediaPlayer.create(this, R.raw.ra_banten);
        final MediaPlayer SuaraRajawatengah = MediaPlayer.create(this, R.raw.ra_jawatengah);
        final MediaPlayer SuaraRadiyogyakarta = MediaPlayer.create(this, R.raw.ra_diyogyakarta);
        final MediaPlayer SuaraRajawatimur = MediaPlayer.create(this, R.raw.ra_jawatimur);
        final MediaPlayer SuaraRabali = MediaPlayer.create(this, R.raw.ra_bali);
        final MediaPlayer SuaraRaNTB = MediaPlayer.create(this, R.raw.ra_ntb);
        final MediaPlayer SuaraRaNTT = MediaPlayer.create(this, R.raw.ra_ntt);
        final MediaPlayer SuaraRakalimantanbarat = MediaPlayer.create(this, R.raw.ra_kalimantanbarat);
        final MediaPlayer SuaraRakalimantantengah = MediaPlayer.create(this, R.raw.ra_kalimantantengah);
        final MediaPlayer SuaraRakalimantanselatan = MediaPlayer.create(this, R.raw.ra_kalimantanselatan);
        final MediaPlayer SuaraRakalimantantimur = MediaPlayer.create(this, R.raw.ra_kalimantantimur);
        final MediaPlayer SuaraRasulawesiutara = MediaPlayer.create(this, R.raw.ra_sulawesiutara);
        final MediaPlayer SuaraRagorontalo = MediaPlayer.create(this, R.raw.ra_gorontalo);
        final MediaPlayer SuaraRasulawesitengah = MediaPlayer.create(this, R.raw.ra_sulawesitengah);
        final MediaPlayer SuaraRasulawesibarat = MediaPlayer.create(this, R.raw.ra_sulawesibarat);
        final MediaPlayer SuaraRasulawesiselatan = MediaPlayer.create(this, R.raw.ra_sulawesiselatan);
        final MediaPlayer SuaraRasulawesitenggara = MediaPlayer.create(this, R.raw.ra_sulawesitenggara);
        final MediaPlayer SuaraRamalukuutara = MediaPlayer.create(this, R.raw.ra_malukuutara);
        final MediaPlayer SuaraRamaluku = MediaPlayer.create(this, R.raw.ra_maluku);
        final MediaPlayer SuaraRapapuabarat = MediaPlayer.create(this, R.raw.ra_papuabarat);
        final MediaPlayer SuaraRapapua = MediaPlayer.create(this, R.raw.ra_papua);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.raaceh);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.rasumaterautara);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.rasumaterabarat);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.rariau);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.rakepriau);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.rasumateraselatan);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.rabangkabelitung);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.rabengkulu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ralampung);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.radkijakarta);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.rajawabarat);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.rabanten);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.rajawatengah);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.radiyogyakarta);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.rajawatimur);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.rabali);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.raNTB);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.raNTT);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.rakalimantanbarat);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.rakalimantantengah);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.rakalimantanselatan);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.rakalimantantimur);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.rasulawesiutara);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.ragorontalo);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.rasulawesitengah);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.rasulawesibarat);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.rasulawesiselatan);
        ImageButton ButtonSuara29 = (ImageButton) this.findViewById(R.id.rasulawesitenggara);
        ImageButton ButtonSuara30 = (ImageButton) this.findViewById(R.id.ramalukuutara);
        ImageButton ButtonSuara31 = (ImageButton) this.findViewById(R.id.ramaluku);
        ImageButton ButtonSuara32 = (ImageButton) this.findViewById(R.id.rapapuabarat);
        ImageButton ButtonSuara33 = (ImageButton) this.findViewById(R.id.rapapua);

        // Menghidupkan suara
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_aceh);
                TampilGambar.startAnimation(animScale);
                SuaraRaaceh.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sumaterautara);
                TampilGambar.startAnimation(animScale);
                SuaraRasumaterautara.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sumaterabarat);
                TampilGambar.startAnimation(animScale);
                SuaraRasumaterabarat.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_riau);
                TampilGambar.startAnimation(animScale);
                SuaraRariau.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_kepriau);
                TampilGambar.startAnimation(animScale);
                SuaraRakepriau.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sumateraselatan);
                TampilGambar.startAnimation(animScale);
                SuaraRasumateraselatan.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_bangkabelitung);
                TampilGambar.startAnimation(animScale);
                SuaraRabangkabelitung.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_bengkulu);
                TampilGambar.startAnimation(animScale);
                SuaraRabengkulu.start();
            }
        });

        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_lampung);
                TampilGambar.startAnimation(animScale);
                SuaraRalampung.start();
            }
        });

        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_dkijakarta);
                TampilGambar.startAnimation(animScale);
                SuaraRadkijakarta.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_jawabarat);
                TampilGambar.startAnimation(animScale);
                SuaraRajawabarat.start();
            }
        });

        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_banten);
                TampilGambar.startAnimation(animScale);
                SuaraRabanten.start();
            }
        });

        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_jawatengah);
                TampilGambar.startAnimation(animScale);
                SuaraRajawatengah.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_diyogyakarta);
                TampilGambar.startAnimation(animScale);
                SuaraRadiyogyakarta.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_jawatimur);
                TampilGambar.startAnimation(animScale);
                SuaraRajawatimur.start();
            }
        });

        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_bali);
                TampilGambar.startAnimation(animScale);
                SuaraRabali.start();
            }
        });

        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_ntb);
                TampilGambar.startAnimation(animScale);
                SuaraRaNTB.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_ntt);
                TampilGambar.startAnimation(animScale);
                SuaraRaNTT.start();
            }
        });

        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_kalimantanbarat);
                TampilGambar.startAnimation(animScale);
                SuaraRakalimantanbarat.start();
            }
        });

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_kalimantantengah);
                TampilGambar.startAnimation(animScale);
                SuaraRakalimantantengah.start();
            }
        });

        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_kalimantanselatan);
                TampilGambar.startAnimation(animScale);
                SuaraRakalimantanselatan.start();
            }
        });

        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_kalimantantimur);
                TampilGambar.startAnimation(animScale);
                SuaraRakalimantantimur.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sulawesiutara);
                TampilGambar.startAnimation(animScale);
                SuaraRasulawesiutara.start();
            }
        });

        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_gorontalo);
                TampilGambar.startAnimation(animScale);
                SuaraRagorontalo.start();
            }
        });

        ButtonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sulawesitengah);
                TampilGambar.startAnimation(animScale);
                SuaraRasulawesitengah.start();
            }
        });

        ButtonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sulawesibarat);
                TampilGambar.startAnimation(animScale);
                SuaraRasulawesibarat.start();
            }
        });

        ButtonSuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sulawesiselatan);
                TampilGambar.startAnimation(animScale);
                SuaraRasulawesiselatan.start();
            }
        });

        ButtonSuara29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_sulawesitenggara);
                TampilGambar.startAnimation(animScale);
                SuaraRasulawesitenggara.start();
            }
        });

        ButtonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_malukuutara);
                TampilGambar.startAnimation(animScale);
                SuaraRamalukuutara.start();
            }
        });

        ButtonSuara31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_maluku);
                TampilGambar.startAnimation(animScale);
                SuaraRamaluku.start();
            }
        });

        ButtonSuara32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_papuabarat);
                TampilGambar.startAnimation(animScale);
                SuaraRapapuabarat.start();
            }
        });

        ButtonSuara33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra_papua);
                TampilGambar.startAnimation(animScale);
                SuaraRapapua.start();
            }
        });
    }
}

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

public class SenjataadatActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show, hide, pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senjataadat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_senjataadat);
        show = (ImageButton) findViewById(R.id.staceh);
        hide = (ImageButton) findViewById(R.id.stsumaterautara);

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
        final MediaPlayer SuaraStaceh = MediaPlayer.create(this, R.raw.sd_aceh);
        final MediaPlayer SuaraStsumaterautara = MediaPlayer.create(this, R.raw.sd_sumatrautara);
        final MediaPlayer SuaraStsumaterabarat = MediaPlayer.create(this, R.raw.sd_sumatrabarat);
        final MediaPlayer SuaraStriau = MediaPlayer.create(this, R.raw.sd_riau);
        final MediaPlayer SuaraStkepriau = MediaPlayer.create(this, R.raw.sd_kepriau);
        final MediaPlayer SuaraStjambi = MediaPlayer.create(this, R.raw.sd_jambi);
        final MediaPlayer SuaraStsumateraselatan = MediaPlayer.create(this, R.raw.sd_sumatraselatan);
        final MediaPlayer SuaraStbangkabelitung = MediaPlayer.create(this, R.raw.sd_bangkabelitung);
        final MediaPlayer SuaraStbengkulu = MediaPlayer.create(this, R.raw.sd_bengkulu);
        final MediaPlayer SuaraStlampung = MediaPlayer.create(this, R.raw.sd_lampung);
        final MediaPlayer SuaraStdkijakarta = MediaPlayer.create(this, R.raw.sd_dkijakarta);
        final MediaPlayer SuaraStjawabarat = MediaPlayer.create(this, R.raw.sd_jawabarat);
        final MediaPlayer SuaraStbanten = MediaPlayer.create(this, R.raw.sd_banten);
        final MediaPlayer SuaraStjawatengah = MediaPlayer.create(this, R.raw.sd_jawatengah);
        final MediaPlayer SuaraStdiyogyakarta = MediaPlayer.create(this, R.raw.sd_diyogyakarta);
        final MediaPlayer SuaraStjawatimur = MediaPlayer.create(this, R.raw.sd_jawatimur);
        final MediaPlayer SuaraStbali = MediaPlayer.create(this, R.raw.sd_bali);
        final MediaPlayer SuaraStNTB = MediaPlayer.create(this, R.raw.sd_ntb);
        final MediaPlayer SuaraStNTT = MediaPlayer.create(this, R.raw.sd_ntt);
        final MediaPlayer SuaraStkalimantanbarat = MediaPlayer.create(this, R.raw.sd_kalimantanbarat);
        final MediaPlayer SuaraStkalimantantengah = MediaPlayer.create(this, R.raw.sd_kalimantantengah);
        final MediaPlayer SuaraStkalimantanselatan = MediaPlayer.create(this, R.raw.sd_kalimantanselatan);
        final MediaPlayer SuaraStkalimantantimur = MediaPlayer.create(this, R.raw.sd_kalimantantimur);
        final MediaPlayer SuaraStsulawesiutara = MediaPlayer.create(this, R.raw.sd_sulawesiutara);
        final MediaPlayer SuaraStgorontalo = MediaPlayer.create(this, R.raw.sd_gorontalo);
        final MediaPlayer SuaraStsulawesitengah = MediaPlayer.create(this, R.raw.sd_sulawesitengah);
        final MediaPlayer SuaraStsulawesibarat = MediaPlayer.create(this, R.raw.sd_sulawesibarat);
        final MediaPlayer SuaraStsulawesiselatan = MediaPlayer.create(this, R.raw.sd_sulawesiselatan);
        final MediaPlayer SuaraStsulawesitenggara = MediaPlayer.create(this, R.raw.sd_sulawesitenggara);
        final MediaPlayer SuaraStmalukuutara = MediaPlayer.create(this, R.raw.sd_malukuutara);
        final MediaPlayer SuaraStmaluku = MediaPlayer.create(this, R.raw.sd_maluku);
        final MediaPlayer SuaraStpapuabarat = MediaPlayer.create(this, R.raw.sd_papuabarat);
        final MediaPlayer SuaraStpapua = MediaPlayer.create(this, R.raw.sd_papua);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.staceh);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.stsumaterautara);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.stsumaterabarat);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.striau);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.stkepriau);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.stjambi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.stsumateraselatan);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.stbangkabelitung);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.stbengkulu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.stlampung);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.stdkijakarta);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.stjawabarat);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.stbanten);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.stjawatengah);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.stdiyogyakarta);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.stjawatimur);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.stbali);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.stNTB);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.stNTT);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.stkalimantanbarat);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.stkalimantantengah);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.stkalimantanselatan);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.stkalimantantimur);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.stsulawesiutara);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.stgorontalo);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.stsulawesitengah);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.stsulawesibarat);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.stsulawesiselatan);
        ImageButton ButtonSuara29 = (ImageButton) this.findViewById(R.id.stsulawesitenggara);
        ImageButton ButtonSuara30 = (ImageButton) this.findViewById(R.id.stmalukuutara);
        ImageButton ButtonSuara31 = (ImageButton) this.findViewById(R.id.stmaluku);
        ImageButton ButtonSuara32 = (ImageButton) this.findViewById(R.id.stpapuabarat);
        ImageButton ButtonSuara33 = (ImageButton) this.findViewById(R.id.stpapua);

        // Menghidupkan suara
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_aceh);
                TampilGambar.startAnimation(animScale);
                SuaraStaceh.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sumaterautara);
                TampilGambar.startAnimation(animScale);
                SuaraStsumaterautara.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sumaterabarat);
                TampilGambar.startAnimation(animScale);
                SuaraStsumaterabarat.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_riau);
                TampilGambar.startAnimation(animScale);
                SuaraStriau.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_kepriau);
                TampilGambar.startAnimation(animScale);
                SuaraStkepriau.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_jambi);
                TampilGambar.startAnimation(animScale);
                SuaraStjambi.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sumateraselatan);
                TampilGambar.startAnimation(animScale);
                SuaraStsumateraselatan.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_bangkabelitung);
                TampilGambar.startAnimation(animScale);
                SuaraStbangkabelitung.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_bengkulu);
                TampilGambar.startAnimation(animScale);
                SuaraStbengkulu.start();
            }
        });

        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_lampung);
                TampilGambar.startAnimation(animScale);
                SuaraStlampung.start();
            }
        });

        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_dkijakarta);
                TampilGambar.startAnimation(animScale);
                SuaraStdkijakarta.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_jawabarat);
                TampilGambar.startAnimation(animScale);
                SuaraStjawabarat.start();
            }
        });

        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_banten);
                TampilGambar.startAnimation(animScale);
                SuaraStbanten.start();
            }
        });

        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_jawatengah);
                TampilGambar.startAnimation(animScale);
                SuaraStjawatengah.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_diyogyakarta);
                TampilGambar.startAnimation(animScale);
                SuaraStdiyogyakarta.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_jawatimur);
                TampilGambar.startAnimation(animScale);
                SuaraStjawatimur.start();
            }
        });

        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_bali);
                TampilGambar.startAnimation(animScale);
                SuaraStbali.start();
            }
        });

        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_ntb);
                TampilGambar.startAnimation(animScale);
                SuaraStNTB.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_ntt);
                TampilGambar.startAnimation(animScale);
                SuaraStNTT.start();
            }
        });

        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_kalimantanbarat);
                TampilGambar.startAnimation(animScale);
                SuaraStkalimantanbarat.start();
            }
        });

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_kalimantantengah);
                TampilGambar.startAnimation(animScale);
                SuaraStkalimantantengah.start();
            }
        });

        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_kalimantanselatan);
                TampilGambar.startAnimation(animScale);
                SuaraStkalimantanselatan.start();
            }
        });

        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_kalimantantimur);
                TampilGambar.startAnimation(animScale);
                SuaraStkalimantantimur.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sulawesiutara);
                TampilGambar.startAnimation(animScale);
                SuaraStsulawesiutara.start();
            }
        });

        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_gorontalo);
                TampilGambar.startAnimation(animScale);
                SuaraStgorontalo.start();
            }
        });

        ButtonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sulawesitengah);
                TampilGambar.startAnimation(animScale);
                SuaraStsulawesitengah.start();
            }
        });

        ButtonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sulawesibarat);
                TampilGambar.startAnimation(animScale);
                SuaraStsulawesibarat.start();
            }
        });

        ButtonSuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sulawesiselatan);
                TampilGambar.startAnimation(animScale);
                SuaraStsulawesiselatan.start();
            }
        });

        ButtonSuara29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_sulawesitenggara);
                TampilGambar.startAnimation(animScale);
                SuaraStsulawesitenggara.start();
            }
        });

        ButtonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_malukuutara);
                TampilGambar.startAnimation(animScale);
                SuaraStmalukuutara.start();
            }
        });

        ButtonSuara31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_maluku);
                TampilGambar.startAnimation(animScale);
                SuaraStmaluku.start();
            }
        });

        ButtonSuara32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_papuabarat);
                TampilGambar.startAnimation(animScale);
                SuaraStpapuabarat.start();
            }
        });

        ButtonSuara33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.st_papua);
                TampilGambar.startAnimation(animScale);
                SuaraStpapua.start();
            }
        });

    }
}

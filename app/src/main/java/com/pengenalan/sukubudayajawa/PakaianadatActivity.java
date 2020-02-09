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

public class PakaianadatActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show, hide, pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaianadat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_pakaianadat);
        show = (ImageButton) findViewById(R.id.aceh);
        hide = (ImageButton) findViewById(R.id.sumaterautara);

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
        final MediaPlayer SuaraAceh = MediaPlayer.create(this, R.raw.pk_aceh);
        final MediaPlayer SuaraSumaterautara = MediaPlayer.create(this, R.raw.pk_sumatrautara);
        final MediaPlayer SuaraSumaterabarat = MediaPlayer.create(this, R.raw.pk_sumatrabarat);
        final MediaPlayer SuaraRiau = MediaPlayer.create(this, R.raw.pk_riau);
        final MediaPlayer SuaraKepriau = MediaPlayer.create(this, R.raw.pk_kepriau);
        final MediaPlayer SuaraJambi = MediaPlayer.create(this, R.raw.pk_jambi);
        final MediaPlayer SuaraSumateraselatan = MediaPlayer.create(this, R.raw.pk_sumatraselatan);
        final MediaPlayer SuaraBangkabelitung = MediaPlayer.create(this, R.raw.pk_bangkabelitung);
        final MediaPlayer SuaraBengkulu = MediaPlayer.create(this, R.raw.pk_bengkulu);
        final MediaPlayer SuaraLampung = MediaPlayer.create(this, R.raw.pk_lampung);
        final MediaPlayer SuaraDkijakarta = MediaPlayer.create(this, R.raw.pk_dkijakarta);
        final MediaPlayer SuaraJawabarat = MediaPlayer.create(this, R.raw.pk_jawabarat);
        final MediaPlayer SuaraBanten = MediaPlayer.create(this, R.raw.pk_banten);
        final MediaPlayer SuaraJawatengah = MediaPlayer.create(this, R.raw.pk_jawatengah);
        final MediaPlayer SuaraDiyogyakarta = MediaPlayer.create(this, R.raw.pk_diyogyakarta);
        final MediaPlayer SuaraJawatimur = MediaPlayer.create(this, R.raw.pk_jawatimur);
        final MediaPlayer SuaraBali = MediaPlayer.create(this, R.raw.pk_bali);
        final MediaPlayer SuaraNTB = MediaPlayer.create(this, R.raw.pk_ntb);
        final MediaPlayer SuaraNTT = MediaPlayer.create(this, R.raw.pk_ntt);
        final MediaPlayer SuaraKalimantanbarat = MediaPlayer.create(this, R.raw.pk_kalimantanbarat);
        final MediaPlayer SuaraKalimantantengah = MediaPlayer.create(this, R.raw.pk_kalimantantengah);
        final MediaPlayer SuaraKalimantanselatan = MediaPlayer.create(this, R.raw.pk_kalimantanselatan);
        final MediaPlayer SuaraKalimantantimur = MediaPlayer.create(this, R.raw.pk_kalimantantimur);
        final MediaPlayer SuaraSulawesiutara = MediaPlayer.create(this, R.raw.pk_sulawesiutara);
        final MediaPlayer SuaraGorontalo = MediaPlayer.create(this, R.raw.pk_gorontalo);
        final MediaPlayer SuaraSulawesitengah = MediaPlayer.create(this, R.raw.pk_sulawesitengah);
        final MediaPlayer SuaraSulawesibarat = MediaPlayer.create(this, R.raw.pk_sulawesibarat);
        final MediaPlayer SuaraSulawesiselatan = MediaPlayer.create(this, R.raw.pk_sulawesiselatan);
        final MediaPlayer SuaraSulawesitenggara = MediaPlayer.create(this, R.raw.pk_sulawesitenggara);
        final MediaPlayer SuaraMalukuutara = MediaPlayer.create(this, R.raw.pk_malukuutara);
        final MediaPlayer SuaraMaluku = MediaPlayer.create(this, R.raw.pk_maluku);
        final MediaPlayer SuaraPapuabarat = MediaPlayer.create(this, R.raw.pk_papuabarat);
        final MediaPlayer SuaraPapua = MediaPlayer.create(this, R.raw.pk_papua);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.aceh);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.sumaterautara);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.sumaterabarat);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.riau);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kepriau);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.jambi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.sumateraselatan);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.bangkabelitung);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.bengkulu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.lampung);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.dkijakarta);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.jawabarat);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.banten);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.jawatengah);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.diyogyakarta);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.jawatimur);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.bali);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.NTB);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.NTT);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.kalimantanbarat);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.kalimantantengah);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kalimantanselatan);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.kalimantantimur);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.sulawesiutara);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.gorontalo);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.sulawesitengah);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.sulawesibarat);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.sulawesiselatan);
        ImageButton ButtonSuara29 = (ImageButton) this.findViewById(R.id.sulawesitenggara);
        ImageButton ButtonSuara30 = (ImageButton) this.findViewById(R.id.malukuutara);
        ImageButton ButtonSuara31 = (ImageButton) this.findViewById(R.id.maluku);
        ImageButton ButtonSuara32 = (ImageButton) this.findViewById(R.id.papuabarat);
        ImageButton ButtonSuara33 = (ImageButton) this.findViewById(R.id.papua);

        // Menghidupkan suara
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.aceh);
                TampilGambar.startAnimation(animScale);
                SuaraAceh.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sumaterautara);
                TampilGambar.startAnimation(animScale);
                SuaraSumaterautara.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sumaterabarat);
                TampilGambar.startAnimation(animScale);
                SuaraSumaterabarat.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.riau);
                TampilGambar.startAnimation(animScale);
                SuaraRiau.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kepriau);
                TampilGambar.startAnimation(animScale);
                SuaraKepriau.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jambi);
                TampilGambar.startAnimation(animScale);
                SuaraJambi.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sumateraselatan);
                TampilGambar.startAnimation(animScale);
                SuaraSumateraselatan.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.bangkabelitung);
                TampilGambar.startAnimation(animScale);
                SuaraBangkabelitung.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.bengkulu);
                TampilGambar.startAnimation(animScale);
                SuaraBengkulu.start();
            }
        });

        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lampung);
                TampilGambar.startAnimation(animScale);
                SuaraLampung.start();
            }
        });

        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dkijakarta);
                TampilGambar.startAnimation(animScale);
                SuaraDkijakarta.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jawabarat);
                TampilGambar.startAnimation(animScale);
                SuaraJawabarat.start();
            }
        });

        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.banten);
                TampilGambar.startAnimation(animScale);
                SuaraBanten.start();
            }
        });

        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jawatengah);
                TampilGambar.startAnimation(animScale);
                SuaraJawatengah.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.diyogyakarta);
                TampilGambar.startAnimation(animScale);
                SuaraDiyogyakarta.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jawatimur);
                TampilGambar.startAnimation(animScale);
                SuaraJawatimur.start();
            }
        });

        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.bali);
                TampilGambar.startAnimation(animScale);
                SuaraBali.start();
            }
        });

        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ntb);
                TampilGambar.startAnimation(animScale);
                SuaraNTB.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ntt);
                TampilGambar.startAnimation(animScale);
                SuaraNTT.start();
            }
        });

        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kalimantanbarat);
                TampilGambar.startAnimation(animScale);
                SuaraKalimantanbarat.start();
            }
        });

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kalimantantengah);
                TampilGambar.startAnimation(animScale);
                SuaraKalimantantengah.start();
            }
        });

        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kalimantanselatan);
                TampilGambar.startAnimation(animScale);
                SuaraKalimantanselatan.start();
            }
        });

        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kalimantantimur);
                TampilGambar.startAnimation(animScale);
                SuaraKalimantantimur.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sulawesiutara);
                TampilGambar.startAnimation(animScale);
                SuaraSulawesiutara.start();
            }
        });

        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.gorontalo);
                TampilGambar.startAnimation(animScale);
                SuaraGorontalo.start();
            }
        });

        ButtonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sulawesitengah);
                TampilGambar.startAnimation(animScale);
                SuaraSulawesitengah.start();
            }
        });

        ButtonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sulawesibarat);
                TampilGambar.startAnimation(animScale);
                SuaraSulawesibarat.start();
            }
        });

        ButtonSuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sulawesiselatan);
                TampilGambar.startAnimation(animScale);
                SuaraSulawesiselatan.start();
            }
        });

        ButtonSuara29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sulawesitenggara);
                TampilGambar.startAnimation(animScale);
                SuaraSulawesitenggara.start();
            }
        });

        ButtonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.malukuutara);
                TampilGambar.startAnimation(animScale);
                SuaraMalukuutara.start();
            }
        });

        ButtonSuara31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.maluku);
                TampilGambar.startAnimation(animScale);
                SuaraMaluku.start();
            }
        });

        ButtonSuara32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.papuabarat);
                TampilGambar.startAnimation(animScale);
                SuaraPapuabarat.start();
            }
        });

        ButtonSuara33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.papua);
                TampilGambar.startAnimation(animScale);
                SuaraPapua.start();
            }
        });
    }
}

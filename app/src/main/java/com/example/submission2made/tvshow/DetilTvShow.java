package com.example.submission2made.tvshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.submission2made.R;


public class DetilTvShow extends AppCompatActivity {


    TextView tvJudulTv, tvDescTv, tvJamTayang;
    ImageView imageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_tv_show);



        tvJudulTv = (TextView) findViewById(R.id.judulTayanganTv);
        tvDescTv = (TextView) findViewById(R.id.tvDescTv);
        tvJamTayang = (TextView) findViewById(R.id.tv_respon_tanggal);

        imageTv = (ImageView)findViewById(R.id.imageTayanganTv);





        Intent intent = getIntent();

        TvShowBean tvShowBean = intent.getParcelableExtra("tvshow");

        String judul = tvShowBean.getTitleTv();

        String desc = tvShowBean.getDesc();
        String image = String.valueOf(tvShowBean.getImageTv());
        String jadwal = tvShowBean.getJadwalTv();



        tvJudulTv.setText(judul);
        tvDescTv.setText(desc);
        tvJamTayang.setText(jadwal);
        imageTv.setImageResource(Integer.parseInt(String.valueOf(image)));





//        Intent intent = getIntent();
//        TvShowBean tvShowBean = intent.getParcelableExtra("film");
//
//
//        String judul = tvShowBean.getTitleTv();
//        String image = String.valueOf(tvShowBean.getImageTv());
//        String jadwal = tvShowBean.getJadwal();
//        String desc = tvShowBean.getDesc();
//
//
//        tvJudulTv.setText(judul);
//        tvDescTv.setText(desc);
//        tvJamTayang.setText(jadwal);
//        imageTv.setImageResource(Integer.parseInt(image));




    }
}

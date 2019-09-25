package com.example.submission2made.film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.submission2made.R;

public class DetilFilm extends AppCompatActivity {


    TextView tvJudul, tvDesc, tvTanggal,tvRating;
    ImageView imageFilm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_film);


        tvJudul = (TextView) findViewById(R.id.judulFilm);
        tvDesc = (TextView) findViewById(R.id.descFilm);
        imageFilm = (ImageView)findViewById(R.id.imageFilm);

        tvTanggal = (TextView)findViewById(R.id.tv_respon_tanggal);
        tvRating = (TextView)findViewById(R.id.txt_respon_rating);


        Intent intent = getIntent();
        FilmBean filmBean = intent.getParcelableExtra("film");


        String judul = filmBean.getName();

        String desc = filmBean.getDescription();
        String image = String.valueOf(filmBean.getPhoto());
        String tanggal = filmBean.getJadwal();
        String rating = filmBean.getRating();


        tvJudul.setText(judul);
        tvDesc.setText(desc);
        imageFilm.setImageResource(Integer.parseInt(image));
        tvTanggal.setText(tanggal);
        tvRating.setText(rating);

//        String judul = intent.getStringExtra("nama");
//        String desc = intent.getStringExtra("desc");
//

//        tvJudul.setText(judul);
//        tvDesc.setText(desc);
//


    }
}

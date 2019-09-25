package com.example.submission2made.film;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.submission2made.R;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.MyViewHolder> {

    private ArrayList<FilmBean> listFilm;

    private Context context;

    public FilmAdapter(Context context,ArrayList<FilmBean> list) {
        this.context = context;
        this.listFilm = list;

    }

    public void setListFilm(ArrayList<FilmBean> film) {
        this.listFilm = film;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_film,viewGroup,false);
        return  new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {


        holder.txtName.setText(listFilm.get(position).getName());
        holder.imgPhoto.setImageResource(listFilm.get(position).getPhoto());
        holder.txtDesc.setText(listFilm.get(position).getDescription());
        holder.txtTanggal.setText(listFilm.get(position).getJadwal());
        holder.txtRating.setText(listFilm.get(position).getRating());


        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Like",Toast.LENGTH_LONG).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Share",Toast.LENGTH_LONG).show();
            }
        });
        holder.idConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,DetilFilm.class);
                i.putExtra("film",listFilm.get(position));
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, txtDesc, txtTanggal, txtPlace,txtRating;
        private ImageView imgPhoto;
        private ConstraintLayout idConstraint;
        private Button btnShare,btnLike;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            txtName = itemView.findViewById(R.id.txt_name);
            txtDesc = itemView.findViewById(R.id.txt_description);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            idConstraint = itemView.findViewById(R.id.id_constraint);
            btnShare = itemView.findViewById(R.id.button_bagikan);
            btnLike = itemView.findViewById(R.id.button_suka);
            txtTanggal = itemView.findViewById(R.id.txt_tanggal);
            txtRating = itemView.findViewById(R.id.rating);

        }
    }
}
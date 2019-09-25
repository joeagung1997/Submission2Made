package com.example.submission2made.tvshow;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.submission2made.R;

import java.util.ArrayList;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.MyViewHolder> {


    private ArrayList<TvShowBean> listTv;

    private Context context;

    public TvShowAdapter(Context context,ArrayList<TvShowBean> list) {
        this.context = context;
        this.listTv = list;

    }

    public void setListTv(ArrayList<TvShowBean> tvShow) {
        this.listTv = tvShow;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv_show,parent,false);
        return  new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.txtTitle.setText(listTv.get(position).getTitleTv());
        holder.imgTv.setImageResource(listTv.get(position).getImageTv());
        holder.tvDesc.setText(listTv.get(position).getDesc());
        holder.tvJadwal.setText(listTv.get(position).getJadwalTv());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,DetilTvShow.class);
                i.putExtra("tvshow",listTv.get(position));

                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listTv.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTitle,tvJadwal,tvDesc;
        private ImageView imgTv;
        private ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.text_view_title);
            imgTv = itemView.findViewById(R.id.img_photo_tv_show);
            tvJadwal = itemView.findViewById(R.id.text_view_jadwal);
            tvDesc = itemView.findViewById(R.id.text_view_desc);
            constraintLayout = itemView.findViewById(R.id.constrain_tv);

        }
    }
}
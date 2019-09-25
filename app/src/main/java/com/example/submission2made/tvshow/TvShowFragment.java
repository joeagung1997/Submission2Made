package com.example.submission2made.tvshow;


import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submission2made.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {


    private RecyclerView recyclerView;
    private ArrayList<TvShowBean> tvShowBean = new ArrayList<>();
    TvShowAdapter adapter;


    private String[] dataNameTv;
    private String[] dataDescriptionTv;
    private TypedArray dataPhotoTv;
    private String[] dataJadwalTayang;





    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataDescriptionTv = getResources().getStringArray(R.array.descTv);
        dataJadwalTayang = getResources().getStringArray(R.array.jamTayang);
        dataNameTv = getResources().getStringArray(R.array.judulTv);

        adapter  = new TvShowAdapter(getActivity(),tvShowBean);


        recyclerView = view.findViewById(R.id.rv_listTv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
//
//
//        filmBeans.addAll(FilmData.getListData());
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        FilmAdapter filmAdapter = new FilmAdapter(getActivity(),filmBeans);
//        recyclerView.setAdapter(filmAdapter);

        prepare();
        addItem();

//
//        recyclerView = view.findViewById(R.id.rv_listTv);
//        recyclerView.setHasFixedSize(true);
//
//
//        tvShowBean.addAll(TvShowData.getListDataTv());
//        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
//        TvShowAdapter tvShowAdapter = new TvShowAdapter(getActivity(),tvShowBean);
//        recyclerView.setAdapter(tvShowAdapter);

    }


    private void addItem() {
        tvShowBean = new ArrayList<>();
        for (int i = 0; i < dataNameTv.length; i++) {
            TvShowBean tvShow = new TvShowBean();
            tvShow.setImageTv(dataPhotoTv.getResourceId(i, -1));
            tvShow.setTitleTv(dataNameTv[i]);
            tvShow.setDesc(dataDescriptionTv[i]);
            tvShow.setJadwalTv(dataJadwalTayang[i]);
            tvShowBean.add(tvShow);
        }
        adapter.setListTv(tvShowBean);
    }

    private void prepare() {
        dataNameTv = getResources().getStringArray(R.array.judulTv);
        dataDescriptionTv = getResources().getStringArray(R.array.descTv);
        dataPhotoTv = getResources().obtainTypedArray(R.array.tvPhoto);
    }
}

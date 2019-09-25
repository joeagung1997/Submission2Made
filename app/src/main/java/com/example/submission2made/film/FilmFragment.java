package com.example.submission2made.film;


import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
public class FilmFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<FilmBean> filmBeans = new ArrayList<>();
    FilmAdapter adapter;


    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private String[] dataTglRelease;
    private String[] dataRating;

    Context context;

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        dataDescription = getResources().getStringArray(R.array.descFilm);
        dataTglRelease = getResources().getStringArray(R.array.jadwalFilm);
        dataRating = getResources().getStringArray(R.array.rating);

        adapter  = new FilmAdapter(getActivity(),filmBeans);


        recyclerView = view.findViewById(R.id.rv_listfilm);
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


    }

    private void addItem() {
        filmBeans = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            FilmBean filmBean = new FilmBean();
            filmBean.setPhoto(dataPhoto.getResourceId(i, -1));
            filmBean.setName(dataName[i]);
            filmBean.setDescription(dataDescription[i]);
            filmBean.setJadwal(dataTglRelease[i]);
            filmBean.setRating(dataRating[i]);
            filmBeans.add(filmBean);
        }
        adapter.setListFilm(filmBeans);
    }

    private void prepare() {
        dataName = getResources().getStringArray(R.array.nameFilm);
        dataDescription = getResources().getStringArray(R.array.descFilm);
        dataPhoto = getResources().obtainTypedArray(R.array.filmPhoto);
    }
}

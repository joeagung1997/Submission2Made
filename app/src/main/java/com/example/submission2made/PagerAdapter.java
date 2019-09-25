package com.example.submission2made;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.submission2made.film.FilmFragment;
import com.example.submission2made.tvshow.TvShowFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FilmFragment filmFragment = new FilmFragment();
                return filmFragment;
            case 1:
                TvShowFragment tvShowFragment = new TvShowFragment();
                return tvShowFragment;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

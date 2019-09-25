package com.example.submission2made.film;

import android.os.Parcel;
import android.os.Parcelable;

public class FilmBean implements Parcelable {

    private int photo;
    private String name;
    private String description;
    private String jadwal;
    private String place;
    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public FilmBean(int photo, String name, String description, String jadwal, String place, String rating) {
        this.photo = photo;
        this.name = name;
        this.description = description;
        this.jadwal = jadwal;
        this.place = place;
        this.rating = rating;
    }




    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public FilmBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.jadwal);
        dest.writeString(this.place);
        dest.writeString(this.rating);
    }

    protected FilmBean(Parcel in) {
        this.photo = in.readInt();
        this.name = in.readString();
        this.description = in.readString();
        this.jadwal = in.readString();
        this.place = in.readString();
        this.rating = in.readString();
    }

    public static final Creator<FilmBean> CREATOR = new Creator<FilmBean>() {
        @Override
        public FilmBean createFromParcel(Parcel source) {
            return new FilmBean(source);
        }

        @Override
        public FilmBean[] newArray(int size) {
            return new FilmBean[size];
        }
    };
}

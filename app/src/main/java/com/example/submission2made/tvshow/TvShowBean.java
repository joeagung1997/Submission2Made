package com.example.submission2made.tvshow;


import android.os.Parcel;
import android.os.Parcelable;

public class TvShowBean implements Parcelable {

    private int imageTv;
    private String titleTv;
    private String desc;
    private String jadwalTv;


    public TvShowBean(int imageTv, String titleTv, String desc, String jadwalTv) {
        this.imageTv = imageTv;
        this.titleTv = titleTv;
        this.desc = desc;
        this.jadwalTv = jadwalTv;
    }

    public TvShowBean() {

    }


    public int getImageTv() {
        return imageTv;
    }

    public void setImageTv(int imageTv) {
        this.imageTv = imageTv;
    }

    public String getTitleTv() {
        return titleTv;
    }

    public void setTitleTv(String titleTv) {
        this.titleTv = titleTv;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getJadwalTv() {
        return jadwalTv;
    }

    public void setJadwalTv(String jadwalTv) {
        this.jadwalTv = jadwalTv;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imageTv);
        dest.writeString(this.titleTv);
        dest.writeString(this.desc);
        dest.writeString(this.jadwalTv);
    }

    protected TvShowBean(Parcel in) {
        this.imageTv = in.readInt();
        this.titleTv = in.readString();
        this.desc = in.readString();
        this.jadwalTv = in.readString();
    }

    public static final Parcelable.Creator<TvShowBean> CREATOR = new Parcelable.Creator<TvShowBean>() {
        @Override
        public TvShowBean createFromParcel(Parcel source) {
            return new TvShowBean(source);
        }

        @Override
        public TvShowBean[] newArray(int size) {
            return new TvShowBean[size];
        }
    };
}

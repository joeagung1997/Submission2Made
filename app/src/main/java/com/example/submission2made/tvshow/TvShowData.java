package com.example.submission2made.tvshow;


import com.example.submission2made.R;

import java.util.ArrayList;

public class TvShowData {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.tv_show_poster_fairytail),"Fairy Tail","Natsu Dragneel dan teman-temannya melakukan perjalanan ke pulau Kerajaan Stella, di mana mereka akan mengungkapkan rahasia gelap, melawan musuh-musuh baru dan sekali lagi menyelamatkan dunia dari kehancuran.","09.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_god),"GOT","Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh.","20.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_supergirl),"Super Girl","Kara Zor El, 24 tahun, yang ditangkap oleh keluarga Danvers ketika dia berusia 13 tahun setelah diusir dari Krypton, harus belajar merangkul kekuatannya setelah sebelumnya menyembunyikannya.","08.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_supernatural),"Super Natural","Ketika mereka masih kecil, Sam dan Dean Winchester kehilangan ibu mereka karena kekuatan gaib yang misterius dan iblis. Selanjutnya, ayah mereka membesarkan mereka menjadi tentara.","21.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_doom_patrol),"Doom Patrol","Anggota Patroli Doom masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan manusia super  tetapi juga membuat mereka terluka dan cacat","22.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_dragon_ball),"Dragon Ball","Dragon Ball Z adalah serial televisi animasi Jepang yang diproduksi oleh Toei Animation. Dragon Ball Z adalah sekuel anime Dragon Ball dan mengadaptasi 26 volume terakhir dari seri manga Dragon Ball 42 volume asli yang dibuat oleh Akira Toriyama.","09.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_the_walking_dead),"The Walking Dead","Wakil Sheriff, Rick Grimes, terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu banyak penyintas lainnya di sepanjang jalan.","23.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_arrow),"Arrow","Playboy miliarder manja, Oliver Queen, hilang dan diduga tewas ketika kapal pesiarnya hilang di laut. Dia kembali lima tahun kemudian seorang pria yang berubah, bertekad untuk membersihkan kota sebagai main hakim sendiri bersenjatakan busur.","16.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_iron_fist),"Iron First","Danny Rand muncul kembali 15 tahun setelah dianggap mati. Sekarang, dengan kekuatan Iron Fist, ia berusaha untuk merebut kembali masa lalunya dan memenuhi takdirnya.","22.00 WIB"},
            {String.valueOf(R.drawable.tv_show_poster_flash),"The Flash","Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super," +
                    "memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya manusia meta yang diciptakan setelah ledakan akselerator  dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan.","20.00 WIB"}





    };

    public static ArrayList<TvShowBean> getListDataTv() {
        ArrayList<TvShowBean> list = new ArrayList<>();
        for (String[] aData : data) {
            TvShowBean tvShowBean = new TvShowBean();
            tvShowBean.setImageTv(Integer.parseInt(aData[0]));
            tvShowBean.setTitleTv(aData[1]);
            tvShowBean.setDesc(aData[2]);
            tvShowBean.setJadwalTv(aData[3]);


            list.add(tvShowBean);
        }

        return list;
    }
}
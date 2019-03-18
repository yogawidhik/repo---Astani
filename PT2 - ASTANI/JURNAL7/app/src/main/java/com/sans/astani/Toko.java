package com.sans.astani;

public class Toko {
    private int imageToko = -1;
    private String judul_toko;

    public Toko(int imageToko, String judul_toko) {
        this.imageToko = imageToko;
        this.judul_toko = judul_toko;
    }

    public int getImageToko() {
        return imageToko;
    }

    public boolean hasImage() {return imageToko != -1;}

    public String getJudul_toko() {
        return judul_toko;
    }
}

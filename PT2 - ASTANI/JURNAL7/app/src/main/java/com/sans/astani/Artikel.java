package com.sans.astani;

public class Artikel {
    private int imageResourceId = -1;
    private String judul_artikel;

    public Artikel(int imageResourceId, String judul_artikel) {
        this.imageResourceId = imageResourceId;
        this.judul_artikel = judul_artikel;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {return imageResourceId != -1;}

    public String getJudul_artikel() {
        return judul_artikel;
    }
}

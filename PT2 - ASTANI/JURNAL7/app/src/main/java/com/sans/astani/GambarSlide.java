package com.sans.astani;

public class GambarSlide {
    private int imageSlideId = -1;
    private String judul_gambar;

    public GambarSlide(int imageSlideId, String judul_gambar) {
        this.imageSlideId = imageSlideId;
        this.judul_gambar = judul_gambar;
    }

    public int getImageSlideId() {
        return imageSlideId;
    }
    public boolean hasImage() {return imageSlideId != -1;}

    public String getJudul_gambar() {
        return judul_gambar;
    }
}

package com.sans.astani;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GambarSliderAdapter extends RecyclerView.Adapter<GambarSliderAdapter.ViewHolder> {
    private Context mCont;
    private ArrayList<GambarSlide> mData;

    public GambarSliderAdapter(Context mCont, ArrayList<GambarSlide> mData) {
        this.mCont = mCont;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mCont).inflate(R.layout.swipe_layout,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GambarSlide gambarSlide = mData.get(i);
        viewHolder.judul_view.setText(gambarSlide.getJudul_gambar());
        viewHolder.gambar_view.setImageResource(gambarSlide.getImageSlideId());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView judul_view;
        ImageView gambar_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul_view = itemView.findViewById(R.id.text_view);
            gambar_view = itemView.findViewById(R.id.imageView);
            itemView.setClickable(true);
            itemView.setFocusable(true);
        }
    }
}

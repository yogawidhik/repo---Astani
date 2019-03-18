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

public class TokoAdapter extends RecyclerView.Adapter<TokoAdapter.ViewHolder> {
    private Context mCont;
    private ArrayList<Toko> mData;

    public TokoAdapter(Context mCont, ArrayList<Toko> mData) {
        this.mCont = mCont;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mCont).inflate(R.layout.list_vertical_toko,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Toko gambarSlide = mData.get(i);
        viewHolder.judul_view.setText(gambarSlide.getJudul_toko());
        viewHolder.gambar_view.setImageResource(gambarSlide.getImageToko());
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
            judul_view = itemView.findViewById(R.id.toko_text_view);
            gambar_view = itemView.findViewById(R.id.toko_gambar_view);
            itemView.setClickable(true);
            itemView.setFocusable(true);
        }
    }
}

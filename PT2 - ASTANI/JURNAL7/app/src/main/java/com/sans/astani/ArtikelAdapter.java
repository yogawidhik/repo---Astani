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

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder>{
    private Context mCont;
    private ArrayList<Artikel> mData;

    public ArtikelAdapter(Context mCont, ArrayList<Artikel> mData) {
        this.mCont = mCont;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mCont).inflate(R.layout.list_vertical_artikel,viewGroup,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Artikel artikel = mData.get(i);
        viewHolder.judul_view.setText(artikel.getJudul_artikel());
        viewHolder.gambar_view.setImageResource(artikel.getImageResourceId());

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
            judul_view = itemView.findViewById(R.id.artikel_text_view);
            gambar_view = itemView.findViewById(R.id.artikel_gambar_view);
            itemView.setClickable(true);
            itemView.setFocusable(true);

        }
    }
}

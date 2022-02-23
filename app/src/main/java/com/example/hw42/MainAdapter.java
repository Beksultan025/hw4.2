package com.example.hw42;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainAdapter.MainViewHolder> {

    public MainAdapter(ArrayList<String> mota_mota) {
        this.mota_mota = mota_mota;
    }

    private ArrayList<String> mota_mota;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(mota_mota.get(position));
    }

    @Override
    public int getItemCount() {
        return mota_mota.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        private TextView PERSON;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            PERSON = itemView.findViewById(R.id.bts_person);
        }

        public void bind(String s) {
            PERSON.setText(s);
        }
    }
}

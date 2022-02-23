package com.example.hw42;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private MainAdapter botAppter;
    private RecyclerView recycler;
    private ArrayList<String> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loudData();
        recycler = view.findViewById(R.id.Recycler);
        botAppter = new MainAdapter(data);
        recycler.setAdapter(botAppter);
    }

    private void loudData() {
        data = new ArrayList<>();
        data.add("070803040");
        data.add("998343432");
        data.add("213241241");
        data.add("214222223");
        data.add("070803040");
        data.add("070803040");
    }
}
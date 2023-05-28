package com.example.basiclogintoapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.basiclogintoapp.R;
import com.example.basiclogintoapp.adapter.RecyclerAdapter;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        // Sample data
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        int count = data.length;

        RecyclerAdapter adapter = new RecyclerAdapter(getContext(), data, count,data,data,data);
        recyclerView.setAdapter(adapter);

        return view;
    }
}


package com.hammersmith.thecambodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.hammersmith.thecambodia.adapter.PlaceAdapter;
import com.hammersmith.thecambodia.adapter.ProvinceAdapter;
import com.hammersmith.thecambodia.model.Place;

import java.util.ArrayList;
import java.util.List;

public class ProvinceActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ProvinceAdapter adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private List<Place> places = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("All Provinces");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ProvinceAdapter(this, places);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }
}

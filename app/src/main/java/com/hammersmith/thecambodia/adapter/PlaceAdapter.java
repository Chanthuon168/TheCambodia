package com.hammersmith.thecambodia.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hammersmith.thecambodia.R;
import com.hammersmith.thecambodia.model.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chan Thuon on 10/31/2016.
 */
public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.MyViewHolder> {
    private Context context;
    private Activity activity;
    private List<Place> places = new ArrayList<>();

    public PlaceAdapter(Activity activity, List<Place> places) {
        this.activity = activity;
        this.places = places;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_place, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}

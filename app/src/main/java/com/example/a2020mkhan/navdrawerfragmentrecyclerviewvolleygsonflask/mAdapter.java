package com.example.a2020mkhan.navdrawerfragmentrecyclerviewvolleygsonflask;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class mAdapter extends RecyclerView.Adapter<mAdapter.MyViewHolder> {

    private ArrayList<String> mArray;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public TextView t;
        public MyViewHolder(View v) {
            super(v);
            t = (TextView) v.findViewById(R.id.textView2);
        }
    }

    public mAdapter(ArrayList<String > a){
        mArray = a;
    }

    public mAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler, parent, false);

        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    public void onBindViewHolder(MyViewHolder holder, int position){
        String s = mArray.get(position);
        holder.t.setText(s);
    }


    public int getItemCount(){
        return mArray.size();
    }


}

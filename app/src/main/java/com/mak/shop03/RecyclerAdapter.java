package com.mak.shop03;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Макс on 16.05.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private  static  final int TYPE_HEAD = 0;
    private  static  final int TYPE_LIST = 1;

    ArrayList<Items> arrayList = new ArrayList;

    public RecyclerAdapter(ArrayList<Items> arrayList){
        this.arrayList = arrayList;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYPE_HEAD){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
            RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
            return recyclerViewHolder
        } } else if(viewT){

    }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;


    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Items items = arrayList.get(position);
        holder.Name.setText(items.getName();
        holder.Surname.setText(items.getSurname());
        holder.Address.setText(items.getAddress());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView Name, Surname, Address;
        public RecyclerViewHolder(View view){
            super(view);
            Name = (TextView) view.findViewById(R.id.name);
            Surname = (TextView) view.findViewById(R.id.surname);
            Address = (TextView) view.findViewById(R.id.address);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return TYPE_HEAD;
            return TYPE_LIST;
    }
}

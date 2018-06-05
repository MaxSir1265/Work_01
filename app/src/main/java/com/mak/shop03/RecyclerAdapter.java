package com.mak.shop03;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Макс on 29.05.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Items> listItems;
    private Context context;

    public RecyclerAdapter(List<Items> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Items items = listItems.get(position);

        holder.textViewPrice.setText(items.getPrice());
        holder.textViewName.setText(items.getName()+"\u20B4");

        Picasso.with(context)
                .load(items.getImageURL())
                .into(holder.imageView);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "Clicked "+items.getPrice(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, ProductFullInfo.class);
                intent.putExtra("imageURL",items.getImageURL());
                intent.putExtra("name",items.getName());
                intent.putExtra("price",items.getPrice());
                intent.putExtra("description", items.getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewPrice;
        public TextView textViewName;
        public ImageView imageView;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);


            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
            textViewName = (TextView) itemView.findViewById(R.id.testViewName);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewURL);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }

}

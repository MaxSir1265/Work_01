package com.mak.shop03;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Макс on 30.05.2018.
 */

public class ProductFullInfo extends AppCompatActivity {


    private static final String TAG = "ProductFullInfo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_full_info);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intent. ");
        if (getIntent().hasExtra("imageURL") && getIntent().hasExtra("name")){
            Log.d(TAG, "getIncomingIntent: found intent extras. ");

            String imageUrl = getIntent().getStringExtra("imageURL");
            String imageName = getIntent().getStringExtra("name");
            String imagePrice = getIntent().getStringExtra("price");
            String description = getIntent().getStringExtra("description");

            setImage(imageUrl, imageName, imagePrice, description);
        }
    }

    private void setImage(String imageURL, String Name, String Price, String Description){
        Log.d(TAG, "setImage: setting to widgets. ");

        TextView name = (TextView) findViewById(R.id.textFullPrice);
        name.setText(Name + "\u20B4");
        TextView price = (TextView) findViewById(R.id.textFullName);
        price.setText(Price);
        TextView description = (TextView) findViewById(R.id.textDescription);
        description.setText(Description);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewFull);
        Picasso.with(this)
                .load(imageURL)
                .into(imageView);
    }

}

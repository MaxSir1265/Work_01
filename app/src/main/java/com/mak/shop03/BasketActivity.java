package com.mak.shop03;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class BasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
    }

    public void onClickGoBack(View view){
//        Intent intent = new Intent(BasketActivity.this, Main.class);`
        finish();
    }

    public void onCLickMyOrder(View v){
        Intent intent = new Intent(BasketActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

}

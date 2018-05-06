package com.mak.shop03;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewSwitcher;

//import com.squareup.picasso.Picasso;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.net.URI;

import static com.mak.shop03.R.id.imageView;
import static com.mak.shop03.R.id.imageView1;

//import static com.mak.shop03.R.id.imageView;

public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static long back_pressed;


    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        ImageView iv = (ImageView) findViewById(R.id.imageView1);
//        iv.setImageResource(R.drawable.welcome);
//        setContentView(R.layout.activity_main);
//        setContentView(iv);

//        ImageView imageView = (ImageView) findViewById(R.id.imageView1);
//        imageView.setImageResource(R.drawable.welcome);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        ImageView iv1 = (ImageView) findViewById(imageView1);
//        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(iv1);


    }


    @Override
    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
        if (back_pressed + 2000 > System.currentTimeMillis()) super.onBackPressed();
        else Toast.makeText(getBaseContext(), "Нажмите еще раз для выхода!", Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_order) {
            // Handle the camera action
            Intent intent = new Intent(Main.this, MyOrderActivity.class);
            startActivity(intent);
        }   else if (id == R.id.nav_settings) {
            Intent intent = new Intent(Main.this, SettingsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String textToSend="Ссылка на мое приложение";
            intent.putExtra(Intent.EXTRA_TEXT, textToSend);
            try {
                startActivity(Intent.createChooser(intent, "Share this application"));
            }
            catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
            }
        } else if (id == R.id.nav_about) {
            Intent intent = new Intent(Main.this, AboutActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClickBasket(View view) {
//        view.animate()
//                .scaleXBy(05)
//                .setDuration(500)
//                .start();
        Intent intent = new Intent(Main.this, BasketActivity.class);
        startActivity(intent);
    }
    

}

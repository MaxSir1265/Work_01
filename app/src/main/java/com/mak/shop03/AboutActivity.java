package com.mak.shop03;

import android.app.VoiceInteractor;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView tv = (TextView) findViewById(R.id.textView6);
        tv.setText(Html.fromHtml(getResources().getString(R.string.my_link)));
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }



}

package com.mellon.justrandom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView mMainImage;
    ImageView mMainImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainImage = (ImageView) findViewById(R.id.mainImage);
        mMainImage2 = (ImageView) findViewById(R.id.mainImage2);

        Picasso.get().load("https://i.imgur.com/WiGmJJH.jpg").into(mMainImage);
        Picasso.get().load("https://i.imgur.com/Lb8lfeC.png").into(mMainImage2);
    }

    public void openButton1(View view) {
        Intent intent = new Intent(this, Page1.class);
        startActivity(intent);

    }

    public void openButton2(View view) {
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);

    }

}

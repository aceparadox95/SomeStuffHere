package com.mellon.justrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class Page1 extends AppCompatActivity {

    ImageView mMainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        mMainImage = (ImageView) findViewById(R.id.mainImage);

        Picasso.get().load("https://i.imgur.com/LobJYzq.jpg").into(mMainImage);

        mMainImage.setOnTouchListener(new OnSwipeTouchListener(this) {
            public void onSwipeTop() {
                newPicture1();
//                Toast.makeText(Page1.this, "top", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                newPicture2();
//                Toast.makeText(Page1.this, "right", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeLeft() {
                newPicture3();
//                Toast.makeText(Page1.this, "left", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeBottom() {
                newPicture4();
//                Toast.makeText(Page1.this, "bottom", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void newPicture1() {
        Picasso.get().load("https://i.imgur.com/mzjURJr.jpg").into(mMainImage);
    }
    private void newPicture2() {
        Picasso.get().load("https://i.imgur.com/7YIXzEz.jpg").into(mMainImage);
    }
    private void newPicture3() {
        Picasso.get().load("https://i.imgur.com/0QCcU0b.jpg").into(mMainImage);
    }
    private void newPicture4() {
        Picasso.get().load("https://i.imgur.com/FaqkeFO.jpg").into(mMainImage);
    }
}

package com.mellon.justrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class Page2 extends AppCompatActivity {

    ImageView mMainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        mMainImage = (ImageView) findViewById(R.id.mainImage);

        Picasso.get().load("https://static.boredpanda.com/blog/wp-content/uploads/2015/12/funny-animal-pictures-comedy-wildlife-photography-awards-28__880.jpg").into(mMainImage);

        mMainImage.setOnTouchListener(new OnSwipeTouchListener(this) {
            public void onSwipeTop() {
                newPicture1();
//                Toast.makeText(Page2.this, "top", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                newPicture2();
//                Toast.makeText(Page2.this, "right", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeLeft() {
                newPicture3();
//                Toast.makeText(Page2.this, "left", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeBottom() {
                newPicture4();
//                Toast.makeText(Page2.this, "bottom", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void newPicture1() {
        Picasso.get().load("https://animalstv.online/wp-content/uploads/2016/07/yt-9778-funny-animals-compilation-April-2015.jpg").into(mMainImage);
    }
    private void newPicture2() {
        Picasso.get().load("http://quotesnhumor.com/wp-content/uploads/2014/12/Top-25-Best-Funny-Animal-Pictures.jpg").into(mMainImage);
    }
    private void newPicture3() {
        Picasso.get().load("http://finest10.com/wp-content/uploads/2016/10/Top-35-Most-funniest-Animal-Memes-7-funny-humor.jpg").into(mMainImage);
    }
    private void newPicture4() {
        Picasso.get().load("https://dailylolpics.com/wp-content/uploads/2018/05/Funny-Animal-Pictures-Of-The-Day-24-05-2018-03.jpg").into(mMainImage);
    }
}

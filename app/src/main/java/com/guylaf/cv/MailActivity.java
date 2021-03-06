package com.guylaf.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        final ImageView telimage = (ImageView) findViewById(R.id.imagecv);
        Picasso.with(this).load(R.drawable.guy).fit().centerCrop().into(telimage);
    }
}

package com.guylaf.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        final ImageView telimage = (ImageView) findViewById(R.id.imagecv);
        Picasso.with(this).load(R.drawable.ictel).fit().centerCrop().into(telimage);
    }
}

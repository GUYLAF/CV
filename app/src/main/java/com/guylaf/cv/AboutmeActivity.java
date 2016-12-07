package com.guylaf.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        ImageView image = (ImageView) findViewById(R.id.imageAboutme);
        TextView displayTitle = (TextView) findViewById(R.id.textAboutme);
        displayTitle.setText("About me");

    }
}

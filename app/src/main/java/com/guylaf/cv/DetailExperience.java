package com.guylaf.cv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guyla on 07/12/2016.
 */

public class DetailExperience extends AppCompatActivity {
    final List<Experience> list1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailexperience);
        String libeldetailexp = getIntent().getStringExtra("Libeldetail");
        TextView displayDetail = (TextView) findViewById(R.id.libeldetail);
        displayDetail.setText(libeldetailexp);

    }
}

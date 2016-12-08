package com.guylaf.cv;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guyla on 07/12/2016.
 */

public class AdapterEducation extends BaseAdapter {
    private List<Education> list1 = new ArrayList<>();
    private Context context;

    public AdapterEducation(Context context) {
        this.context = context;
    }

    public void setList(List<Education> list1) {
        this.list1 = list1;
    }

    @Override
    public int getCount() {
        return list1.size();
    }

    @Override
    public Education getItem(int position) {
        return list1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater
                    .from(context)
                    .inflate(R.layout.activity_education, parent, false);
        }
        TextView libel = (TextView) convertView.findViewById(R.id.libel);
        libel.setText(list1.get(position).getLibel());

        return convertView;
    }
}

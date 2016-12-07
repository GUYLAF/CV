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

public class Adapter extends BaseAdapter {
    private List<Experience> list = new ArrayList<>();
    private Context context;

    public Adapter(Context context) {
        this.context = context;
    }

    public void setList(List<Experience> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Experience getItem(int position) {
        return list.get(position);
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
                    .inflate(R.layout.activity_experience, parent, false);
        }
        TextView libel = (TextView) convertView.findViewById(R.id.libel);
        libel.setText(list.get(position).getLibel());

        return convertView;
    }
}

package com.example.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] word;
    private int[] image;

public  MainAdapter(Context c,String[] word,int[] image){
    context =c;
    this.word = word;
    this.image = image;
}
    @Override
    public int getCount() {
        return word.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

    if (inflater == null){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    if (convertView == null){
        convertView = inflater.inflate((R.layout.row_item),null);
    }
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textView = convertView.findViewById(R.id.text);

        imageView.setImageResource(image[position]);
        textView.setText(word[position]);
        return convertView;
    }
}

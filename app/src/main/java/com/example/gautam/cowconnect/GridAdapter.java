package com.example.gautam.cowconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class GridAdapter extends BaseAdapter {

    private String[] letters;

    private int[] icons;

    private Context context;

    private LayoutInflater inflater=null;

    GridAdapter(CowConnect_GridViewIcons ccgvicon, String[] letterList, int[] lettersIcon)
    {
        this.context=ccgvicon;
        this.icons=lettersIcon;
        this.letters=letterList;

    }


    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int position) {
        return letters[position];
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if (convertView==null){

            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView=inflater.inflate(R.layout.activity_grid_adapter,null);
        }

        ImageView icon=gridView.findViewById(R.id.icons);
        TextView letter=gridView.findViewById(R.id.letters);

        icon.setImageResource((icons[position]));
        letter.setText(letters[position]);

        return gridView;
    }
}


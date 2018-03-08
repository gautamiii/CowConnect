package com.example.gautam.cowconnect;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gautam on 3/5/2018.
 */

public class GridPgeAboutUsAdapter extends RecyclerView.Adapter<GridPgeAboutUsAdapter.MyViewHolder>{

    private List<GridPageAboutUsModuleHeadlineListView> modulelist;
    Context context;

    public GridPgeAboutUsAdapter(Context context,List<GridPageAboutUsModuleHeadlineListView> list) {
        this.modulelist = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.module_gridpage_aboutus_adapter, parent, false);
        return new GridPgeAboutUsAdapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(GridPgeAboutUsAdapter.MyViewHolder holder, int position) {

       GridPageAboutUsModuleHeadlineListView gpaumhlv=modulelist.get(position);
       holder.adapterTextView.setText(gpaumhlv.getHeadlineListView());

       holder.adapterTextView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (view.getId())
               {

               }
           }
       });



    }

    @Override
    public int getItemCount() {
        return modulelist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView adapterTextView;

        public MyViewHolder(View view){
            super(view);
            adapterTextView=view.findViewById(R.id.tvheadlineListItem);
        }
    }
}


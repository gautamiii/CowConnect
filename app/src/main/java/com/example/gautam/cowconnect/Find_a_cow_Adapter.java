package com.example.gautam.cowconnect;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Find_a_cow_Adapter extends RecyclerView.Adapter<Find_a_cow_Adapter.MyViewHolder> {

    private List<Module_NameContact> moduleNameContactList;

    Context context;

    Find_a_cow_Adapter(Context context, List<Module_NameContact> list) {
        moduleNameContactList = list;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mName, mContact;
        public ConstraintLayout mconstLayoutModuleNC;

        public MyViewHolder(View view) {
            super(view);
            mName = view.findViewById(R.id.tvnameNC);
            mContact = view.findViewById(R.id.tvContactNC);
            mconstLayoutModuleNC = view.findViewById(R.id.constLayoutModuleNC);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.module_name_contact_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    ///for position get
    @Override
    public void onBindViewHolder(Find_a_cow_Adapter.MyViewHolder holder, int position) {

        Module_NameContact mnc = moduleNameContactList.get(position);
        holder.mName.setText(mnc.getName());
        holder.mContact.setText(mnc.getContact());

        holder.mconstLayoutModuleNC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(context,)

//                Toast.makeText(context, "This is used ot navigate ot another activity", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,RegisteredProfile.class);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return moduleNameContactList.size();
    }
}

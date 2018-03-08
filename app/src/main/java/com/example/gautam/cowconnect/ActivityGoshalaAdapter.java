package com.example.gautam.cowconnect;

/**
 * Created by Gautam on 2/28/2018.
 */
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

public class ActivityGoshalaAdapter extends RecyclerView.Adapter<ActivityGoshalaAdapter.MyViewHolder>{

    private List<Module_NameContact> moduleNameContactList;

    Context context;

    ActivityGoshalaAdapter(Context context, List<Module_NameContact> list) {
        moduleNameContactList = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.module_name_contact_list_for_goshal_adapter, parent, false);
        return new ActivityGoshalaAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Module_NameContact mnc = moduleNameContactList.get(position);
        holder.mNameGA.setText(mnc.getName());
        holder.mContactGA.setText(mnc.getContact());

        holder.mconstLayoutModuleNCGA.setOnClickListener(new View.OnClickListener() {
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

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mNameGA, mContactGA;
        public ConstraintLayout mconstLayoutModuleNCGA;

        public MyViewHolder(View view) {
            super(view);
            mNameGA = view.findViewById(R.id.tvnameNCtvnameNCgoshala);
            mContactGA = view.findViewById(R.id.tvContactNCgoshala);
            mconstLayoutModuleNCGA = view.findViewById(R.id.constLayoutModuleNCgoshala);
        }
    }



}

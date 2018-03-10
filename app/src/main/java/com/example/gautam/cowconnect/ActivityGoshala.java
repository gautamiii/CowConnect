package com.example.gautam.cowconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityGoshala extends AppCompatActivity {

    private List<Module_NameContact> moduleNameContactList;
    private RecyclerView mrecyclerViewGoshala;
    private ActivityGoshalaAdapter mAdapterGoshala;
    String ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goshala);

        moduleNameContactList=new ArrayList<>();
        mrecyclerViewGoshala=findViewById(R.id.RecycleViewNCGoshala);
        mAdapterGoshala=new ActivityGoshalaAdapter(this,moduleNameContactList);
        RecyclerView.LayoutManager mlayoutmanagerG=new LinearLayoutManager(getApplicationContext());
        mrecyclerViewGoshala.setLayoutManager(mlayoutmanagerG);
        mrecyclerViewGoshala.setItemAnimator(new DefaultItemAnimator());
        mrecyclerViewGoshala.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mrecyclerViewGoshala.setAdapter(mAdapterGoshala);
        PrepareContactNameDataG();
    }

    private void PrepareContactNameDataG()
    {
        Module_NameContact mModule_NameContact=new Module_NameContact("Harpreet","9646710266");
        moduleNameContactList.add(mModule_NameContact);

        mModule_NameContact=new Module_NameContact("Gurpreet","96487654367");
        moduleNameContactList.add(mModule_NameContact);

    }
}

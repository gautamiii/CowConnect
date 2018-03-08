package com.example.gautam.cowconnect;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Find_a_cow extends AppCompatActivity {

    private List<Module_NameContact> moduleNameContactList;
    private RecyclerView mrecyclerView;
    private Find_a_cow_Adapter mAapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_a_cow);
        moduleNameContactList=new ArrayList<>();
        mrecyclerView=findViewById(R.id.RecycleViewNC);

        mAapter=new Find_a_cow_Adapter(this,moduleNameContactList);
        RecyclerView.LayoutManager mlayoutmanager=new LinearLayoutManager(getApplicationContext());
        mrecyclerView.setLayoutManager(mlayoutmanager);
        mrecyclerView.setItemAnimator(new DefaultItemAnimator());
       mrecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mrecyclerView.setAdapter(mAapter);

        PrepareContactNameData();
    }
    private void PrepareContactNameData()
    {
        Module_NameContact mModule_NameContact=new Module_NameContact("Harpreet","9646710266");
        moduleNameContactList.add(mModule_NameContact);

       mModule_NameContact=new Module_NameContact("Gurpreet","96487654367");
        moduleNameContactList.add(mModule_NameContact);

    }
}

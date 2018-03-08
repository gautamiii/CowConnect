package com.example.gautam.cowconnect;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class GridPageAboutUs extends AppCompatActivity implements FragmentAboutUsVHS.OnFragmentInteractionListener{

    private List<GridPageAboutUsModuleHeadlineListView> modulelist;
    private RecyclerView mRecylerViewAboutUs;
    private GridPgeAboutUsAdapter mAdapterAboutUs;
    Toolbar toolbar;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_page_about_us);
        toolbar = findViewById(R.id.toolbar_AboutUs);
        modulelist=new ArrayList<>();
        mRecylerViewAboutUs=findViewById(R.id.RecycleViewAboutUs);
        mAdapterAboutUs=new GridPgeAboutUsAdapter(this,modulelist);
        RecyclerView.LayoutManager mlayoutmanagerAboutUs=new LinearLayoutManager(getApplicationContext());
        mRecylerViewAboutUs.setLayoutManager(mlayoutmanagerAboutUs);
//        mRecylerViewAboutUs.setItemAnimator(new DefaultItemAnimator());
//        mRecylerViewAboutUs.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        mRecylerViewAboutUs.setAdapter(mAdapterAboutUs);
        usermethod();
    }


    private void usermethod(){
        GridPageAboutUsModuleHeadlineListView mGPAUMHLV=new GridPageAboutUsModuleHeadlineListView("Virat Hindustan Sangam");
        modulelist.add(mGPAUMHLV);
        GridPageAboutUsModuleHeadlineListView mGPAUMHLVtwo=new GridPageAboutUsModuleHeadlineListView("Key Members of Cow Connect App");
        modulelist.add(mGPAUMHLVtwo);
        GridPageAboutUsModuleHeadlineListView mGPAUMHLVthree=new GridPageAboutUsModuleHeadlineListView("Technology Consultant");
        modulelist.add(mGPAUMHLVthree);

    }
}

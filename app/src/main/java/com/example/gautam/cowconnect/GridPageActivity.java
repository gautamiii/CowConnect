package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GridPageActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mGoshala,mRaksha,mSamvardhan,mUpdation,mChiktsa,mVigyan,mKrishi,mDugdha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_page);

        mGoshala=findViewById(R.id.tvgoshalaActivity);
        mRaksha=findViewById(R.id.tvGoRakshaActivity);
        mSamvardhan=findViewById(R.id.tvSamvardhanActivity);
        mUpdation=findViewById(R.id.tvUpdationActivity);
        mChiktsa=findViewById(R.id.tvChikitsaActivity);
        mVigyan=findViewById(R.id.tvVigyanActivity);
        mKrishi=findViewById(R.id.tvKrishiActivity);
        mDugdha=findViewById(R.id.tvDugdhaActivity);

        mGoshala.setOnClickListener(this);
        mRaksha.setOnClickListener(this);
        mSamvardhan.setOnClickListener(this);
        mUpdation.setOnClickListener(this);
        mChiktsa.setOnClickListener(this);
        mVigyan.setOnClickListener(this);
        mKrishi.setOnClickListener(this);
        mDugdha.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view==mGoshala)
        {
            Intent igoshala=new Intent(GridPageActivity.this,ActivityGoshala.class);
            startActivity(igoshala);
        }

    }
}

package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GridPageWriteUs extends AppCompatActivity implements View.OnClickListener{

    TextView tvFeedback,tvAskExpert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_page_write_us);

        tvFeedback=findViewById(R.id.tvgoshalaActivity);
        tvAskExpert=findViewById(R.id.tvGoRakshaActivity);
        tvFeedback.setOnClickListener(this);
        tvAskExpert.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view==tvFeedback){
            Intent ifeedback=new Intent(GridPageWriteUs.this,GridPageWriteUsFeedback.class);startActivity(ifeedback);}
        if (view==tvAskExpert){ Intent iAskExpert=new Intent(GridPageWriteUs.this,GridPageWriteUsAskExpert.class);startActivity(iAskExpert);}

    }
}

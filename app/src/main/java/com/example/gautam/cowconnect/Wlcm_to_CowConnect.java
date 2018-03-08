package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Wlcm_to_CowConnect extends AppCompatActivity {

    TextView VartvNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlcm_to__cow_connect);
        VartvNextBtn=findViewById(R.id.tvNextBtn);
        VartvNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Wlcm_to_CowConnect.this,Profile.class);
                startActivity(intent);
            }
        });
    }
}

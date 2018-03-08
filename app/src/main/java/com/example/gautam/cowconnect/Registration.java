package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registration extends AppCompatActivity implements View.OnClickListener{

    TextView mTrust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mTrust=findViewById(R.id.tvTrusAndIndividual);
        mTrust.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view==mTrust){

            Intent intent=new Intent(Registration.this,RegNextPgTrust.class);
            startActivity(intent);
        }

    }
}

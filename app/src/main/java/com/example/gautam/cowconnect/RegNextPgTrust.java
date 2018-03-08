package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegNextPgTrust extends AppCompatActivity {

    TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_next_pg_trust);

        mRegister=findViewById(R.id.tvRegisterNow);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegNextPgTrust.this,Trust_and_individual_Registration.class);
                startActivity(intent);

            }
        });
    }
}

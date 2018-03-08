package com.example.gautam.cowconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OTP_Submission extends AppCompatActivity {

    ImageView varimageViewBack;
//    TextView VartvNotReceveSMS,VartvResend,VartextViewlastmsg;

    EditText VartvC,VartvO,VartvD,VartvE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp__submission);
        varimageViewBack=findViewById(R.id.imageViewBack);
        varimageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OTP_Submission.this,GetStartedActivity.class);
                startActivity(intent);
            }
        });
        VartvC=findViewById(R.id.tvC);
        VartvD=findViewById(R.id.tvD);
        VartvE=findViewById(R.id.tvE);
        VartvO=findViewById(R.id.tvO);
//        VartvNotReceveSMS=findViewById(R.id.tvNotReceveSMS);
//        VartvResend=findViewById(R.id.tvResend);
//        VartextViewlastmsg=findViewById(R.id.textViewlastmsg);
//        VartvNotReceveSMS.setVisibility(View.GONE);
//        VartvResend.setVisibility(View.GONE);
//        VartextViewlastmsg.setVisibility(View.GONE);
        VartvE.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                Intent intent=new Intent(OTP_Submission.this,Wlcm_to_CowConnect.class);
                startActivity(intent);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}

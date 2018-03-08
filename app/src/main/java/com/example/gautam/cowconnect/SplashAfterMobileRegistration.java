package com.example.gautam.cowconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.TextView;

public class SplashAfterMobileRegistration extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    TextView tvMobilevar;

    SharedPreferences pref;//for SharPref
    SharedPreferences.Editor editor;//for SharPref
    public static String TAGA = "pref";//for SharPref



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_after_mobile_registration);
        tvMobilevar=findViewById(R.id.ASAMRtv);
        pref = getSharedPreferences(TAGA,MODE_PRIVATE);//for SharPref
        editor = pref.edit();//for SharPref






        new Handler().postDelayed(new Runnable() {




            @Override
            public void run() {

                String mMobileNumber = pref.getString("t1","");
                tvMobilevar.setText(mMobileNumber);
                Intent i = new Intent(SplashAfterMobileRegistration.this, CowConnect_GridViewIcons.class);
                startActivity(i);



//                finish();
            }
        },SPLASH_TIME_OUT);


    }
}

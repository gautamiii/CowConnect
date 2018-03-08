package com.example.gautam.cowconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    SharedPreferences pref;
    public static String TAGA = "pref";
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        pref = getSharedPreferences(TAGA,MODE_PRIVATE);
        name = pref.getString("t1","");

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity


                if(name.equals(""))
                {
                    Intent i = new Intent(SplashActivity.this, WelcomeActivity.class);
                    startActivity(i);

                }
                else

                {
                    Intent i = new Intent(SplashActivity.this, CowConnect_GridViewIcons.class);
                    startActivity(i);
                } //added new

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

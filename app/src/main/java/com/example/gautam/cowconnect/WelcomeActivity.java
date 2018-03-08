package com.example.gautam.cowconnect;

/**
 * Created by Gautam on 2/10/2018.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout layoutDot;
    private TextView[] dotstv;
    private int[] layouts;
    private Button btnSkip;
    private Button btnNext;
    private MyPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (!isFirstTimeStartApp()){
//            startMainActivity();
//            finish();
//        }


        setStatusBarTransparent();

        setContentView(R.layout.activity_welcome);

        viewPager=findViewById(R.id.view_Pager);
        layoutDot=findViewById(R.id.dotLayout);
        btnNext=findViewById(R.id.btn_next);
        btnSkip=findViewById(R.id.btn_skip);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetStartedActivity();

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currntPage=viewPager.getCurrentItem()+1;
                if (currntPage<layouts.length){
                    //move to next page
                    viewPager.setCurrentItem(currntPage);
                }
                else{
                    GetStartedActivity();
                }

            }
        });

        layouts=new int[]{R.layout.slider_1,R.layout.slider_2,R.layout.slider_3};

        pagerAdapter=new MyPagerAdapter(layouts,getApplicationContext());
        viewPager.setAdapter(pagerAdapter);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position==layouts.length-1){
                    //last page

                    btnNext.setText("START");
                    btnNext.setTextColor(getResources().getColor(R.color.white));
                    btnSkip.setVisibility(View.GONE);
                }
                else{
                    btnNext.setText("NEXT");
                    btnSkip.setVisibility(View.VISIBLE);
                    btnSkip.setTextColor(getResources().getColor(R.color.white));
                }
                setDotStatus(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setDotStatus(0);


    }
    //    private boolean isFirstTimeStartApp(){
//
//        SharedPreferences ref=getApplicationContext().getSharedPreferences("IntroSliderApp", Context.MODE_PRIVATE);
//        return ref.getBoolean("FirstTimeStartFlag",true);
//    }
//    private void setFirstTimeStartStatus(boolean stt){
//        SharedPreferences ref=getApplicationContext().getSharedPreferences("IntroSliderApp", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor=ref.edit();
//        editor.putBoolean("FirstTimeStartFlag",stt);
//        editor.commit();
//    }
    private void setDotStatus(int page){
        layoutDot.removeAllViews();
        dotstv=new TextView[layouts.length];
        for (int i=0;i<layouts.length;i++)
        {
            dotstv[i]=new TextView(this);
            dotstv[i].setText(Html.fromHtml("&#8226;"));
            dotstv[i].setTextSize(30);
//            dotstv[i].setTextColor(Color.parseColor("#a9b4bb"));
            layoutDot.addView(dotstv[i]);
        }
        //set current dot active
        if(dotstv.length>0){
            dotstv[page].setTextColor(Color.parseColor("#4286f4"));
        }

    }
    private void GetStartedActivity(){
//        setFirstTimeStartStatus(true);
        startActivity(new Intent(WelcomeActivity.this,GetStartedActivity.class));
        finish();
    }
    private void setStatusBarTransparent(){
        if (Build.VERSION.SDK_INT >=21){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE|View.SYSTEM_UI_FLAG_FULLSCREEN);
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.MAGENTA);
        }
    }
}

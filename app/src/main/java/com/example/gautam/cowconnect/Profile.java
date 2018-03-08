package com.example.gautam.cowconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends AppCompatActivity {
    TextView mDone;
    EditText ETtvEmailIdBackData,ETtvMobileNoFrmBack;
//    ApiInterface apiInterface;//for api
//    String TAG="GetStartedActivity";//for api
    SharedPreferences pref;//for SharPref
    SharedPreferences.Editor editor;//for SharPref
    public static String TAGA = "pref";//for SharPref
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        Spinner spinnerVar=findViewById(R.id.spinner);

        mDone=findViewById(R.id.tvDone);
        ETtvEmailIdBackData=findViewById(R.id.tvEmailIdBackData);
        ETtvMobileNoFrmBack=findViewById(R.id.tvMobileNoFrmBack);

        pref = getSharedPreferences(TAGA,MODE_PRIVATE);//for SharPref
        editor = pref.edit();//for SharPref

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String email=ETtvEmailIdBackData.getText().toString();
//                String password=ETtvMobileNoFrmBack.getText().toString();
//                apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
//                Call<ResponseBean> response=apiInterface.saveData(email,password);
//                response.enqueue(new Callback<ResponseBean>() {
//                    @Override
//                    public void onResponse(Call<ResponseBean> call, Response<ResponseBean> response) {
//                        ResponseBean r=response.body();
//                        Toast.makeText(getApplicationContext(),"Response"+r.getErrorMsg(),Toast.LENGTH_LONG).show();
//                        Log.e(TAG,"Status:"+r.getError()+"SMSMessage"+r.getErrorMsg());
//
//                        Intent intent=new Intent(Profile.this,CowConnect_GridViewIcons.class);
//                        startActivity(intent);
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBean> call, Throwable t) {
//
//                    }
//                });

//                Intent intent=new Intent(Profile.this,CowConnect_GridViewIcons.class);//modify 1 march
//                startActivity(intent);//modify 1 march

                editor.putString("t1",ETtvMobileNoFrmBack.getText().toString());//for SharPref
                editor.commit();//for SharPref
                Intent intent=new Intent(Profile.this,SplashAfterMobileRegistration.class);//modify 1 march
              startActivity(intent);//modify 1 march
                
            }
        });

    }
}

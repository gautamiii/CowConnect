package com.example.gautam.cowconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Trust_and_individual_Registration extends AppCompatActivity {

    EditText mName,mName_of_trust,mAddress_of_trust,mContact_No,mEmail_Id,mSocial_link;
    CheckBox mGoshala,mGoraksha,mGosamvardhan,mGoupdation,mGochitkasa,mGoamrita,mGovigyan,mGokrishi;
    TextView mSubmit;
    String[] chekboxArray;
    List<String> checkboxList;

    ApiInterface apiInterface;//for api
   String TAG="GetStartedActivity";//for api

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trust_and_individual__registration);

        mName=findViewById(R.id.nameEditTxt);
        mName_of_trust=findViewById(R.id.NameTrustEdtTxt);
        mAddress_of_trust=findViewById(R.id.ETaddress);
        mContact_No=findViewById(R.id.ETcontact);
        mEmail_Id=findViewById(R.id.ETemail);
        mSocial_link=findViewById(R.id.ETsocial);

        mGoshala=findViewById(R.id.cvfirst);
        mGoraksha=findViewById(R.id.cvsecond);
        mGosamvardhan=findViewById(R.id.cvthird);
        mGoupdation=findViewById(R.id.cvfour);
        mGochitkasa=findViewById(R.id.cvfive);
        mGoamrita=findViewById(R.id.cvsix);
        mGovigyan=findViewById(R.id.cvseven);
        mGokrishi=findViewById(R.id.cveight);

        mSubmit=findViewById(R.id.tvsubmit);

   //     chekboxArray=new String[]{"mGoshala","mGoraksha","mGosamvardhan","mGoupdation","mGochitkasa","mGoamrita","mGovigyan","mGokrishi"};

        checkboxList = new ArrayList<String>();

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mGoshala.isChecked()){checkboxList.add("Goshala");}
                if(mGoraksha.isChecked()){checkboxList.add("Goraksha");}
                if(mGosamvardhan.isChecked()){checkboxList.add("Samvardhan");}
                if(mGoupdation.isChecked()){checkboxList.add("Goupdation");}
                if(mGochitkasa.isChecked()){checkboxList.add("Gochitkasa");}
                if(mGoamrita.isChecked()){checkboxList.add("Goamrita");}
                if(mGovigyan.isChecked()){checkboxList.add("Govigyan");}
                if(mGokrishi.isChecked()){checkboxList.add("Gokrishi");}

                String[] arraycheckbox=checkboxList.toArray(new String[checkboxList.size()]);



                String name=mName.getText().toString();
                String nameoftrust=mName_of_trust.getText().toString();
                String address=mAddress_of_trust.getText().toString();
                String emailid=mEmail_Id.getText().toString();
                String contactnumber=mContact_No.getText().toString();
                String socialmedialinks=mSocial_link.getText().toString();
                String activity=arraycheckbox.toString();

                apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
                Call<ResponseBean> response=apiInterface.saveData(name,nameoftrust,address,emailid,contactnumber,socialmedialinks,activity);
                response.enqueue(new Callback<ResponseBean>() {
                    @Override
                    public void onResponse(Call<ResponseBean> call, Response<ResponseBean> response) {

                        ResponseBean r=response.body();
                       Toast.makeText(getApplicationContext(),"Response"+r.getErrorMsg(), Toast.LENGTH_LONG).show();

                        Log.e(TAG,"Status:"+r.getError()+"SMSMessage"+r.getErrorMsg());


                    }

                    @Override
                    public void onFailure(Call<ResponseBean> call, Throwable t) {

                    }
                });

               
            }
        });




    }
}

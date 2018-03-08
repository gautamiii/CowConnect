package com.example.gautam.cowconnect;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetStartedActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    android.support.v7.widget.Toolbar toolbar;
    TextView conitnueButton,dialogEdit,dialogConfirm,textViewGivenMobileNumber,temporaryTv;
    EditText et_mobile_no_var;
    final Context context=this;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        Spinner spinnerVar=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.planets_array,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVar.setAdapter(adapter);
        spinnerVar.setOnItemSelectedListener(this);
        conitnueButton=findViewById(R.id.textViewContinue);
        et_mobile_no_var=findViewById(R.id.et_mobile_no);


        conitnueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.get_started_alert_dialog_box);
                dialogEdit=dialog.findViewById(R.id.buttonEdit);
                dialogConfirm=dialog.findViewById(R.id.buttonConfirm);


                textViewGivenMobileNumber=dialog.findViewById(R.id.textViewGivenMobileNumber);


                textViewGivenMobileNumber.setText(et_mobile_no_var.getText().toString());


                dialogEdit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialogConfirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent=new Intent(GetStartedActivity.this,OTP_Submission.class);  //this code put above
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String sSelected=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,sSelected, Toast.LENGTH_SHORT).show();}
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }




}

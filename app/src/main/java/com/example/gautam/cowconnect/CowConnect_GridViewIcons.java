package com.example.gautam.cowconnect;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class CowConnect_GridViewIcons extends AppCompatActivity {

    GridAdapter adapter;

    GridView mgridView;
    Context mcontext;

    String[] letterList={"Find a Cow","Activity","Breed info","Product Sellers","Innovations","FAQ","Gallery","Videos","Legal-info","Write to us","Registration","About Us"};
    int[] lettersIcon={

            R.drawable.findcow,
            R.drawable.cowactivity,
            R.drawable.breed_info,
            R.drawable.product_seller,
            R.drawable.innovation,
            R.drawable.faq,
            R.drawable.gallery,
            R.drawable.video,
            R.drawable.legal,
            R.drawable.writeus,
            R.drawable.regist,
            R.drawable.aboutus,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow_connect__grid_view_icons);
        mgridView=findViewById(R.id.gridview);
        adapter =new GridAdapter(CowConnect_GridViewIcons.this,letterList,lettersIcon);
        mgridView.setAdapter(adapter);

        mgridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent ifindcow=new Intent(CowConnect_GridViewIcons.this,Find_a_cow.class);
                        startActivity(ifindcow);
                        break;
                    case 1:
                        Intent iactivity=new Intent(CowConnect_GridViewIcons.this,GridPageActivity.class);
                        startActivity(iactivity);
                        break;
                    case 2:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Intent iProductSeller=new Intent(CowConnect_GridViewIcons.this,GridPageProductSeller.class);
                        startActivity(iProductSeller);
                        break;
                    case 4:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(CowConnect_GridViewIcons.this, "Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Intent iWriteUs=new Intent(CowConnect_GridViewIcons.this,GridPageWriteUs.class);
                        startActivity(iWriteUs);
                        break;
                    case 10:
                        Intent intent=new Intent(CowConnect_GridViewIcons.this,Registration.class);
                        startActivity(intent);
                    case 11:
                        Intent iAboutUs=new Intent(CowConnect_GridViewIcons.this,GridPageAboutUs.class);
                        startActivity(iAboutUs);
                }

//                Toast.makeText(CowConnect_GridViewIcons.this,"clicked letter findcow:"+letterList[position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}

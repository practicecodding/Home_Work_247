package com.hamidul.emergencyhelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    LottieAnimationView call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:999")));

            }
        });

        Division.aDivision=new ArrayList<>();
        Division.Dhaka=new ArrayList<>();
        Division.Khulna=new ArrayList<>();
        Division.Barisal=new ArrayList<>();
        Division.Sylhet=new ArrayList<>();
        Division.Chittagong=new ArrayList<>();
        Division.Rajshahi=new ArrayList<>();
        Division.Rangpur=new ArrayList<>();
        Division.Mymensingh=new ArrayList<>();

        Division.mDivision();
        Division.mDhaka();
        Division.mKhulna();
        Division.mBarisal();
        Division.mSylhet();
        Division.mChittagong();
        Division.mRajshahi();
        Division.mRangpur();
        Division.mMymensingh();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }

    private class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return Division.aDivision.size();
        }

        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

                layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View myView = layoutInflater.inflate(R.layout.item,parent,false);

                TextView divisionName = myView.findViewById(R.id.tvDivision);
                CardView itemClick = myView.findViewById(R.id.itemClick);

                HashMap hashMap = Division.aDivision.get(position);

                String name = (String) hashMap.get("division");

                divisionName.setText(name);

                itemClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Division.toolbar = name;

                        if (name.contains("Dhaka")){
                            Division.aDivision = Division.Dhaka;
                        } else if (name.contains("Khulna")) {
                            Division.aDivision = Division.Khulna;
                        } else if (name.contains("Barisal")) {
                            Division.aDivision = Division.Barisal;
                        } else if (name.contains("Sylhet")) {
                            Division.aDivision = Division.Sylhet;
                        } else if (name.contains("Chittagong")) {
                            Division.aDivision = Division.Chittagong;
                        } else if (name.contains("Rajshahi")) {
                            Division.aDivision = Division.Rajshahi;
                        } else if (name.contains("Rangpur")) {
                            Division.aDivision = Division.Rangpur;
                        } else if (name.contains("Mymensingh")) {
                            Division.aDivision = Division.Mymensingh;
                        }

                        startActivity(new Intent(MainActivity.this,Division.class));

                    }
                });

            return myView;
        }
    }

}
package com.hamidul.homework2472;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Dashboard extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.dashboard);

        gridView = findViewById(R.id.gridView);

        SongList.Album();
        SongList.A();
        SongList.B();
        SongList.C();
        SongList.D();
        SongList.E();
        SongList.F();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }//onCrate======================================================================================

    private class MyAdapter extends BaseAdapter {
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return SongList.MainList.size();
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

            TextView albumName = myView.findViewById(R.id.albumName);
            LinearLayout layItem = myView.findViewById(R.id.layItem);

            HashMap hashMap1 = SongList.MainList.get(position);

            String Name = (String) hashMap1.get("name");

            albumName.setText(Name);


            
            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    SongList.Name=""+Name;

                    startActivity(new Intent(Dashboard.this,SongList.class));

                    if (Name.contains("Mizanur Rahman Azhari")){
                        SongList.MainList=SongList.A;
                    } else if (Name.contains("Delwar Hossain Saidi")) {
                        SongList.MainList=SongList.B;
                    } else if (Name.contains("Hafizur Rahman Siddiki")) {
                        SongList.MainList=SongList.C;
                    } else if (Name.contains("Shaikh Ahmadullah")) {
                        SongList.MainList=SongList.D;
                    } else if (Name.contains("Sayed Mukarram Bari")) {
                        SongList.MainList=SongList.E;
                    } else if (Name.contains("Abu Toha Mohammad Adnan")) {
                        SongList.MainList=SongList.E;
                    }
                }
            });

            return myView;
        }

    }



}//AppCompatActivity================================================================================
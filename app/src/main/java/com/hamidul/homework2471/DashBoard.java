package com.hamidul.homework2471;

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

public class DashBoard extends AppCompatActivity {
    GridView gridView;
    HashMap<String,String> hashMap;
    ArrayList < HashMap<String,String> > arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.desh_board);

        gridView = findViewById(R.id.gridView);

        ItemName();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }//onCreate=====================================================================================

    private void ItemName (){
        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 214.1");
        hashMap.put("des","Check whether a given number is divisible by 5 and 11 or not");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 214.2");
        hashMap.put("des","Check whether a given year is leap year or not");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 214.3");
        hashMap.put("des","Input week number and output the week day");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 214.4");
        hashMap.put("des","Calculate percentage & grade");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 214.5");
        hashMap.put("des","Calculate total electricity bill");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 232.1");
        hashMap.put("des","multiplication table of a given number");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 232.2");
        hashMap.put("des","The n terms of even number and their sum");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 232.3");
        hashMap.put("des","Sum of the series up to n terms");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 232.4");
        hashMap.put("des","The n terms of square natural number and their sum");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Home Work 232.5");
        hashMap.put("des","Check whether a number is palindrome or not");
        arrayList.add(hashMap);

    }

    private class MyAdapter extends BaseAdapter {
        LayoutInflater layoutInflater;
        LinearLayout layItem;
        TextView tvName,tvDes;
        @Override
        public int getCount() {
            return arrayList.size();
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

            layItem = myView.findViewById(R.id.layItem);
            tvName = myView.findViewById(R.id.tvName);
            tvDes = myView.findViewById(R.id.tvDes);

            HashMap <String,String> hashMap1 = arrayList.get(position);
            String itemName = hashMap1.get("name");
            String des = hashMap1.get("des");

            tvName.setText(itemName);
            tvDes.setText(des);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (itemName.equals("Home Work 214.1")){
                        startActivity(new Intent(DashBoard.this,HomeWork214_1.class));
                    } else if (itemName.equals("Home Work 214.2")) {
                        startActivity(new Intent(DashBoard.this,HomeWork214_2.class));
                    } else if (itemName.equals("Home Work 214.3")) {
                        startActivity(new Intent(DashBoard.this,HomeWork214_3.class));
                    } else if (itemName.equals("Home Work 214.4")) {
                        startActivity(new Intent(DashBoard.this, HomeWork214_4.class));
                    } else if (itemName.equals("Home Work 214.5")) {
                        startActivity(new Intent(DashBoard.this, HomeWork214_5.class));
                    } else if (itemName.equals("Home Work 232.1")) {
                        startActivity(new Intent(DashBoard.this, HomeWork232_1.class));
                    } else if (itemName.equals("Home Work 232.2")) {
                        startActivity(new Intent(DashBoard.this, HomeWork232_2.class));
                    } else if (itemName.equals("Home Work 232.3")) {
                        startActivity(new Intent(DashBoard.this, HomeWork232_3.class));
                    } else if (itemName.equals("Home Work 232.4")) {
                        startActivity(new Intent(DashBoard.this, HomeWork232_4.class));
                    } else if (itemName.equals("Home Work 232.5")) {
                        startActivity(new Intent(DashBoard.this, HomeWork232_5.class));
                    }
                }
            });

            return myView;
        }
    }

}//AppCompatActivity================================================================================
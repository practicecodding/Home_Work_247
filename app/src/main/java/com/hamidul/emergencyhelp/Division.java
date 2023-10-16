package com.hamidul.emergencyhelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
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

public class Division extends AppCompatActivity {
    public static HashMap <String ,String> hashMap;
    public static ArrayList < HashMap<String,String>> aDivision=new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Dhaka = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Khulna = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Barisal = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Sylhet = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Chittagong = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Rajshahi = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Rangpur = new ArrayList<>();
    public static ArrayList < HashMap<String,String>> Mymensingh = new ArrayList<>();
    GridView gridView;
    TextView tvToolbar;
    public static String toolbar = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.division);

        gridView = findViewById(R.id.gridView);
        tvToolbar = findViewById(R.id.tvToolbar);

        tvToolbar.setText("Districts of "+toolbar);

        District.Barguna = new ArrayList<>();
        District.Barisal = new ArrayList<>();
        District.Bhola = new ArrayList<>();
        District.Jhalokati = new ArrayList<>();
        District.Patuakhali = new ArrayList<>();
        District.Pirojpur = new ArrayList<>();
        District.Madaripur = new ArrayList<>();

        District.mBarguna();
        District.mBarisal();
        District.mBhola();
        District.mJhalokati();
        District.mPatuakhali();
        District.mPirojpur();
        District.mMadaripur();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }//OnCreate=====================================================================================

    private class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return aDivision.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

                layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View myView = layoutInflater.inflate(R.layout.item,viewGroup,false);

                TextView district = myView.findViewById(R.id.tvDivision);
                CardView itemClick = myView.findViewById(R.id.itemClick);

                HashMap hashMap1 = aDivision.get(i);
                String name = (String) hashMap1.get("district");
                district.setText(name);

                itemClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        District.toolbar = name;

                        if (name.contains("Barguna")){
                            District.aDistrict = District.Barguna;
                        } else if (name.contains("Barisal")) {
                            District.aDistrict = District.Barisal;
                        } else if (name.contains("Bhola")) {
                            District.aDistrict = District.Bhola;
                        } else if (name.contains("Jhalokati")) {
                            District.aDistrict = District.Jhalokati;
                        } else if (name.contains("Patuakhali")) {
                            District.aDistrict = District.Patuakhali;
                        } else if (name.contains("Pirojpur")) {
                            District.aDistrict = District.Pirojpur;
                        } else if (name.contains("Madaripur")) {
                            District.aDistrict = District.Madaripur;
                        }

                        startActivity(new Intent(Division.this,District.class));

                    }
                });


            return myView;
        }
    }

    public static void mDivision(){
        hashMap = new HashMap<>();
        hashMap.put("division","Barisal");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Chittagong");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Dhaka");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Khulna");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Rajshahi");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Rangpur");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Sylhet");
        aDivision.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("division","Mymensingh");
        aDivision.add(hashMap);
    }

    public static void mBarisal(){
        hashMap = new HashMap<>();
        hashMap.put("district","Barguna");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Barisal");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Bhola");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Jhalokati");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Patuakhali");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Pirojpur");
        Barisal.add(hashMap);
    }

    public static void mChittagong(){
        hashMap = new HashMap<>();
        hashMap.put("district","Bandarban");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Brahmanbaria");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Chandpur");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Chittagong");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Comilla");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Cox's Bazar");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Feni");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Khagrachhari");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Lakshmipur");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Noakhali");
        Chittagong.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Rangamati");
        Chittagong.add(hashMap);
    }

    public static void mDhaka(){
        hashMap = new HashMap<>();
        hashMap.put("district","Dhaka");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Faridpur");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Gazipur");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Gopalganj");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Kishoreganj");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Madaripur");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Manikganj");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Munshiganj");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Narayanganj");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Narsingdi");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Rajbari");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Shariatpur");
        Dhaka.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Tangail");
        Dhaka.add(hashMap);
    }

    public static void mKhulna(){
        hashMap = new HashMap<>();
        hashMap.put("district","Bagerhat");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Chuadanga");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Jessore");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Jhenaidah");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Khulna");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Kushtia");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Magura");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Meherpur");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Narail");
        Khulna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Satkhira");
        Khulna.add(hashMap);
    }

    public static void mRajshahi(){
        hashMap = new HashMap<>();
        hashMap.put("district","Bogra");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Chapai Nawabganj");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Joypurhat");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Naogaon");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Natore");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Pabna");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Rajshahi");
        Rajshahi.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Sirajganj");
        Rajshahi.add(hashMap);
    }

    public static void mRangpur(){
        hashMap = new HashMap<>();
        hashMap.put("district","Dinajpur");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Gaibandha");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Kurigram");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Lalmonirhat");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Nilphamari");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Panchagarh");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Rangpur");
        Rangpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Thakurgaon");
        Rangpur.add(hashMap);
    }

    public static void mSylhet(){
        hashMap = new HashMap<>();
        hashMap.put("district","Habiganj");
        Sylhet.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Moulvibazar");
        Sylhet.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Sunamganj");
        Sylhet.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Sylhet");
        Sylhet.add(hashMap);
    }

    public static void mMymensingh(){
        hashMap = new HashMap<>();
        hashMap.put("district","Jamalpur");
        Mymensingh.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Mymensingh");
        Mymensingh.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Netrokona");
        Mymensingh.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("district","Sherpur");
        Mymensingh.add(hashMap);
    }

}
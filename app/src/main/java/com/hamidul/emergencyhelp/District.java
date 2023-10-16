package com.hamidul.emergencyhelp;

import androidx.appcompat.app.AppCompatActivity;

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

public class District extends AppCompatActivity {
    GridView gridView;
    TextView tvToolbar;
    public static String toolbar = "";
    public static HashMap<String,String> hashMap;
    public static ArrayList<HashMap<String,String>> aDistrict = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Barguna = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Barisal = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Bhola = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Jhalokati = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Patuakhali = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Pirojpur = new ArrayList<>();
    public static ArrayList<HashMap<String,String>> Madaripur = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.district);

        gridView = findViewById(R.id.gridView);
        tvToolbar = findViewById(R.id.tvToolbar);

        tvToolbar.setText("Police Stations in "+toolbar);

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }

    public class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return aDistrict.size();
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
            View myView = layoutInflater.inflate(R.layout.item_thana,viewGroup,false);

            TextView thanaName = myView.findViewById(R.id.thana);
            TextView Phone = myView.findViewById(R.id.number);
            LottieAnimationView call = myView.findViewById(R.id.call);

            HashMap <String,String> hashMap1 = aDistrict.get(i);
            String name = hashMap1.get("thana");
            String phone = hashMap1.get("phone");

            thanaName.setText(name+" Police Station");
            Phone.setText("Phone : "+phone);

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone)));

                }
            });

            return myView;
        }
    }

    public static void mBarguna(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Amtali");
        hashMap.put("phone","01320-156187");
        Barguna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Bamna");
        hashMap.put("phone","01320-156280");
        Barguna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Barguna Sadar");
        hashMap.put("phone","01320-156161");
        Barguna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Betagi");
        hashMap.put("phone","01320-156239");
        Barguna.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Patharghata");
        hashMap.put("phone","01320-156213");
        Barguna.add(hashMap);
    }

    public static void mBarisal(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Agouljhora");
        hashMap.put("phone","01713374284");
        Barisal.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana","Babuganj");
        hashMap.put("phone","01713374271");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Bakerganj");
        hashMap.put("phone","01713374272");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Banaripara");
        hashMap.put("phone","01713374273");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Gournodi");
        hashMap.put("phone","01713374275");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Hijla");
        hashMap.put("phone","0171337428");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Kazirhut");
        hashMap.put("phone","01320-151420");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Mehendiganj");
        hashMap.put("phone","01713374279");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Muladi");
        hashMap.put("phone","01713374260");
        Barisal.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Ujirpur");
        hashMap.put("phone","0171337428");
        Barisal.add(hashMap);
    }

    public static void mBhola(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Bhola");
        hashMap.put("phone","01713374300");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Borhanuddin");
        hashMap.put("phone","01713374303");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Char Fashion");
        hashMap.put("phone","01713374305");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Daulatkhan");
        hashMap.put("phone","01713374301");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Lalmohan");
        hashMap.put("phone","01713374304");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Monpura");
        hashMap.put("phone","01713374306");
        Bhola.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Tajumuddin");
        hashMap.put("phone","01713374302");
        Bhola.add(hashMap);
    }

    public static void mPatuakhali(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Jhalkathi");
        hashMap.put("phone","01713374286");
        Jhalokati.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Kathaliya");
        hashMap.put("phone","01713374289");
        Jhalokati.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Nolchithi");
        hashMap.put("phone","01713374287");
        Jhalokati.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Rajapur");
        hashMap.put("phone","01713374288");
        Jhalokati.add(hashMap);
    }

    public static void mJhalokati(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Bauphal");
        hashMap.put("phone","01713374319");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Dasmina");
        hashMap.put("phone","01713374321");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Dumki");
        hashMap.put("phone","01713374322");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Golachipa");
        hashMap.put("phone","01713374320");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Kalapara");
        hashMap.put("phone","01713374323");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Mirzagonj");
        hashMap.put("phone","01713374324");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Patuakhali");
        hashMap.put("phone","01713374318");
        Patuakhali.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Rangabali");
        hashMap.put("phone","01713374325");
        Patuakhali.add(hashMap);
    }

    public static void mPirojpur(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Bhandaria");
        hashMap.put("phone","01713374337");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Kawkhali");
        hashMap.put("phone","01713374339");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Mathbaria");
        hashMap.put("phone","01713374342");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Nazirpur");
        hashMap.put("phone","01713374340");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Nesarabad");
        hashMap.put("phone","01713374337");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Pirojpur Sadar");
        hashMap.put("phone","01713374337");
        Pirojpur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Zianagar");
        hashMap.put("phone","01713374341");
        Pirojpur.add(hashMap);
    }

    public static void mMadaripur(){
        hashMap = new HashMap<>();
        hashMap.put("thana","Kalkini");
        hashMap.put("phone","0171337356");
        Madaripur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Madaripur");
        hashMap.put("phone","01713373575");
        Madaripur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Rajoir");
        hashMap.put("phone","0171337356");
        Madaripur.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana","Shivchar");
        hashMap.put("phone","0171337356");
        Madaripur.add(hashMap);

    }

}
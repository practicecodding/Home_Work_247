package com.hamidul.homework2472;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SongList extends AppCompatActivity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    public static HashMap <String ,String> hashMap;
    public static ArrayList <HashMap<String,String>> MainList = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> A = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> B = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> C = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> D = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> E = new ArrayList<>();
    public static ArrayList <HashMap<String,String>> F = new ArrayList<>();
    public static String Name = "";
    TextView itemToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.song_list);

        gridView = findViewById(R.id.gridView);
        itemToolbar = findViewById(R.id.itemToolbar);

        itemToolbar.setText(Name);

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }

    private class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return MainList.size();
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
            View myView = layoutInflater.inflate(R.layout.song,viewGroup,false);

            TextView songName = myView.findViewById(R.id.tvSong);
            ImageView icon = myView.findViewById(R.id.icon);

            HashMap hashMap1 = MainList.get(i);

            String song = (String) hashMap1.get("song");
            String url = (String) hashMap1.get("url");
            int x = i+1;

            songName.setText(x+". "+song);

            Bitmap iconPlay = BitmapFactory.decodeResource(SongList.this.getResources(),
                    R.drawable.play_icon);

            Bitmap iconPause = BitmapFactory.decodeResource(SongList.this.getResources(),
                    R.drawable.pause_icon);

            icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (icon.getTag()!=null && icon.getTag().toString().contains("Play")){
                        if (mediaPlayer!=null) mediaPlayer.release();

                        mediaPlayer = new MediaPlayer();
                        try {
                            mediaPlayer.setDataSource(url);
                            mediaPlayer.prepare();
                            mediaPlayer.start();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        icon.setImageResource(R.drawable.pause_icon);
                        icon.setTag("Pause");
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                icon.setImageResource(R.drawable.play_icon);
                                icon.setTag("Play");
                            }
                        });

                    }else {
                        mediaPlayer.stop();
                        icon.setImageResource(R.drawable.play_icon);
                        icon.setTag("Play");
                    }

                }
            });

            return myView;
        }
    }

    public static void Album (){
        hashMap = new HashMap<>();
        hashMap.put("name","Mizanur Rahman Azhari");
        MainList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Delwar Hossain Saidi");
        MainList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Hafizur Rahman Siddiki");
        MainList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Shaikh Ahmadullah");
        MainList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Sayed Mukarram Bari");
        MainList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Abu Toha Mohammad Adnan");
        MainList.add(hashMap);

    }

    public static void A (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        A.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        A.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        A.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        A.add(hashMap);

    }

    public static void B (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        B.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        B.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        B.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        B.add(hashMap);

    }

    public static void C (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        C.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        C.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        C.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        C.add(hashMap);

    }

    public static void D (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        D.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        D.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        D.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        D.add(hashMap);

    }

    public static void E (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        E.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        E.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        E.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        E.add(hashMap);

    }

    public static void F (){
        hashMap = new HashMap<>();
        hashMap.put("song","Waz 1");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        F.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 2");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        F.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 3");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/Alone_Sad_Ringtone.mp3");
        F.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("song","Waz 4");
        hashMap.put("url","https://smhamidulcodding.000webhostapp.com/mp3/viral_ringtone.mp3");
        F.add(hashMap);

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer!=null) {
            mediaPlayer.release();
            finish();
        }
    }
}
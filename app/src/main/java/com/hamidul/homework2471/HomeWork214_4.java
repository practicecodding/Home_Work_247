package com.hamidul.homework2471;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HomeWork214_4 extends AppCompatActivity {
    EditText edPhy,edChem,edBio,edMath,edCom;
    Button button;
    TextView toolBarText,tvResult;
    LinearLayout layHome,layResult;
    int Total;
    float Percentage;
    DecimalFormat decimalFormat;
    int back=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_214_4);

        edPhy = findViewById(R.id.edPhy);
        edChem = findViewById(R.id.edChem);
        edBio = findViewById(R.id.edBio);
        edMath = findViewById(R.id.edMath);
        edCom = findViewById(R.id.edCom);
        toolBarText = findViewById(R.id.toolBarText);
        tvResult = findViewById(R.id.tvResult);
        button = findViewById(R.id.button);
        layHome = findViewById(R.id.layHome);
        layResult = findViewById(R.id.layResult);

        edPhy.addTextChangedListener(watcher);
        edChem.addTextChangedListener(watcher);
        edBio.addTextChangedListener(watcher);
        edMath.addTextChangedListener(watcher);
        edCom.addTextChangedListener(watcher);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back = 1;
                int physicsNumber = Integer.parseInt(edPhy.getText().toString());
                int chemistryNumber = Integer.parseInt(edChem.getText().toString());
                int biologyNumber = Integer.parseInt(edBio.getText().toString());
                int mathematicsNumber = Integer.parseInt(edMath.getText().toString());
                int computerNumber = Integer.parseInt(edCom.getText().toString());
                decimalFormat = new DecimalFormat("0.00");

                Total = physicsNumber+chemistryNumber+biologyNumber+mathematicsNumber+computerNumber;
                Percentage = (float) Total/5;
                Percentage = Float.valueOf(decimalFormat.format(Percentage));
                
                if (Percentage>=90){
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : A+");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else if (Percentage>=80) {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : A");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else if (Percentage>=70) {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : A-");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else if (Percentage>=60) {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : B");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else if (Percentage>=50) {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : C");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else if (Percentage>=40) {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : E");
                    toolBarText.setText("PASSED");
                    toolBarText.setTextColor(Color.parseColor("#84EF89"));
                    layResult.setVisibility(View.VISIBLE);
                } else {
                    layHome.setVisibility(View.GONE);
                    tvResult.setText("Percentage = "+Percentage+"\nGrade : F");
                    toolBarText.setText("FAILED");
                    toolBarText.setTextColor(Color.RED);
                    layResult.setVisibility(View.VISIBLE);
                }

            }
        });


    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            String phy = edPhy.getText().toString();
            String chem = edChem.getText().toString();
            String bio = edBio.getText().toString();
            String math = edMath.getText().toString();
            String com = edCom.getText().toString();

            button.setEnabled(!phy.isEmpty() && !chem.isEmpty() && !bio.isEmpty() && !math.isEmpty() && !com.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length()==3){
                int i = Integer.parseInt(s.toString());
                if (i>100){
                    s.delete(2,3);
                }
            }
        }
    };

    @Override
    public void onBackPressed() {
        if (back==1){
                layHome.setVisibility(View.VISIBLE);
                layResult.setVisibility(View.GONE);
                back=2;
        } else {
            super.onBackPressed();
        }
    }
}
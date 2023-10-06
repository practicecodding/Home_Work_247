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
import android.widget.TextView;

public class HomeWork214_2 extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_214_2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = editText.getText().toString();

                button.setEnabled(s1.length()==4);

                if (before>count){
                    textView.setVisibility(View.GONE);
                }else {
                    textView.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().startsWith("0")){
                    s.delete(0,1);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = Integer.parseInt(editText.getText().toString());

                textView.setVisibility(View.VISIBLE);

                if (year%400==0){
                    textView.setText(year+" is leap Year");
                } else if (year%4==0 && year%100!=0){
                    textView.setText(year+" is leap Year");
                } else {
                    textView.setText(year+" isn't leap Year");
                }


            }
        });


    }
}
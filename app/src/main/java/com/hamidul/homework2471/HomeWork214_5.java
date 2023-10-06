package com.hamidul.homework2471;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HomeWork214_5 extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    DecimalFormat decimalFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_214_5);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        decimalFormat = new DecimalFormat("0.00");

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = editText.getText().toString();

                button.setEnabled(!s1.isEmpty());

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
                int units = Integer.parseInt(editText.getText().toString());

                float bill;

                if (units<=50) bill = (float) (units*0.50);
                else if (units<=150) bill = (float) (25+ (units-50)*0.75);
                else if (units<=250) bill = (float) (25+75+ (units-150)*1.20);
                else bill = (float) (25+75+120+(units-250)*1.50);

                bill = (float) (bill+bill*0.20);
                bill = Float.valueOf(decimalFormat.format(bill));

                textView.setText("Electricity Bill = BDT "+bill);

                textView.setVisibility(View.VISIBLE);
            }
        });


    }
}
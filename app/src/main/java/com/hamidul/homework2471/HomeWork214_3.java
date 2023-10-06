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

import com.google.android.material.textfield.TextInputLayout;

public class HomeWork214_3 extends AppCompatActivity {
    EditText editText;
    TextView textView;
    TextInputLayout textInputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_214_3);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textInputLayout = findViewById(R.id.textInputLayout);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = editText.getText().toString();

                if (s1.length()==1){
                    textView.setVisibility(View.VISIBLE);

                    int day = Integer.parseInt(editText.getText().toString());

                    if (day==1){
                        textView.setText("Sunday");
                    } else if (day==2) {
                        textView.setText("Monday");
                    } else if (day==3) {
                        textView.setText("Tuesday");
                    } else if (day==4) {
                        textView.setText("Wednesday");
                    } else if (day==5) {
                        textView.setText("Thursday");
                    } else if (day==6) {
                        textView.setText("Friday");
                    } else if (day==7) {
                        textView.setText("Saturday");
                    }

                }

                if (before>count){
                    textView.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().startsWith("0") || s.toString().startsWith("8") || s.toString().startsWith("9")){
                    s.delete(0,1);
                }
            }
        });

    }

}
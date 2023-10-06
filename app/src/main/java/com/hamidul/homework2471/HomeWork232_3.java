package com.hamidul.homework2471;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeWork232_3 extends AppCompatActivity {
    EditText editText;
    Button button;
    LinearLayout layView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_232_3);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        layView = findViewById(R.id.layView);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(watcher);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");

                int number = Integer.parseInt(editText.getText().toString());
                int sum=9;
                int t=9;

                textView.append(""+t);
                for (int x=2; x<=number; x++){

                    t=t*10+9;
                    sum = sum+t;
                    textView.append(", "+t);
                }
                textView.append("\nTotal = "+sum);
                layView.setVisibility(View.VISIBLE);

            }
        });

    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String s1 = editText.getText().toString();

            button.setEnabled(!s1.isEmpty());

            if (before>count){
                layView.setVisibility(View.GONE);
            } else {
                layView.setVisibility(View.GONE);
            }

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith("0")){
                s.delete(0,1);
            }
        }
    };

}
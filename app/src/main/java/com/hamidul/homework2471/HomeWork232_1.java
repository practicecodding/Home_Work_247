package com.hamidul.homework2471;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeWork232_1 extends AppCompatActivity {
    EditText editText;
    Button button;
    LinearLayout layView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_work_232_1);

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

                for (int x=1; x<=10; x++){
                    textView.append(number+" * "+x+" = "+number*x+"\n");
                    layView.setVisibility(View.VISIBLE);
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
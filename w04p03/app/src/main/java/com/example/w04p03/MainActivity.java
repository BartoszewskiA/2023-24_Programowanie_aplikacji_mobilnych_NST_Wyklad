package com.example.w04p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView powitanie;
    CheckBox pytanie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        powitanie = findViewById(R.id.textView01);
        pytanie = findViewById(R.id.checkbox01);

        pytanie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                    powitanie.setVisibility(View.VISIBLE);
                else
                    powitanie.setVisibility(View.INVISIBLE);
            }
        });
    }
}
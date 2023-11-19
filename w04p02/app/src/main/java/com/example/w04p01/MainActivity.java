package com.example.w04p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    RadioGroup grupa;
    RadioButton rb_01, rb_02, rb_03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.textView01);
        grupa = findViewById(R.id.radioGroup01);
        rb_01 = findViewById(R.id.radioButton01);
        rb_02 = findViewById(R.id.radioButton02);
        rb_03 = findViewById(R.id.radioButton03);
        rb_01.setChecked(true);
        wynik.setText("wybrano 01");
        obslugaRadiobuttonow();
    }

    private void obslugaRadiobuttonow() {
        grupa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton01)
                    wynik.setText("wybrano 01");
                else if(checkedId==R.id.radioButton02)
                    wynik.setText("wybrano 02");
                else
                    wynik.setText("wybrano 03");
            }
        });
    }


}
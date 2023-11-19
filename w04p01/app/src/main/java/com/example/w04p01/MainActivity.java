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
    Button przycisk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.textView01);
        grupa = findViewById(R.id.radioGroup01);
        rb_01 = findViewById(R.id.radioButton01);
        rb_02 = findViewById(R.id.radioButton02);
        rb_03 = findViewById(R.id.radioButton03);
        przycisk = findViewById(R.id.button01);
        obslugaPrzycisku();
    }

    private void obslugaPrzycisku() {
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb_01.isChecked())
                    wynik.setText("Wybrano opcję 01");
                else if(rb_02.isChecked())
                    wynik.setText("Wybrano opcję 02");
                else
                    wynik.setText("Wybrano opcję 03");
            }
        });
    }
}
package com.example.w03p02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button przycisk01, przycisk02;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk01 = findViewById(R.id.button01);
        przycisk02 = findViewById(R.id.button02);
        wynik = findViewById(R.id.textView01);

        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String s = wynik.getText().toString();
                if(id==R.id.button01)
                {
                    s+="*";
                }
                else if (id==R.id.button02)
                {
                    if(!s.isEmpty())
                        s=s.substring(0,s.length()-1);
                }
                wynik.setText(s);
            }
        };

        View.OnLongClickListener sluchacz_2 = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               wynik.setText("");
                return false;
            }
        };

        przycisk01.setOnClickListener(sluchacz);
        przycisk02.setOnClickListener(sluchacz);
        wynik.setOnLongClickListener(sluchacz_2);

    }
}
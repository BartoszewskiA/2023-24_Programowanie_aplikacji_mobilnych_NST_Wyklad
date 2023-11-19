package com.example.w03p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar s01, s02;
    TextView t01,t02, t03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s01 = findViewById(R.id.seekBar01);
        s02 = findViewById(R.id.seekBar02);
        t01 = findViewById(R.id.textView01);
        t02 = findViewById(R.id.textView02);
        t03 = findViewById(R.id.textView03);

        dodajSluchaczeZdarzen();
    }

    private void dodajSluchaczeZdarzen() {
        SeekBar.OnSeekBarChangeListener sluchacz = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int id = seekBar.getId();
                if(id == R.id.seekBar01)
                    t01.setText(String.valueOf(progress));
                else if(id == R.id.seekBar02)
                    t02.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                t03.setText("?");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int w = s01.getProgress() + s02.getProgress();
                t03.setText(String.valueOf(w));
            }
        };

        s01.setOnSeekBarChangeListener(sluchacz);
        s02.setOnSeekBarChangeListener(sluchacz);
    }
}
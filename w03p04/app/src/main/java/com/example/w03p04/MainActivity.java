package com.example.w03p04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    RatingBar gwiazdki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.textView01);
        gwiazdki = findViewById(R.id.ratingBar01);

        gwiazdki.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               if(rating<3)
               {
                   gwiazdki.setRating(3);
                   wynik.setText("Wystawiłeś 3 gwiazdek");
               }
               else
                wynik.setText("Wystawiłeś "+String.valueOf(rating)+" gwiazdek");
            }
        });
    }
}
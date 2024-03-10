package com.example.w06p02;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektor;
    ImageView imageView01;
    TextView textView01;

    int[] obrazki = new int[] {
            R.drawable.rys_01,
            R.drawable.rys_02,
            R.drawable.rys_03,
            R.drawable.rys_04
    };
    String[] opisy;
    int poz =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView01 = findViewById(R.id.imageView01);
        textView01 = findViewById(R.id.textView01);
        opisy= getResources().getStringArray(R.array.opisy);
        detektor = new GestureDetector(this, this);

        imageView01.setImageResource(obrazki[poz]);
        textView01.setText(opisy[poz]);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektor.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {

        float dx = e2.getX() - e1.getX();
        float dy = e2.getY() - e1.getY();
//        String s = "dx = " + String.valueOf(Math.round(dx)) + "\ndy= " + String.valueOf(Math.round(dy));
//        textView01.setText(s);
        if(Math.abs(dx)>Math.abs(dy))
        {
            if(dx>0)
                przesun_w_prawo();
            else
                przesun_w_lewo();
        }

        return false;
    }

    private void przesun_w_lewo() {

        if(poz > 0)
        {
            poz--;
            imageView01.setImageResource(obrazki[poz]);
            textView01.setText(opisy[poz]);
        }

    }

    private void przesun_w_prawo() {
        if(poz<obrazki.length-1)
        {
            poz++;
            imageView01.setImageResource(obrazki[poz]);
            textView01.setText(opisy[poz]);
        }

    }
}
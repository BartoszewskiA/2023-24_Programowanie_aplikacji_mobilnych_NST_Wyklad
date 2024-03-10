package com.example.w06p01;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektor;
    TextView opis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detektor = new GestureDetector(this, this );
        opis = findViewById(R.id.opis);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektor.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {

//        float x = e.getX();
//        float y = e.getY();
//        opis.setText("onDown\n"+"x= "+x+"\ny= "+y);

        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {
//        float x = e.getX();
//        float y = e.getY();
//        opis.setText("onShowPress\n"+"x= "+x+"\ny= "+y);
    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
//        float x = e.getX();
//        float y = e.getY();
//        opis.setText("onSingleTapUp\n"+"x= "+x+"\ny= "+y);
        return false;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {

        //opis.setText("onScroll\n"+"x= "+distanceX+"\ny= "+distanceY);
        opis.setText("onScroll\n"+"xe1= "+e1.getX()+"\nxe2= "+e2.getX());
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {
//        float x = e.getX();
//        float y = e.getY();
//        opis.setText("onLongPress\n"+"x= "+x+"\ny= "+y);
    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
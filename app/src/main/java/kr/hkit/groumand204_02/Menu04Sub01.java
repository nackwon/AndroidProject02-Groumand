package kr.hkit.groumand204_02;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Menu04Sub01 extends AppCompatActivity {

 // 현재 activity를 지정
    Activity mContent = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu04_sub01);
    }
}

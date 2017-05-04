package kr.hkit.groumand204_02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Menu01Fragment extends Fragment
        implements View.OnClickListener {

    View rootView;
    Button btnMove01, btnMove02, btnMove03, btnMove04, btnMove05, btnMove06;
    ImageView imageView01, imageView02, imageView03, imageView04, imageView05,
            imageView06, imageView07, imageView08, imageView09, imageView10,
            imageView11, imageView12, imageView13, imageView14, imageView15,
            imageView, imageView_notice;
    TextView textGameAnswer;
    Random mRandom;
    int number;
    Integer[] beer = {
            R.id.imageView01, R.id.imageView02, R.id.imageView03, R.id.imageView04,
            R.id.imageView05, R.id.imageView06, R.id.imageView07, R.id.imageView08,
            R.id.imageView09, R.id.imageView10, R.id.imageView11, R.id.imageView12,
            R.id.imageView13, R.id.imageView14, R.id.imageView15
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_menu01, container, false);
        //rootView.getBackground().setAlpha(95);


        imageView = (ImageView) rootView.findViewById(R.id.imageView);
        imageView_notice = (ImageView) rootView.findViewById(R.id.imageView_notice);

        //Glide.with(rootView.getContext()).load(R.drawable.menu01_event).into(imageView);
        //Glide.with(rootView.getContext()).load(R.drawable.menu01_bottom).into(imageView_notice);

        btnMove01 = (Button) rootView.findViewById(R.id.btnMove01);
        btnMove02 = (Button) rootView.findViewById(R.id.btnMove02);
        btnMove03 = (Button) rootView.findViewById(R.id.btnMove03);
        btnMove04 = (Button) rootView.findViewById(R.id.btnMove04);
        btnMove05 = (Button) rootView.findViewById(R.id.btnMove05);
        btnMove06 = (Button) rootView.findViewById(R.id.btnMove06);

        imageView01 = (ImageView) rootView.findViewById(beer[0]);
        imageView02 = (ImageView) rootView.findViewById(beer[1]);
        imageView03 = (ImageView) rootView.findViewById(beer[2]);
        imageView04 = (ImageView) rootView.findViewById(beer[3]);
        imageView05 = (ImageView) rootView.findViewById(beer[4]);
        imageView06 = (ImageView) rootView.findViewById(beer[5]);
        imageView07 = (ImageView) rootView.findViewById(beer[6]);
        imageView08 = (ImageView) rootView.findViewById(beer[7]);
        imageView09 = (ImageView) rootView.findViewById(beer[8]);
        imageView10 = (ImageView) rootView.findViewById(beer[9]);
        imageView11 = (ImageView) rootView.findViewById(beer[10]);
        imageView12 = (ImageView) rootView.findViewById(beer[11]);
        imageView13 = (ImageView) rootView.findViewById(beer[12]);
        imageView14 = (ImageView) rootView.findViewById(beer[13]);
        imageView15 = (ImageView) rootView.findViewById(beer[14]);

        textGameAnswer = (TextView) rootView.findViewById(R.id.textGameAnswer);

        btnMove01.setOnClickListener(this);
        btnMove02.setOnClickListener(this);
        btnMove03.setOnClickListener(this);
        btnMove04.setOnClickListener(this);
        btnMove05.setOnClickListener(this);
        btnMove06.setOnClickListener(this);
        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
        imageView04.setOnClickListener(this);
        imageView05.setOnClickListener(this);
        imageView06.setOnClickListener(this);
        imageView07.setOnClickListener(this);
        imageView08.setOnClickListener(this);
        imageView09.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);

        mRandom = new Random();
        number = mRandom.nextInt(14) + 1;

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMove01:
                MainActivity.mViewPager.setCurrentItem(2);
                break;
            case R.id.btnMove02:
                MainActivity.mViewPager.setCurrentItem(3);
                break;
            case R.id.btnMove03:
                MainActivity.mViewPager.setCurrentItem(1);
                break;
            case R.id.btnMove04:
                MainActivity.mViewPager.setCurrentItem(4);
                break;
            case R.id.btnMove05:
                MainActivity.mViewPager.setCurrentItem(5);
                break;
            case R.id.btnMove06:
                MainActivity.mViewPager.setCurrentItem(5);
                break;
            case R.id.imageView01:
                if (beer[0] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView02:
                if (beer[1] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView03:
                if (beer[2] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView04:
                if (beer[3] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView05:
                if (beer[4] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView06:
                if (beer[5] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView07:
                if (beer[6] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView08:
                if (beer[7] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView09:
                if (beer[8] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView10:
                if (beer[9] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView11:
                if (beer[10] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView12:
                if (beer[11] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView13:
                if (beer[12] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView14:
                if (beer[13] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
            case R.id.imageView15:
                if (beer[14] == beer[number]) {
                    textGameAnswer.setText("축하합니다! 원하는 맥주 골라가세요!");
                } else {
                    textGameAnswer.setText("아쉽네요! 다음에 다시 도전해주세요!");
                }
                break;
        }
    }
}


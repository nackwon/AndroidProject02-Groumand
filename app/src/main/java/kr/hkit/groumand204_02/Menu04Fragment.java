package kr.hkit.groumand204_02;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static kr.hkit.groumand204_02.R.id.imageBeer;
import static kr.hkit.groumand204_02.R.id.viewPasta;
import static kr.hkit.groumand204_02.R.id.viewPizza;
import static kr.hkit.groumand204_02.R.id.viewResotto;
import static kr.hkit.groumand204_02.R.id.viewSalad;
import static kr.hkit.groumand204_02.R.id.viewZinAndBeverage;


public class Menu04Fragment extends Fragment
        implements View.OnClickListener {

    View rootView;
    //ImageView viewPizza, viewPasta, viewResotto, viewSalad, imageBeer, viewZinAndBeverage;

  /*  public Integer[] imageIds = {
            R.id.viewPizza, R.id.viewPasta, R.id.viewResotto,
            R.id.viewSalad, R.id.imageBeer, R.id.viewZinAndBeverage
    };

    public Integer[] imageDrawables = {
            R.drawable.menu03_menu, R.drawable.menu03_menu01, R.drawable.menu03_menu03,
            R.drawable.menu03_menu04, R.drawable.menu03_menu05, R.drawable.menu03_menu06,
    };*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_menu04, container, false);

        /*viewPizza = (ImageView) rootView.findViewById(imageIds[0]);
        viewPasta = (ImageView) rootView.findViewById(imageIds[1]);
        viewResotto = (ImageView) rootView.findViewById(imageIds[2]);
        viewSalad = (ImageView) rootView.findViewById(imageIds[3]);
        imageBeer = (ImageView) rootView.findViewById(imageIds[4]);
        viewZinAndBeverage = (ImageView) rootView.findViewById(imageIds[5]);

        Glide.with(rootView.getContext()).load(imageDrawables[0]).into(viewPizza);
        Glide.with(rootView.getContext()).load(imageDrawables[1]).into(viewPasta);
        Glide.with(rootView.getContext()).load(imageDrawables[2]).into(viewResotto);
        Glide.with(rootView.getContext()).load(imageDrawables[3]).into(viewSalad);
        Glide.with(rootView.getContext()).load(imageDrawables[4]).into(imageBeer);
        Glide.with(rootView.getContext()).load(imageDrawables[5]).into(viewZinAndBeverage);*/

      /*  viewPizza.setOnClickListener(this);
        viewPasta.setOnClickListener(this);
        viewResotto.setOnClickListener(this);
        viewSalad.setOnClickListener(this);
        imageBeer.setOnClickListener(this);
        viewZinAndBeverage.setOnClickListener(this);*/

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case viewPizza:
                // fragment에서 activity로 가고 싶을때 이렇게 사용
                intent = new Intent(rootView.getContext().getApplicationContext(), Menu04Sub01.class);
                break;
            case viewPasta:

                break;
            case viewResotto:

                break;
            case viewSalad:

                break;
            case imageBeer:

                break;
            case viewZinAndBeverage:

                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}

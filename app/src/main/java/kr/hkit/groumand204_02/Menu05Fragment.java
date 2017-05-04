package kr.hkit.groumand204_02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Menu05Fragment extends Fragment
        implements View.OnClickListener{

    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
              Bundle savedInstanceState) {
            rootView = inflater.inflate(R.layout.fragment_menu05, container, false);

        return rootView;
    }

    @Override
    public void onClick(View v) {

    }
}

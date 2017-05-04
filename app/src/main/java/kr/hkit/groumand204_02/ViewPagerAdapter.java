package kr.hkit.groumand204_02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitle = new String[]{
           "홈", "이벤트", "오늘의메뉴", "메뉴", "후기", "위치&\n운영시간"
    };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;
        switch (position) {
            case 0:
                fr = new Menu01Fragment();
                break;
            case 1:
                fr = new Menu02Fragment();
                break;
            case 2:
                fr = new Menu03Fragment();
                break;
            case 3:
                fr = new Menu04Fragment();
                break;
            case 4:
                fr = new Menu05Fragment();
                break;
            case 5:
                fr = new Menu06Fragment();
                break;
        }
        return fr;
    }
}

package kr.hkit.groumand204_02;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private ViewPagerAdapter mViewPagerAdapter;
    public static ViewPager mViewPager;
    private int previousState, currentState; // 이전 상태, 현재 상태를 저장하기 위한 변수
    private int currentPage, totalPage; // 현재 페이지, 전체페이지수를 저장하기 위한 변수
    private TabLayout tabLayout;
    BottomNavigationView bottomNavigationView; // 아래 붙는 것

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setOnPageChangeListener(onPageChangeListener);


        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        //tabLayout.setOnTabSelectedListener(onTabSelectedListener);

        //아이콘 넣기
        //tabLayout.getTabAt(0).setIcon();
        //선택된 탭의 글자 색상 변경(tabLayout text color change)
        tabLayout.setTabTextColors(Color.LTGRAY, Color.BLACK);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //탭 글자 색상 변경Tab text Color change
        //tabLayout.setTabTextColors(ColorStateList.valueOf(0xff000000));

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom01:
                        mViewPager.setCurrentItem(1);
                        return true;
                    case R.id.bottom02:
                        mViewPager.setCurrentItem(2);
                        return true;
                    case R.id.bottom03:
                        mViewPager.setCurrentItem(3);
                        return true;
                    case R.id.bottom04:
                        mViewPager.setCurrentItem(4);
                        return true;
                    case R.id.bottom05:
                        mViewPager.setCurrentItem(5);
                        return true;
                }
                return false;
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_right);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem(0);
            }
        });
    }

    // TabLayout이 선택되었을 때 아이콘을 바꿔주는 리스너
  /*  TabLayout.OnTabSelectedListener onTabSelectedListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            tabLayout.setTabTextColors();
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };
*/

    //Navigation
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //page 끝에 갔을 때 돌아가는 것 (circular viewpager 만드는 것)
    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        //page의 스크롤에 변화가 일어났을 때 일어나는 이벤트
        @Override
        public void onPageScrollStateChanged(int state) {
            currentPage = mViewPager.getCurrentItem();
            totalPage = mViewPagerAdapter.getCount();

            if(currentPage == totalPage-1 || currentPage == 0){
                previousState = currentState;
                currentState = state;
                if(previousState == 1 && currentState == 0){
                    mViewPager.setCurrentItem(currentPage == 0 ? totalPage-1 : 0, false);
                }
            }
        }
    };
}

package br.com.DanielDLJ.WhatsApp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mVewPager;
    private TabLayout mTabLayout;
    private TabsAccessorAdapter mTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar =  (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("WhatsApp");

        mVewPager = findViewById(R.id.main_tabs_pager);
        mTabsAccessorAdapter = new TabsAccessorAdapter(getSupportFragmentManager());
        mVewPager.setAdapter(mTabsAccessorAdapter);

        mTabLayout = findViewById(R.id.main_tabs);
        mTabLayout.setupWithViewPager(mVewPager);
    }
}

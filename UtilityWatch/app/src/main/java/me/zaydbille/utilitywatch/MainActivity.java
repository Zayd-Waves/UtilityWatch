/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/06/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    // Tab and ViewPager variables
    Toolbar             toolbar;
    ViewPager           pager;
    ViewPagerAdapter    adapter;
    SlidingTabLayout    tabs;
    CharSequence Titles[]={"Coin Flip", "Counter", "Choice", "Dice", "Cipher"};
    int numTabs = 5;
    static Menu menu; // reference to the menu and its items

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating The Toolbar and setting it as the Toolbar for the activity
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, numTabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assigning the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_share).setVisible(false);
        this.menu = menu;
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
            Intent myIntent = new Intent(this, HelpActivity.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Counter Fragment helper methods
    public static void hideShareButton() {
        if(menu == null) {
            return;
        }
        MenuItem item = menu.findItem(R.id.action_share);
        item.setVisible(false);
    }
    public static void showShareButton() {
        if(menu == null) {
            return;
        }
        MenuItem item = menu.findItem(R.id.action_share);
        item.setVisible(true);
    }


    public void addCount() {
        Preferences.setIntPref(this, Preferences.getIntPref(this) + 1);
    }

    public void subtractCount() {
        if(Preferences.getIntPref(this) == 0) {
            return;
        }
        Preferences.setIntPref(this, Preferences.getIntPref(this) - 1);
    }

    public void clearCount() { Preferences.setIntPref(this, 0); }

    public int getCount() { return Preferences.getIntPref(this); }

    // Choice Fragment helper methods
    public void saveList(ArrayList<String> list){ Preferences.saveList(this, list); }
    public ArrayList<String> getList() { return Preferences.getList(this); }
}

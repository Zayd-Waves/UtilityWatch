package me.zaydbille.utilitywatch;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerAdapter extends FragmentStatePagerAdapter  {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(android.support.v4.app.FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            CoinFlip tab1 = new CoinFlip();
            return tab1;
        }
        else if(position == 1)
        {
            Counter tab2 = new Counter();
            return tab2;
        }
        else if(position == 2)
        {
            Choice tab3 = new Choice();
            return tab3;
        }
        else if(position == 3)
        {
            Dice tab4 = new Dice();
            return tab4;
        } else if(position == 4)
        {
            Cipher tab5 = new Cipher();
            return tab5;
        }
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
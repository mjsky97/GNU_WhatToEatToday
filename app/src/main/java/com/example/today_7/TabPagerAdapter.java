package com.example.today_7;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                TabThemeFragment tabFragment1 = new TabThemeFragment();
                return tabFragment1;
            case 1:
                TabLiquorFragment tabFragment2 = new TabLiquorFragment();
                return tabFragment2;
            case 2:
                TabFastfoodFragment tabFragment3 = new TabFastfoodFragment();
                return tabFragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}




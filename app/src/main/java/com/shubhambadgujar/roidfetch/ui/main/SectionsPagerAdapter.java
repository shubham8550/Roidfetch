package com.shubhambadgujar.roidfetch.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shubhambadgujar.roidfetch.AboutFragment;
import com.shubhambadgujar.roidfetch.General;
import com.shubhambadgujar.roidfetch.MemoryFragment;
import com.shubhambadgujar.roidfetch.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_general_1,R.string.tab_text_memory_2, R.string.tab_text_about};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
               return General.newInstance("none" ,"none");
            case 1:
                return MemoryFragment.newInstance("none" ,"none");
            case 2:
                return AboutFragment.newInstance("none" ,"none");
            default:
                return PlaceholderFragment.newInstance(position + 1);



        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}
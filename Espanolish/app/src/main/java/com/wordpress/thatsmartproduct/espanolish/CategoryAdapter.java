package com.wordpress.thatsmartproduct.espanolish;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wssyed on 1/4/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesWordFragment();
        } else if (position == 1) {
            return new SchoolWordFragment();
        } else {
            return new NatureWordFragment();
        }
//          else {
//            return new PhrasesFragment();
//        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Places";
        } else if (position == 1) {
            return "Educational";
        } else {
            return "Nature";
        }
//        } else {
//            return mContext.getString(R.string.category_phrases);
//        }
    }
}


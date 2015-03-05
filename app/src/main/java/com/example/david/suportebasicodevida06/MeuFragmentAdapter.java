package com.example.david.suportebasicodevida06;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by david on 04/03/2015.
 */
public class MeuFragmentAdapter extends FragmentPagerAdapter {
    public MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        
        if(position == 0){
            fragment = new Fragment_info();
        }
        if(position == 1){
            fragment = new Fragment_main();
        }
        if(position == 2){
            fragment = new Fragment_sbv();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

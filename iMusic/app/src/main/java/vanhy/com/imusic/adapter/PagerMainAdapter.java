package vanhy.com.imusic.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import vanhy.com.imusic.fragment.CaNhanFragment;
import vanhy.com.imusic.fragment.HomeFragment;
import vanhy.com.imusic.fragment.TrangChuFragment;

public class PagerMainAdapter extends FragmentStatePagerAdapter{
    private static int numOfTabs;

    public PagerMainAdapter(FragmentManager fm, int num) {
        super(fm);
        this.numOfTabs = num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new HomeFragment();
            }

            case 1: {
                return new CaNhanFragment();
            }

            default: {
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return this.numOfTabs;
    }
}

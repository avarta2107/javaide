package com.duy.ide.java.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.commonsware.cwac.pager.PageDescriptor;
import com.commonsware.cwac.pager.v4.ArrayPagerAdapter;

import java.util.List;

/**
 * Created by duy on 19/07/2017.
 */

public class BottomPageAdapter extends ArrayPagerAdapter<Fragment> {

    public BottomPageAdapter(FragmentManager fragmentManager, List<PageDescriptor> descriptors) {
        super(fragmentManager, descriptors);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    protected Fragment createFragment(PageDescriptor desc) {
        return null;
    }
}

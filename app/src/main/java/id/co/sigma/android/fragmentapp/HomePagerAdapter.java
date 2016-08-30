package id.co.sigma.android.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sidiq on 29/08/2016.
 */
public class HomePagerAdapter extends FragmentPagerAdapter{
    private String[] titles=new String[]{"Call","Chat","Contact"};
    private CallFragment callFragment;
    private ChatFragment chatFragment;
    private ContactFragment contactFragment;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                if(callFragment == null){
                    callFragment=new CallFragment();
                }
                return callFragment;
            case 1:
                if (chatFragment == null){
                    chatFragment=new ChatFragment();
                }
                return  chatFragment;
            case 2:
                if(contactFragment == null){
                    contactFragment=new ContactFragment();
                }
                return contactFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}

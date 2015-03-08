package demo.wp.com.uiframwork.uiframwork.largescreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/3/8.
 */
public class FragAdapter extends FragmentPagerAdapter {
	private List<BaseFragmentActivity.BaseFragmentInstance>
			list = new ArrayList<BaseFragmentActivity.BaseFragmentInstance>();

	public FragAdapter(FragmentManager fm, List<BaseFragmentActivity.BaseFragmentInstance> list) {
		super(fm);
		this.list = list;
	}

	@Override
	public Fragment getItem(int i) {
		return list.get(i).baseFragment;
	}

	@Override
	public int getCount() {
		return list.size();
	}
}

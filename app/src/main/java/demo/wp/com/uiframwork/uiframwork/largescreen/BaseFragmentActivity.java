package demo.wp.com.uiframwork.uiframwork.largescreen;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;

import java.util.List;

import demo.wp.com.uiframwork.R;

/**
 * Created by Administrator on 2015/3/8.
 */
public abstract class BaseFragmentActivity extends FragmentActivity implements OnHeadlineSelectedListener {

	public abstract List<BaseFragmentInstance> getContentFragmentList();
	public abstract BaseHeadlineFragment getHeadlineFragment();

	private int mCurrentPosition = -1;
	private boolean isLargeLayout;

	FragAdapter mAdapter;
	FragmentManager mFragmentManager;
	FragmentTransaction mTransaction;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mFragmentManager = getSupportFragmentManager();
		mTransaction = mFragmentManager.beginTransaction();
		mAdapter = new FragAdapter(mFragmentManager, getContentFragmentList());
		isLargeLayout = findViewById(R.id.fragment_container) == null;
		if (!isLargeLayout) {
			if (savedInstanceState != null) {
				return;
			}
			BaseHeadlineFragment firstFragment = getHeadlineFragment();
			firstFragment.setBaseFragmentList(getContentFragmentList());
			firstFragment.setArguments(getIntent().getExtras());
			mTransaction.add(R.id.fragment_container, firstFragment).commit();
		}
	}

	@Override
	public void onArticleSelected(int position) {
		if (mCurrentPosition != position) {
			BaseFragment contentFragment = (BaseContentFragment)mAdapter.getItem(position);
			if (!isLargeLayout) {
				mTransaction.replace(R.id.fragment_container, contentFragment);
			} else {
				if (null != mFragmentManager.findFragmentById(R.id.content_fragment)) {
					mTransaction.replace(R.id.content_fragment, contentFragment);
				} else {
					mTransaction.add(R.id.content_fragment, contentFragment);
				}
			}
			mTransaction.addToBackStack(null);
			mTransaction.commit();
		}
		mCurrentPosition = position;
		getHeadlineFragment().updateView(position);
	}

	public static class BaseFragmentInstance {
		public BaseFragment baseFragment;
		public int location;
		public String title;
	}
}

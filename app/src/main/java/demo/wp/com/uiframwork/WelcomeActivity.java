package demo.wp.com.uiframwork;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import demo.wp.com.uiframwork.uiframwork.largescreen.BaseFragment;
import demo.wp.com.uiframwork.uiframwork.largescreen.BaseFragmentActivity;
import demo.wp.com.uiframwork.uiframwork.largescreen.BaseHeadlineFragment;

public class WelcomeActivity extends BaseFragmentActivity {

	private List<BaseFragmentInstance> list = new ArrayList<BaseFragmentInstance>();

	@Override
	public List<BaseFragmentInstance> getContentFragmentList() {
		return list;
	}

	@Override
	public BaseHeadlineFragment getHeadlineFragment() {
		return new BaseHeadlineFragment();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BaseFragmentInstance baseFragmentInstance = new BaseFragmentInstance();
		DebugItemListFragment contentFragment = new DebugItemListFragment();
		baseFragmentInstance.title = "Debug test --> ";
		baseFragmentInstance.baseFragment = contentFragment;
		list.add(baseFragmentInstance);
	}
}

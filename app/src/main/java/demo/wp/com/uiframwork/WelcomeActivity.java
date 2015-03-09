package demo.wp.com.uiframwork;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class WelcomeActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my);
		DebugItemListFragment fragment = new DebugItemListFragment();
		getSupportFragmentManager()
				.beginTransaction().add(R.id.fragment, fragment).commit();
	}
}

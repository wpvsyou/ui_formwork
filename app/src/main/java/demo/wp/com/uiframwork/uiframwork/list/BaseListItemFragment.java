package demo.wp.com.uiframwork.uiframwork.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import demo.wp.com.uiframwork.R;
import demo.wp.com.uiframwork.uiframwork.largescreen.BaseFragment;

/**
 * Created by Administrator on 2015/3/8.
 */
public abstract class BaseListItemFragment extends BaseFragment {

	public abstract List<ItemInstance> getItemInstanceList();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list_item_layout, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		LayoutInflater inflater = LayoutInflater.from(getActivity());
		ListView lv = (ListView) view.findViewById(R.id.base_list_view);
		ListItemAdapter adapter = new ListItemAdapter(getItemInstanceList(), inflater);
		lv.setAdapter(adapter);
	}

	public static abstract class ItemInstance {
		public abstract String getTitle();
		public abstract String onItemClick();
	}
}

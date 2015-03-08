package demo.wp.com.uiframwork.uiframwork.largescreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import demo.wp.com.uiframwork.R;

/**
 * Created by Administrator on 2015/3/8.
 */
public class BaseHeadlineFragment extends BaseFragment {

	protected OnHeadlineSelectedListener mCallback;
	private List<BaseFragmentActivity.BaseFragmentInstance>
			mList = new ArrayList<BaseFragmentActivity.BaseFragmentInstance>();
	LayoutInflater mInflater;

	public void setBaseFragmentList(List<BaseFragmentActivity.BaseFragmentInstance> list) {
		mList = list;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.base_list_fragment_layout, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ListView lv = (ListView) view.findViewById(R.id.base_list_view);
		LineAdapter adapter = new LineAdapter();
		lv.setAdapter(adapter);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mCallback = (OnHeadlineSelectedListener)activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnHeadlineSelectedListener");
		}
		mInflater = LayoutInflater.from(activity);
	}

	public void updateView(int position) {
	}

	class LineAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return mList.size();
		}

		@Override
		public Object getItem(int position) {
			return mList.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			if (null == convertView) {
				convertView = mInflater.inflate(R.layout.list_item_layout, parent, false);
			}
			ViewHolder holder = new ViewHolder();
			holder.textView = (TextView) convertView.findViewById(R.id.base_list_fragment_title);
			holder.textView.setText(mList.get(position).title);
			holder.linearLayout = (LinearLayout) convertView.findViewById(R.id.base_list_fragment_item);
			holder.linearLayout.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					mCallback.onArticleSelected(position);
				}
			});
			return convertView;
		}

		class ViewHolder {
			TextView textView;
			LinearLayout linearLayout;
		}
	}
}

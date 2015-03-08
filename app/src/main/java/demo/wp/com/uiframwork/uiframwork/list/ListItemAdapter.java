package demo.wp.com.uiframwork.uiframwork.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import demo.wp.com.uiframwork.R;

/**
 * Created by Administrator on 2015/3/8.
 */
public class ListItemAdapter extends BaseAdapter {

	private List<BaseListItemFragment.ItemInstance>
			mList = new ArrayList<BaseListItemFragment.ItemInstance>();
	private LayoutInflater mInflater;

	public ListItemAdapter(List<BaseListItemFragment.ItemInstance> list, LayoutInflater inflater) {
		this.mList = list;
		this.mInflater = inflater;
	}

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
		final ViewHolder holder = new ViewHolder();
		holder.title = (TextView) convertView.findViewById(R.id.base_list_fragment_title);
		holder.title.setText(mList.get(position).getTitle());
		holder.text = (TextView) convertView.findViewById(R.id.base_list_fragment_text);
		holder.item = (LinearLayout) convertView.findViewById(R.id.base_list_fragment_item);
		holder.item.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				holder.text.setText(mList.get(position).onItemClick());
			}
		});
		return convertView;
	}

	class ViewHolder {
		TextView title;
		TextView text;
		LinearLayout item;
	}
}

package com.pekall.emdm.debug;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.pekall.emdm.R;
import com.pekall.emdm.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangpeng on 15-3-6.
 *
 * Create a class extend this class. and create a ItemInstance list.
 * EX :
 * new ItemInstance {
 *      public String executeAction() { do something when this item on click. }
 *      public String getTitle() { edit name of this item. }
 *      public boolean isClick() { if the item on click return a boolean to save
 *                                 state fo this item. }
 *      public void reset() { use to reset which profile be config by this item.}
 * }
 *
 */
public abstract class DebugActivity extends BaseActivity {

    private final static String TAG = "DebugActivity";

    public abstract List<ItemInstance> getItemInstance();

    public static List<ItemResetListener> listeners = new ArrayList<ItemResetListener>();

    interface ItemResetListener {
        public void reset();
    }

    static DebugItemAdapter mAdapter;

    LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debug_activity_layout);
        mInflater = LayoutInflater.from(this);
        ListView lv = (ListView) findViewById(R.id.list_view);
        mAdapter = new DebugItemAdapter();
        lv.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    protected static void resetAll() {
        Log.d(TAG, "DebugActivity reset method! the listeners size [" + listeners.size() + "]");
        if (listeners.size() > 0) {
            for (ItemResetListener l : listeners) {
                l.reset();
            }
            mAdapter.notifyDataSetChanged();
            listeners.clear();
        }
    }

    class DebugItemAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return getItemInstance().size();
        }

        @Override
        public Object getItem(int position) {
            return getItemInstance().get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (null == convertView) {
                convertView = mInflater.inflate(R.layout.debug_list_view_item, parent, false);
            }
            final ViewHolder holder = new ViewHolder();
            final ItemInstance data = getItemInstance().get(position);
            holder.title = (TextView) convertView.findViewById(R.id.debug_title);
            holder.text = (TextView) convertView.findViewById(R.id.debug_text);
            holder.item = (LinearLayout) convertView.findViewById(R.id.debug_item);
            if (data.isClick()) {
                holder.text.setText(data.report);
            } else {
                holder.text.setText(data.getText());
            }
            holder.title.setText(data.getTitle());
            holder.item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.text.setText(data.execute());
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

    /**
     * Abstract class for instance item to test!
     */
    static abstract class Item {
        public abstract String getTitle();

        public abstract String execute();

        public abstract boolean isClick();

        public String getText() {
            return "";
        }

        public String report;

        public static boolean isClick;
    }

    /**
     * Add a interface for reset test!
     */
    static abstract class ItemInstance extends Item implements ItemResetListener{

        @Override
        public String execute() {
            if (!listeners.contains(this)) {
                listeners.add(this);
            }
            return executeAction();
        }

        public abstract String executeAction();
    }
}

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
	
        public static List<ItemResetListener> listeners = new ArrayList<ItemResetListener>();
	
	interface ItemResetListener {
        	public void reset();
    	}

        static DebugItemAdapter mAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list_item_layout, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		LayoutInflater inflater = LayoutInflater.from(getActivity());
		ListView lv = (ListView) view.findViewById(R.id.base_list_view);
		mAdapter = new ListItemAdapter(getItemInstanceList(), inflater);
		lv.setAdapter(adapter);
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

    /**
     * Abstract class for instance item to test!
     */
   static abstract class Item {
        public abstract String getTitle();

        public abstract String execute();

        public abstract boolean isClick();

        public static String getText() {
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

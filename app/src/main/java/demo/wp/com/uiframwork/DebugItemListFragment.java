package demo.wp.com.uiframwork;

import java.util.ArrayList;
import java.util.List;

import demo.wp.com.uiframwork.uiframwork.list.BaseListItemFragment;

/**
 * Created by Administrator on 2015/3/8.
 */
public class DebugItemListFragment extends BaseListItemFragment {

	private static List<ItemInstance>
			ITEM_LIST = new ArrayList<ItemInstance>();
	static {
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				resetAll();
				return null;
			}

			@Override
			public String getTitle() {
				return "Rest all item!";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 1 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 1";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 2 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 2";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 3 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 3";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 4 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 4";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 5 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 5";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 6 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 6";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 7 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 7";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 8 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 8";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 9 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 9";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 10 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 10";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 11 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 11";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 12 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 12";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 13 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 13";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
		ITEM_LIST.add(new ItemInstance() {
			@Override
			public String executeAction() {
				isClick = true;
				return "This is item 14 on click!";
			}

			@Override
			public String getTitle() {
				return "Item 14";
			}

			@Override
			public boolean isClick() {
				return isClick;
			}

			@Override
			public void reset() {
				isClick = false;
			}
		});
	}

	@Override
	public List<ItemInstance> getItemInstanceList() {
		return ITEM_LIST;
	}
}

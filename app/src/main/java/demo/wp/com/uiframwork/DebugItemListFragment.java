package demo.wp.com.uiframwork;

import java.util.ArrayList;
import java.util.List;

import demo.wp.com.uiframwork.uiframwork.list.BaseListItemFragment;

/**
 * Created by Administrator on 2015/3/8.
 */
public class DebugItemListFragment extends BaseListItemFragment {
	
	private static List<ItemInstance> 
			ITEM_INSTANCES_LIST = new ArrayList<ItemInstance>();
	
	static {
		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 1 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 1 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 2 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 2 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 3 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 3 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 4 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 4 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 5 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 5 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 6 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 6 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 7 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 7 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 8 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 8 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 9 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 9 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 10 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 10 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 11 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 11 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 12 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 12 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 13 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 13 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 14 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 14 item on click!";
			}
		});

		ITEM_INSTANCES_LIST.add(new ItemInstance() {
			@Override
			public String getTitle() {
				return "Touch 15 item to show this content.";
			}

			@Override
			public String onItemClick() {
				return "This 15 item on click!";
			}
		});
	}
	
	@Override
	public List<ItemInstance> getItemInstanceList() {
		return ITEM_INSTANCES_LIST;
	}
}

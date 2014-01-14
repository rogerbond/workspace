package ch.zh.rh.seasonalfruitsandvegetables;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyArrayAdapter extends ArrayAdapter<String> {
	
	public MyArrayAdapter(Context context, String[] strings) {
		super(context, android.R.layout.simple_list_item_1, strings);
	}

}

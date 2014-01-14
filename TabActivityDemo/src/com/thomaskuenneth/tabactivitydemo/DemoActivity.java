package com.thomaskuenneth.tabactivitydemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DemoActivity extends ListActivity {

	private static final String[] strings = { "A", "B", "C", "..." };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, strings));
	}
}

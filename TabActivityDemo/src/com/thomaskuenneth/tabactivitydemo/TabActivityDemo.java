package com.thomaskuenneth.tabactivitydemo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabActivityDemo extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final TabHost tabHost = getTabHost();
		// erstes Tab: eine View
		LayoutInflater.from(this).inflate(R.layout.tab1,
				tabHost.getTabContentView(), true);
		TabSpec ts1 = tabHost.newTabSpec("tab-1");
		ts1.setIndicator(getString(R.string.str_view), getResources()
				.getDrawable(android.R.drawable.ic_secure));
		ts1.setContent(R.id.ll1);
		tabHost.addTab(ts1);
		// zweites Tab: ein Intent
		TabSpec ts2 = tabHost.newTabSpec("tab-2");
		ts2.setIndicator(getString(R.string.str_activity));
		Intent intent = new Intent(this, DemoActivity.class);
		ts2.setContent(intent);
		tabHost.addTab(ts2);
	}
}
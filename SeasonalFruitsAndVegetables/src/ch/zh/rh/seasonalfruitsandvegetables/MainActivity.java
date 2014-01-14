package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private static MyArrayAdapter adapter = null;
	private static ListView listView = null;
	private static Fruits fruits = null;
	private static String fruits_label = null;
	private static Vegetables vegetables = null;
	private static String vegetables_label = null;
	private static Berry berry = null;
	private static String berry_label = null;
	private static Herbs herbs = null;
	private static String herbs_label = null;
	private static Mushrooms mushrooms = null;
	private static String mushrooms_label = null;
	private static ProSpecieRara proSpecieRara = null;
	private static String proSpecieRara_label = null;
	private static String month = null;
	private static TextView textView = null;
	
	private static final String tag = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_list);
		
		month = this.getMonthName();
		fruits_label = getString(R.string.fruits_label, month);
		vegetables_label = getString(R.string.vegetables_label, month);
		berry_label = getString(R.string.berry_label, month);
		herbs_label = getString(R.string.herbs_label, month);
		mushrooms_label = getString(R.string.mushrooms_label, month);
		proSpecieRara_label = getString(R.string.prospecierara_label, month);
		
		textView = (TextView) findViewById(R.id.label);
		textView.setText(fruits_label);
		textView.setTextColor(getResources().getColor(R.color.fruits_color));
		textView.setBackgroundColor(getResources().getColor(R.color.background_color));
		
		fruits = new Fruits(this);
		vegetables = new Vegetables(this);
		berry = new Berry(this);
		herbs = new Herbs(this);
		mushrooms = new Mushrooms(this);
		proSpecieRara = new ProSpecieRara(this);

		adapter = new MyArrayAdapter(this, fruits.getFruits());
		
		listView = (ListView) findViewById(R.id.mylist1);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	        	//Log.i(tag, "onItemClick");
	        	try {
	        		//Log.i(tag, adapter.getItem(position));
	        		String url = getString(R.string.wikipedia_url, adapter.getItem(position));
	        		Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse(url));
					startActivity(viewIntent);
	        	} catch (IndexOutOfBoundsException e) {
	        		Log.e(tag, e.toString());
	        	}
	       }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_fruits:
			adapter = new MyArrayAdapter(this, fruits.getFruits());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(fruits_label);
			textView.setTextColor(getResources().getColor(R.color.fruits_color));
			return true;
		case R.id.menu_vegetables:
			adapter = new MyArrayAdapter(this, vegetables.getVegetables());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(vegetables_label);
			textView.setTextColor(getResources().getColor(R.color.vegetables_color));
			return true;
		case R.id.menu_berry:
			adapter = new MyArrayAdapter(this, berry.getBerry());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(berry_label);
			textView.setTextColor(getResources().getColor(R.color.berry_color));
			return true;
		case R.id.menu_herbs:
			adapter = new MyArrayAdapter(this, herbs.getHerbs());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(herbs_label);
			textView.setTextColor(getResources().getColor(R.color.herbs_color));
			return true;
		case R.id.menu_mushrooms:
			adapter = new MyArrayAdapter(this, mushrooms.getMushrooms());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(mushrooms_label);
			textView.setTextColor(getResources().getColor(R.color.mushrooms_color));
			return true;
		case R.id.menu_prospecierara:
			adapter = new MyArrayAdapter(this, proSpecieRara.getProSpecieRara());
			listView = (ListView) findViewById(R.id.mylist1);
			listView.setAdapter(adapter);
			textView = (TextView) findViewById(R.id.label);
			textView.setText(proSpecieRara_label);
			textView.setTextColor(getResources().getColor(R.color.prospecierara_color));
			return true;
		//case R.id.menu_end:
		//	finish();
		//	return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	private String getMonthName() {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			return getString(R.string.january);
		}
		if (Calendar.FEBRUARY == month) {
			return getString(R.string.february);
		}
		if (Calendar.MARCH == month) {
			return getString(R.string.march);
		}
		if (Calendar.APRIL == month) {
			return getString(R.string.april);
		}
		if (Calendar.MAY == month) {
			return getString(R.string.may);
		}
		if (Calendar.JUNE == month) {
			return getString(R.string.june);
		}
		if (Calendar.JULY == month) {
			return getString(R.string.july);
		}
		if (Calendar.AUGUST == month) {
			return getString(R.string.august);
		}
		if (Calendar.SEPTEMBER == month) {
			return getString(R.string.september);
		}
		if (Calendar.OCTOBER == month) {
			return getString(R.string.october);
		}
		if (Calendar.NOVEMBER == month) {
			return getString(R.string.november);
		}
		if (Calendar.DECEMBER == month) {
			return getString(R.string.december);
		}
		return null;
	}
	
}

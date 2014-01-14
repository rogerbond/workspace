package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class Fruits {
	
	private static final String tag = Fruits.class.getSimpleName();
	String[] fruits = null;
	
	public Fruits (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			fruits = context.getResources().getStringArray(R.array.January_Fruits);
		}
		if (Calendar.FEBRUARY == month) {
			fruits = context.getResources().getStringArray(R.array.February_Fruits);
		}
		if (Calendar.MARCH == month) {
			fruits = context.getResources().getStringArray(R.array.March_Fruits);
		}
		if (Calendar.APRIL == month) {
			fruits = context.getResources().getStringArray(R.array.April_Fruits);
		}
		if (Calendar.MAY == month) {
			fruits = context.getResources().getStringArray(R.array.May_Fruits);
		}
		if (Calendar.JUNE == month) {
			fruits = context.getResources().getStringArray(R.array.June_Fruits);
		}
		if (Calendar.JULY == month) {
			fruits = context.getResources().getStringArray(R.array.July_Fruits);
		}
		if (Calendar.AUGUST == month) {
			fruits = context.getResources().getStringArray(R.array.August_Fruits);
		}
		if (Calendar.SEPTEMBER == month) {
			fruits = context.getResources().getStringArray(R.array.September_Fruits);
		}
		if (Calendar.OCTOBER == month) {
			fruits = context.getResources().getStringArray(R.array.October_Fruits);
		}
		if (Calendar.NOVEMBER == month) {
			fruits = context.getResources().getStringArray(R.array.November_Fruits);
		}
		if (Calendar.DECEMBER == month) {
			fruits = context.getResources().getStringArray(R.array.December_Fruits);
		}
		for (int i=0; i< fruits.length; i++) {
			Log.i(tag, "Fruit: " + fruits[i]);
		}
	}
	
	public String[] getFruits() {
		return fruits;
	}

}

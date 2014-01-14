package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class Mushrooms {
	
	private static final String tag = Mushrooms.class.getSimpleName();
	String[] mushrooms = null;
	
	public Mushrooms (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			mushrooms = context.getResources().getStringArray(R.array.January_Mushrooms);
		}
		if (Calendar.FEBRUARY == month) {
			mushrooms = context.getResources().getStringArray(R.array.February_Mushrooms);
		}
		if (Calendar.MARCH == month) {
			mushrooms = context.getResources().getStringArray(R.array.March_Mushrooms);
		}
		if (Calendar.APRIL == month) {
			mushrooms = context.getResources().getStringArray(R.array.April_Mushrooms);
		}
		if (Calendar.MAY == month) {
			mushrooms = context.getResources().getStringArray(R.array.May_Mushrooms);
		}
		if (Calendar.JUNE == month) {
			mushrooms = context.getResources().getStringArray(R.array.June_Mushrooms);
		}
		if (Calendar.JULY == month) {
			mushrooms = context.getResources().getStringArray(R.array.July_Mushrooms);
		}
		if (Calendar.AUGUST == month) {
			mushrooms = context.getResources().getStringArray(R.array.August_Mushrooms);
		}
		if (Calendar.SEPTEMBER == month) {
			mushrooms = context.getResources().getStringArray(R.array.September_Mushrooms);
		}
		if (Calendar.OCTOBER == month) {
			mushrooms = context.getResources().getStringArray(R.array.October_Mushrooms);
		}
		if (Calendar.NOVEMBER == month) {
			mushrooms = context.getResources().getStringArray(R.array.November_Mushrooms);
		}
		if (Calendar.DECEMBER == month) {
			mushrooms = context.getResources().getStringArray(R.array.December_Mushrooms);
		}
		for (int i=0; i< mushrooms.length; i++) {
			Log.i(tag, "Fruit: " + mushrooms[i]);
		}
	}
	
	public String[] getMushrooms() {
		return mushrooms;
	}

}

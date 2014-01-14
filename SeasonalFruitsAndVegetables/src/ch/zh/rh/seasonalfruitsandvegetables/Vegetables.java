package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class Vegetables {
	
	private static final String tag = Vegetables.class.getSimpleName();
	String[] vegetables = null;
	
	public Vegetables (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			vegetables = context.getResources().getStringArray(R.array.January_Vegetables);
		}
		if (Calendar.FEBRUARY == month) {
			vegetables = context.getResources().getStringArray(R.array.February_Vegetables);
		}
		if (Calendar.MARCH == month) {
			vegetables = context.getResources().getStringArray(R.array.March_Vegetables);
		}
		if (Calendar.APRIL == month) {
			vegetables = context.getResources().getStringArray(R.array.April_Vegetables);
		}
		if (Calendar.MAY == month) {
			vegetables = context.getResources().getStringArray(R.array.May_Vegetables);
		}
		if (Calendar.JUNE == month) {
			vegetables = context.getResources().getStringArray(R.array.June_Vegetables);
		}
		if (Calendar.JULY == month) {
			vegetables = context.getResources().getStringArray(R.array.July_Vegetables);
		}
		if (Calendar.AUGUST == month) {
			vegetables = context.getResources().getStringArray(R.array.August_Vegetables);
		}
		if (Calendar.SEPTEMBER == month) {
			vegetables = context.getResources().getStringArray(R.array.September_Vegetables);
		}
		if (Calendar.OCTOBER == month) {
			vegetables = context.getResources().getStringArray(R.array.October_Vegetables);
		}
		if (Calendar.NOVEMBER == month) {
			vegetables = context.getResources().getStringArray(R.array.November_Vegetables);
		}
		if (Calendar.DECEMBER == month) {
			vegetables = context.getResources().getStringArray(R.array.December_Vegetables);
		}
		for (int i=0; i< vegetables.length; i++) {
			Log.i(tag, "Vegetables: " + vegetables[i]);
		}
	}
	
	public String[] getVegetables() {
		return vegetables;
	}

}

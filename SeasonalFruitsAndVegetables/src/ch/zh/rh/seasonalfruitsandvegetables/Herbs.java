package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class Herbs {
	
	private static final String tag = Herbs.class.getSimpleName();
	String[] herbs = null;
	
	public Herbs (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			herbs = context.getResources().getStringArray(R.array.January_Herbs);
		}
		if (Calendar.FEBRUARY == month) {
			herbs = context.getResources().getStringArray(R.array.February_Herbs);
		}
		if (Calendar.MARCH == month) {
			herbs = context.getResources().getStringArray(R.array.March_Herbs);
		}
		if (Calendar.APRIL == month) {
			herbs = context.getResources().getStringArray(R.array.April_Herbs);
		}
		if (Calendar.MAY == month) {
			herbs = context.getResources().getStringArray(R.array.May_Herbs);
		}
		if (Calendar.JUNE == month) {
			herbs = context.getResources().getStringArray(R.array.June_Herbs);
		}
		if (Calendar.JULY == month) {
			herbs = context.getResources().getStringArray(R.array.July_Herbs);
		}
		if (Calendar.AUGUST == month) {
			herbs = context.getResources().getStringArray(R.array.August_Herbs);
		}
		if (Calendar.SEPTEMBER == month) {
			herbs = context.getResources().getStringArray(R.array.September_Herbs);
		}
		if (Calendar.OCTOBER == month) {
			herbs = context.getResources().getStringArray(R.array.October_Herbs);
		}
		if (Calendar.NOVEMBER == month) {
			herbs = context.getResources().getStringArray(R.array.November_Herbs);
		}
		if (Calendar.DECEMBER == month) {
			herbs = context.getResources().getStringArray(R.array.December_Herbs);
		}
		for (int i=0; i< herbs.length; i++) {
			Log.i(tag, "Fruit: " + herbs[i]);
		}
	}
	
	public String[] getHerbs() {
		return herbs;
	}

}

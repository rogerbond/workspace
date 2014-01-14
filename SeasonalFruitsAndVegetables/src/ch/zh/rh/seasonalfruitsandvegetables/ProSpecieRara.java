package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class ProSpecieRara {
	
	private static final String tag = ProSpecieRara.class.getSimpleName();
	String[] proSpecieRara = null;
	
	public ProSpecieRara (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.January_ProSpecieRara);
		}
		if (Calendar.FEBRUARY == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.February_ProSpecieRara);
		}
		if (Calendar.MARCH == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.March_ProSpecieRara);
		}
		if (Calendar.APRIL == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.April_ProSpecieRara);
		}
		if (Calendar.MAY == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.May_ProSpecieRara);
		}
		if (Calendar.JUNE == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.June_ProSpecieRara);
		}
		if (Calendar.JULY == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.July_ProSpecieRara);
		}
		if (Calendar.AUGUST == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.August_ProSpecieRara);
		}
		if (Calendar.SEPTEMBER == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.September_ProSpecieRara);
		}
		if (Calendar.OCTOBER == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.October_ProSpecieRara);
		}
		if (Calendar.NOVEMBER == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.November_ProSpecieRara);
		}
		if (Calendar.DECEMBER == month) {
			proSpecieRara = context.getResources().getStringArray(R.array.December_ProSpecieRara);
		}
		for (int i=0; i< proSpecieRara.length; i++) {
			Log.i(tag, "Fruit: " + proSpecieRara[i]);
		}
	}
	
	public String[] getProSpecieRara() {
		return proSpecieRara;
	}

}

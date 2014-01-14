package ch.zh.rh.seasonalfruitsandvegetables;

import java.util.Calendar;

import android.content.Context;
import android.util.Log;

public class Berry {
	
	private static final String tag = Berry.class.getSimpleName();
	String[] berry = null;
	
	public Berry (Context context) {
		int month = Calendar.getInstance().get(Calendar.MONTH);
		if (Calendar.JANUARY == month) {
			berry = context.getResources().getStringArray(R.array.January_Berry);
		}
		if (Calendar.FEBRUARY == month) {
			berry = context.getResources().getStringArray(R.array.February_Berry);
		}
		if (Calendar.MARCH == month) {
			berry = context.getResources().getStringArray(R.array.March_Berry);
		}
		if (Calendar.APRIL == month) {
			berry = context.getResources().getStringArray(R.array.April_Berry);
		}
		if (Calendar.MAY == month) {
			berry = context.getResources().getStringArray(R.array.May_Berry);
		}
		if (Calendar.JUNE == month) {
			berry = context.getResources().getStringArray(R.array.June_Berry);
		}
		if (Calendar.JULY == month) {
			berry = context.getResources().getStringArray(R.array.July_Berry);
		}
		if (Calendar.AUGUST == month) {
			berry = context.getResources().getStringArray(R.array.August_Berry);
		}
		if (Calendar.SEPTEMBER == month) {
			berry = context.getResources().getStringArray(R.array.September_Berry);
		}
		if (Calendar.OCTOBER == month) {
			berry = context.getResources().getStringArray(R.array.October_Berry);
		}
		if (Calendar.NOVEMBER == month) {
			berry = context.getResources().getStringArray(R.array.November_Berry);
		}
		if (Calendar.DECEMBER == month) {
			berry = context.getResources().getStringArray(R.array.December_Berry);
		}
		for (int i=0; i< berry.length; i++) {
			Log.i(tag, "Fruit: " + berry[i]);
		}
	}
	
	public String[] getBerry() {
		return berry;
	}

}

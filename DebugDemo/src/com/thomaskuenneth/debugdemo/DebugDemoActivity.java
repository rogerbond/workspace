package com.thomaskuenneth.debugdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugDemoActivity extends Activity {

	private static final String TAG = DebugDemoActivity.class.getSimpleName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		int fakultaet = 1;
		System.out.println("0! = " + fakultaet);
		for (int i = 1; i <= 5; i++) {
			fakultaet = i * fakultaet;
			System.out.println(i + "! = " + fakultaet);
		}

		Log.v(TAG,
				"ausführliche Protokollierung, nicht in Produktion verwenden");
		Log.d(TAG, "Debug-Ausgaben");
		Log.i(TAG, "Informationen");
		Log.w(TAG, "Warnungen");
		Log.e(TAG, "Fehler");
		
		Log.i(TAG, "fib(5) = " + fib(5));
	}
	
	private int fib(int n) {
		int fib;
		switch (n) {
		case 0:
			fib = 0;
		case 1:
			fib = 1;
			break;
		default:
			fib = fib(n-1) + fib(n-2);
		}
		return fib;
	}

}
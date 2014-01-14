/*
 * Zodiak.java
 * 
 * (c) Thomas K�nneth 2010, 2012
 * Alle Rechte beim Autor.
 */
package com.thomaskuenneth.tierkreiszeichen;

import java.util.Calendar;
import java.util.Hashtable;

/**
 * Diese Klasse bildet die 12 Tierkreiszeichen in eine {@link Hashtable} ab,
 * deren Schl�ssel der Monat ist. Die Datumsangaben stellen Mittelwerte dar und
 * beziehen sich auf ein Jahr mit 365 Tagen. Schaltjahre sind in den Datierungen
 * der Tierkreiszeichen also nicht ber�cksichtigt. Ausf�hrlichen Informationen
 * h�lt Wikipedia unter {@link http://de.wikipedia.org/wiki/Tierkreiszeichen}
 * bereit.
 * 
 * @author Thomas K�nneth
 * 
 */
public final class Zodiak extends Hashtable<Integer, Tierkreiszeichen> {
	
	private static final long serialVersionUID = -3808137176077412483L;
	
	private static final Zodiak INSTANCE = new Zodiak();

	private Zodiak() {
		put(Calendar.JANUARY, new Tierkreiszeichen(21, Calendar.JANUARY,
				R.string.aquarius));
		put(Calendar.FEBRUARY, new Tierkreiszeichen(20, Calendar.FEBRUARY,
				R.string.pisces));
		put(Calendar.MARCH, new Tierkreiszeichen(21, Calendar.MARCH,
				R.string.aries));
		put(Calendar.APRIL, new Tierkreiszeichen(21, Calendar.APRIL,
				R.string.taurus));
		put(Calendar.MAY, new Tierkreiszeichen(22, Calendar.MAY,
				R.string.gemini));
		put(Calendar.JUNE, new Tierkreiszeichen(22, Calendar.JUNE,
				R.string.cancer));
		put(Calendar.JULY,
				new Tierkreiszeichen(24, Calendar.JULY, R.string.leo));
		put(Calendar.AUGUST, new Tierkreiszeichen(24, Calendar.AUGUST,
				R.string.virgo));
		put(Calendar.SEPTEMBER, new Tierkreiszeichen(24, Calendar.SEPTEMBER,
				R.string.libra));
		put(Calendar.OCTOBER, new Tierkreiszeichen(24, Calendar.OCTOBER,
				R.string.scorpius));
		put(Calendar.NOVEMBER, new Tierkreiszeichen(23, Calendar.NOVEMBER,
				R.string.sagittarius));
		put(Calendar.DECEMBER, new Tierkreiszeichen(22, Calendar.DECEMBER,
				R.string.capricornus));
	}

	/**
	 * Liefert eine Referenz auf ein Element der Hashtable, die das Sternzeichen
	 * des �bergebenen Monats repr�sentiert.
	 * 
	 * @param monat
	 *            Monat, zum Beispiel {@code Calendar.JUNE}
	 * @return Instanz eines {@link Tierkreiszeichen}s
	 */
	public static Tierkreiszeichen getTierkreiszeichenFuerMonat(int monat) {
		return INSTANCE.get(monat);
	}
}

/**
 * 
 */
package com.nublo.loadservice.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import com.nublo.loadservice.common.Constants;

/**
 * @author DELL
 *
 */
public class Utility {

	public static int calculateCheckDigitUsingLuhn(String cardNumber) {
		int sum = 0;
		Integer checkDigit = 0;
		boolean isDouble = false;
		for (int i = 0; i < cardNumber.length(); i++) {
			char c = cardNumber.charAt(i);
			int digit = Integer.parseInt(String.valueOf(c));
			if (isDouble) {
				int tmp = digit * 2;
				if (tmp >= 10) {
					tmp = tmp - 9;
				}
				sum = sum + tmp;
				isDouble = false;
			} else {
				sum = sum + digit;
				isDouble = true;
			}
		}
		sum = sum * 9;
		checkDigit = sum % 10;
		return checkDigit;
	}

	public static String getClientIdWithJulianDate(String clientId) {
		String result = "";
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		String yearStr = String.format("%04d", year).substring(2);
		int century = Integer.parseInt(String.valueOf(((year / 100) + 1)).substring(1));
		int julian = Integer.parseInt(String.format("%d%s%03d", century, yearStr, calendar.get(Calendar.DAY_OF_YEAR)));
		result = clientId + String.valueOf(julian);
		return result;
	}

	// return only current date yyyy-MM-dd
	public static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}

	public static Date calculateCardExpiry(int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, months);
		Date dat = calendar.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format1.format(dat);
		LocalDate convertedDate = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		convertedDate = convertedDate.withDayOfMonth(convertedDate.getMonth().length(convertedDate.isLeapYear()));
		Instant instant = Instant.from(convertedDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Date lastdate = Date.from(instant);
		return lastdate;
	}

	public static boolean isNullorBlank(Object object) {
		if (null == object) {
			return true;
		} else if (Constants.BLANK.equals(object.toString())) {
			return true;
		}
		return false;
	}
}

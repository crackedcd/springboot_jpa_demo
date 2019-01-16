package com.mm.itempvuv.common.util;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

@Service
public class DateUtil {

	public static String getDateStrBeforeToday(int days) {
		Calendar calendar = getInstance();
		calendar.add(DATE, -days);
		return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
	}

	public static Date getDateBeforeToday(int days) {
		// return stringToDate(getDateStrBeforeToday(days));
		Calendar calendar = getInstance();
		calendar.add(DATE, -days);
		return calendar.getTime();
	}

	public static String getTimeStrBeforeNow(int seconds) {
		Calendar calendar = getInstance();
		int milliseconds = seconds * 1000;
		calendar.add(MILLISECOND, -milliseconds);
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
	}

	public static Date getTimeBeforeNow(int seconds) {
		return stringToDate(getTimeStrBeforeNow(seconds));
	}

	public static Date stringToDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String dateToString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}

	public static int getDayForWeek(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			return 7;
		} else {
			return c.get(Calendar.DAY_OF_WEEK) - 1;
		}
	}

	public static Date timestampToDate(Timestamp ts) {
		return new Date(ts.getTime());
	}

	public static Timestamp dateToTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	public static java.sql.Date utilDateToSQLDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

}

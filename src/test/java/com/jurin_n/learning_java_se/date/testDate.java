package com.jurin_n.learning_java_se.date;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.hamcrest.Matcher;
import org.junit.Test;

public class testDate {

	@Test
	public void test() {
		/*
		 * y:年
		 * M:月
		 * d:日
		 * E:曜日
		 * a/p:午前/午後
		 * H:時(0〜23)
		 * K:時(0〜11)
		 * m:分
		 * s:秒
		 */
		//RFC1123形式の日付。タイムゾーンはGMT(グリニッジ標準時)。
		DateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", java.util.Locale.US);
		try {
			Date date = df.parse("Mon, 18 Aug 2015 12:00:00 GMT");
			Date date2 = df.parse("Mon, 18 Aug 2015 12:15:00 GMT");
			
			//日付の差分をミリ秒で取得。15分差なので15*60*1000ミリ秒になる予定。
			assertEquals(date2.getTime()-date.getTime(),15*60*1000L);
			
			//現在時刻取得
			Date now = new Date();
			//GMTで表示
			df.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println("GMT=" + df.format(now));
			//JSTで表示
			df.setTimeZone(TimeZone.getTimeZone("JST"));
			System.out.println("JST=" + df.format(now));
			
			/* 有効なタイムゾーンを列挙 */
			String[] id = TimeZone.getAvailableIDs();
			for(int i=0;i<id.length;i++){
				System.out.println("id["+i+"]=" + id[i]);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

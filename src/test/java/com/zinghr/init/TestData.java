package com.zinghr.init;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class TestData {

	public static String company_code = "KIWIQA";
	public static String employe_code = "Admin";
	public static String password = "Admin@123";
	public static String blank = " ";
	
	public static String rndmString(int length)
	{
		String rnd1 = RandomStringUtils.randomAlphabetic(length);
		return rnd1;
		
	}
	
	
	public static int rndmNumber(int length) {

		Random randm = new Random();
		int numNoRange = randm.nextInt();
		return numNoRange;

	}
	
	public static String rndmemail(int i)
	{
		String email = new StringBuilder(30).append("kiwitest").append(rndmNumber(2)).append("@mailinator.com").toString();
		return email;
	}
	
	public static String company_code_s = "Kiwitest";
	
	public static String dispayname_s = "Test";
	public static String email_s = "tarpan999@mailinator.com";
	public static String contactno_s = "9429186891";
}

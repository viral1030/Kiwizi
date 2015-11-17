package com.zinghr.init;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class TestData {

	public static String company_code = "KIWIQA";
	public static String employe_code = "Admin";
	public static String password = "Admin@123";
	
	public static String company_code_dl = "KIWIQA123";
	public static String employe_code_dl = "Admin123";
	public static String password_dl = "Admin@1234";
	
	public static String company_code_se = "AMBUJA";
	public static String employe_code_se = "ADMIN";
	public static String password_se = "Baps@2000";
	public static String password_s = "Baps@200";
	public static String facebook = "https://www.facebook.com/zinghr";
	public static String twitter = "https://twitter.com/ZingHR";
	public static String youtube= "https://www.youtube.com/channel/";
	public static String gplus = "https://plus.google.com/+Zinghr/posts";
	public static String linkedin= "https://www.linkedin.com/company/zinghr";
	
	public static String blank = " ";
	
	public static String rndmString(int length)
	{
		String rnd1 = RandomStringUtils.random(length);
		return rnd1;
		
	}
	
	
	public static int rndmNumber(int length) {

		Random randm = new Random();
		int numNoRange = randm.nextInt();
		return numNoRange;

	}
	
	public static String rndmemail(int i)
	{
		String email = "Kiwitest_"+rndmemail(4)+"@mailinator.com";
		return email;
	}
	
	public static String company_code_s = "Kiwitest";
	
	public static String dispayname_s = "Test";
	public static String email_s = "tarpan999@mailinator.com";
	public static String contactno_s = "9429186891";
}

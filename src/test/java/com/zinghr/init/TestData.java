package com.zinghr.init;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class TestData {

	public static String company_code = "KIWIQA";
	public static String employe_code = "Admin";
	public static String password = "Admin@123";
	public static String blank = " ";
	public static String invalid = "%&^%6545as";
	
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
	
	public static String alphanum(int i)
	{
		String alphanumeric = new StringBuilder(7).append("Test").append(rndmNumber(2)).toString();
		return alphanumeric;
	}
	
	public static String rndmemail(int i)
	{
		String email = new StringBuilder(30).append("kiwitest").append(rndmNumber(i)).append("@mailinator.com").toString();
		return email;
	}
	
	public static String rndm_invalid_email(int i)
	{
		String email = new StringBuilder(30).append("kw").append(rndmNumber(i)).append("@mi@ki").toString();
		return email;
	}
	
	public static String company_code_s = "Kiwitest";
	
	public static String dispayname_s = "Test";
	public static String email_s = "tarpan999@mailinator.com";
	public static String contactno_s = "9429186891";
	public static String invalidContactno = "dsjh(*&^(^("; 
	
	public static String largeContactNum = new StringBuilder(14).append(rndmNumber(14)).append(rndmNumber(14)).toString(); 
}

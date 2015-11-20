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
	public static String gplus = "https://plus.google.com/+Zinghr";
	public static String linkedin= "https://www.linkedin.com/company/zinghr";
	
	public static String blank = " ";
	public static String invalid = "%&^%6545as";
<<<<<<< HEAD

	public static String rndmString(int length) {
=======
	
	public static String rndmString(int length)
	{
>>>>>>> branch 'master' of https://github.com/viral1030/Kiwizi.git
		String rnd1 = RandomStringUtils.randomAlphabetic(length);
		return rnd1;

	}

	public static int rndmNumber(int length) {

		Random randm = new Random();
		int numNoRange = randm.nextInt();
		return numNoRange;

	}
<<<<<<< HEAD

	public static String rndmemail(int i) {
		String email = new StringBuilder(30).append("kiwitest")
				.append(rndmNumber(2)).append("@mailinator.com").toString();
=======
	
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
>>>>>>> branch 'master' of https://github.com/viral1030/Kiwizi.git
		return email;
	}

	public static String company_code_s = "Kiwitest";

	public static String dispayname_s = "Test";
	public static String email_s = "tarpan999@mailinator.com";
	public static String contactno_s = "9429186891";
	public static String invalidContactno = "dsjh(*&^(^("; 
	
	public static String largeContactNum = new StringBuilder(14).append(rndmNumber(14)).append(rndmNumber(14)).toString(); 
}

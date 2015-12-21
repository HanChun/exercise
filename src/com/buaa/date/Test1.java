package com.buaa.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test1 {
	public static void main(String[] args){
		Date date = new Date();//util.date	
		System.out.println(date);
		System.out.println(date.getTime());
		
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println(sqlDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//java.util.Date×ª»»³Éjava.lang.String
		String str = sdf.format(date);
		System.out.println(str);
		
		String ds = "2010-05-01";
		try {
			Date d = sdf.parse(ds);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

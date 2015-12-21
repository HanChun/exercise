package com.buaa.date;

import java.util.Date;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		System.out.println(d2);
	}
}

package com.buaa.reflect1;

public class Test {
	public static void main(String[] args){
		String className = "com.buaa.reflect1.person";
		try {
			Object o = Class.forName(className).newInstance();
			Person p = (Person)o;
			System.out.println(p.getName()+" " +p.getAge());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

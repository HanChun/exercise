package com.buaa.reflect2;

import java.lang.reflect.Method;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			String className = "com.buaa.reflect2.Reflect";
			Class clazz = Class.forName(className);
	
				Object o = clazz.newInstance();
				Method[] ms = clazz.getDeclaredMethods();
				for(Method m : ms){
					m.setAccessible(true);
					Class[] params = m.getParameterTypes();
					
				}
				
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

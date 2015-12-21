package com.buaa.reflect2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args){		
		try {
			String className = "com.buaa.reflect2.Reflect";
			Class clazz = Class.forName(className);
			Object o = clazz.newInstance();
			
			Method[] ms1 = clazz.getMethods();//返回加载类中不包括private的方法
			Method[] ms =  clazz.getDeclaredMethods();//返回加载类中的所有的方法
			for(Method m:ms){
				System.out.println(m.getName());//取得方法名
				System.out.println(m.getModifiers());//返回方法的修饰符,以整数型表示
				m.setAccessible(true);//允许调用私有方法
				Class[] params = m.getParameterTypes();//返回的是一个数组,数组中每一个参数代表一个方法中所声明的参数类型
				if(params.length == 0){
						m.invoke(o, null);	//调用类中的方法  invoke(class,method)			
				}else{
						Object[] os = new Object[params.length];
						int index = 0;
						for(Class param : params){
							if(param.getName().equals("java.lang.String")){
								os[index] = "Jim" ;
							}else if (param.getName().equals("int")){
								os[index] = 25 ;
							}
							index++;
						}
						m.invoke(o, os);
					}
				}
			
			Field[] fs1 = clazz.getFields(); //返回非private类的属性
			Field[] fs = clazz.getDeclaredFields();//返回所有类的属性
			for(Field f:fs){
				f.setAccessible(true);
				if(f.getType().getName().equals("java.lang.String")){
					f.set(o, "HelloWorld");
				}else if(f.getType().getName().equals("java.lang.String")) {
					f.set(o, 10);
				}
				System.out.println(f.get(o));				
			}
		
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
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

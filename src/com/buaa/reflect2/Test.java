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
			
			Method[] ms1 = clazz.getMethods();//���ؼ������в�����private�ķ���
			Method[] ms =  clazz.getDeclaredMethods();//���ؼ������е����еķ���
			for(Method m:ms){
				System.out.println(m.getName());//ȡ�÷�����
				System.out.println(m.getModifiers());//���ط��������η�,�������ͱ�ʾ
				m.setAccessible(true);//�������˽�з���
				Class[] params = m.getParameterTypes();//���ص���һ������,������ÿһ����������һ���������������Ĳ�������
				if(params.length == 0){
						m.invoke(o, null);	//�������еķ���  invoke(class,method)			
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
			
			Field[] fs1 = clazz.getFields(); //���ط�private�������
			Field[] fs = clazz.getDeclaredFields();//���������������
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

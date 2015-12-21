package com.buaa.inner1;

public class Outer {
	private int i =0 ;
	public void fun1(){
		System.out.println("fun1......");
		Inner1 in = new Inner1();
		in.fun2();
	}
	
	class Inner1{
		private int j =5;
		public void fun2(){
			System.out.println("fun2......");
		}
	}
	
	static class Inner2{
		public void fun3(){
			System.out.println("fun3.....");
		}		
	}
}


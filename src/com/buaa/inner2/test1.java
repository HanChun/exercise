package com.buaa.inner2;
interface A{
	public void fun();
}

public class test1 {
	public static void main(String args[]){
		A a = new A(){
			public void fun(){
				System.out.println("Hello World.");
			}
		};
		a.fun();
	}
}

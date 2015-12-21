package com.buaa.inner2;
interface Aa{
	public void fun();
}
class X implements Aa{
	public void fun(){
		System.out.println("Hello World.");
	}
}

public class test4 {
	public static void main(String args[]){
		Aa a = new X();
		a.fun();
	}
}

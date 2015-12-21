package com.buaa.inner2;
interface Ab{
	public void fun();
}
public class test5 {
	public static void main(String args[]){
		Ab a = new Ab(){
			public void fun(){
				System.out.println("Hello World.");
			}
		};
		a.fun();
	}

}

package com.buaa.inner2;

class Outter{
	private String title = "Hello World";
	class Inner{
		private String msg = "你好"; //私有
		public void print(){
			System.out.println(Outter.this.title);
		}
	}
	public void fun(){
		Inner in = new Inner();
		System.out.println(in.msg);//直接访问私有属性
	}
}

public class test3 {
	 public static void main(String args[]){
		Outter.Inner in = new Outter().new Inner();
		in.print();
	 }
}

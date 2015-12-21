package com.buaa.inner2;
class Outer{
	private String title ="HELLO WORLD";
	public void fun(){
		new Inner().print();
	}
	class Inner{
		public void print(){
			System.out.println(title);
		}
	}
}


public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out .fun();
	}

}

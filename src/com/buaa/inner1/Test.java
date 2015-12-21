package com.buaa.inner1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner2 in2 = new Outer.Inner2();
		in2.fun3();
		
		Outer o = new Outer();
		Outer.Inner1 in1 = o.new Inner1();
	}
}

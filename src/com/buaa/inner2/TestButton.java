package com.buaa.inner2;

public class TestButton {
	public static int a =5;
	
	public static void main(String[] args){
		Button button = new Button();
		final int i = 10;
		button.setOnclickListen(new OnclickListener(){
			public void click(){
				System.out.println(i);
				a=10;
				System.out.println("µã»÷ºóµÇÂ½");
			}
		});		
	}
}

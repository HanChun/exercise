package com.buaa.singleton;
class Sex{
	private static final Sex Male = new Sex("ÄÐ");
	private static final Sex FEMALE = new Sex("Å®");
	private String title;
	private Sex (String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public static Sex getSex(int ch){
		switch(ch){
		case 0:{return Male;}
		case 1:{return FEMALE;}
		default:{return null;}
		}
	}
}

public class TestDemo {
	public static void main(String args[]){
		Sex mySex = Sex.getSex(0);
		System.out.println(mySex.getTitle());
	}

}

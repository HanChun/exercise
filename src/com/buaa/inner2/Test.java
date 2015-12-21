package com.buaa.inner2;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(){
			public void run(){
				for(int i=0 ; i<30 ; i++){
					System.out.println("Thread:" + i);
				}
			}
		};
		t.start();
		for(int i=0; i<30 ; i++){
			System.out.println("Main: " +i);
		}
	}

}

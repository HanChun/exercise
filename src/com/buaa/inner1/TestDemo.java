package com.buaa.inner1;
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("吃苹果.");	
	}	
}

class Orange implements Fruit{
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("吃橘子.");
	}
}

class Cherry implements Fruit{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃樱桃.");
	}
}

class Factory{
	public static Fruit getInstance(String classname){
		Fruit f = null;
		
			try {
				Class<?> cls =  Class.forName(classname);
				f =(Fruit)cls.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
	}	
}

public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = Factory.getInstance("com.buaa.inner1.Cherry");
		f.eat();
	}
}










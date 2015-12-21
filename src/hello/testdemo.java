package hello;

interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("吃苹果");
	}
}
class Orange implements Fruit{
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃橘子");
	}
}

class Factory{
	public static Fruit getInstance(String className){
		if("apple".equalsIgnoreCase(className)){
			return new Apple();
		}
		if("orange".equalsIgnoreCase(className)){
			return new Orange();
		}
		return null;
	}
}


public class testdemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = Factory.getInstance("orange");
		f.eat();
	}

}

package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		
		Animal animal1 = new Cat(); //부모로 형변환
		animal1.breathe();
		animal1.sound(); //재정의된 메소드가 호출
		
		Animal animal2 = new Dog();
		animal2.breathe();
		animal2.sound();
		
	}

}

abstract class Animal {
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}









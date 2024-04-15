package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		
		//추상 클래스는 인스턴스 생성 불가
//		Computer computer = new Computer();

		DeskTop deskTop = new DeskTop();
		NoteBook noteBook = new NoteBook();
		
		deskTop.trunOn();
		deskTop.trunOff();
		deskTop.display();
		deskTop.typing();
		
		noteBook.trunOn();
		noteBook.trunOff();
		noteBook.display();
		noteBook.typing();

	}

}

abstract class Computer {
	public void trunOn() {
		System.out.println("전원을 켭니다.");
	}
	public void trunOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 컴퓨터마다 화면을 표시하는 방법이 다르니깐 추상메소드로 선언
	public abstract void display();
	
	public abstract void typing();
}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
	
}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}
	
}










package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			animal.sleep();
			animal.move();
			
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			System.out.println();
		}

	}

}

package abstractex.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Car2> list = new ArrayList<>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for (Car2 car2 : list) {
			
			car2.run();
			car2.refuel();
			
			if (car2 instanceof Bus) {
				Bus bus = (Bus) car2;
				bus.takePassenger();
			} else if (car2 instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car2;
				autoCar.load();
			}
		}
		
		
	}

}

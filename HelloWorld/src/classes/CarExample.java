package classes;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car2 cartest = new Car2();
		
		if (cartest instanceof Car2)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		car1.model = "그랜저";
		car1.color = "red";
		car1.price=1000;
		car1.maxSpeed=200;
		car1.drive();
		
		Car car2 = new Car();
		car2.model = "소나타";
		car2.color = "Black";
		car2.price=1500;
		car2.maxSpeed=250;
		car2.drive();
		
		Car[] carAry = new Car[2];
		carAry[0] =car1;
		carAry[1] =car2;

		for(Car c : carAry)
		{
			System.out.println(c.model +","+ c.color);
		}
		
		
	}

}

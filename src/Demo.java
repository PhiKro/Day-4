
public class Demo {

	public static void main(String[] args) {
		
		int n;
		Car porsche911 = new Car();
		porsche911.brand = "Porsche";
		porsche911.colour = "Black";
		porsche911.year = 1976;
		porsche911.minGear = 0;
		porsche911.maxGear = 6;
		porsche911.setCurrentGear(4);
	
		
		Car audiA3 = new Car();
		audiA3.brand = "Audi";
		audiA3.colour = "red";
		audiA3.year = 2015;
		audiA3.minGear = 0;
		audiA3.maxGear = 5;
		audiA3.setCurrentGear(3);
		
		System.out.println(porsche911.brand);
		System.out.println("Aktuellere Gang -Porsche "+porsche911.currentGear);
		System.out.println("Aktuellere Gang -Porsche "+audiA3.currentGear);
		porsche911.nextGear();
		System.out.println(audiA3.currentGear);
		System.out.println("Aktuellere Gang -Porsche "+porsche911.currentGear);
		System.out.println("Aktuellere Gang -Porsche "+audiA3.currentGear);
		
		porsche911.accelerate(10);
		System.out.println("Speed: " + porsche911.currentSpeed);
		porsche911.accelerate(2);
		System.out.println("Speed: " + porsche911.currentSpeed);
		porsche911.accelerate(22);
		System.out.println("Speed: " + porsche911.currentSpeed);
		porsche911.accelerate(100);
		System.out.println("Speed: " + porsche911.currentSpeed);
		porsche911.accelerate(20);
		System.out.println("Speed: " + porsche911.currentSpeed);
		}

}

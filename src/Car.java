
public class Car {

	public int currentGear;
	public int maxGear;
	public int minGear;
	public int currentSpeed;
	public String colour;
	public String brand;
	public int year;
	
	public void nextGear()
	{
		if(currentGear < maxGear) //verhindert das nach dem letzten Gang weiter geschalten wird. 
		{
		currentGear++;
		}
	}
	public void setCurrentGear(int newGear)
	{
		if (newGear <= maxGear && newGear >= minGear) // Stellt sicher das kein nicht zwischen Min und Max liegender Gang ausgewählt wird. 
		{
			currentGear = newGear;
		}
	}
	public int getCurrentGear()
	{
		return currentGear;
	}
	
	public void accelerate() //default Beschleunigung
	{
		currentSpeed += 10;
	}
	
	public void accelerate(int customSpeed) // Variable Beschleunigung mit Übergabe Wert aus Main. 
	{
		currentSpeed += customSpeed;
	}
	
	public void decelerate() //default Verzögerung
	{
		currentSpeed -= 10;
	}
	
	public void decelerate(int customSpeed) //Variable Verzögerung mit Übergabe.  
	{
		currentSpeed -= customSpeed;
	}
}

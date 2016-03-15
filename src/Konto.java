

public class Konto {
	
	private static String Kontoinhaber;
	private static double Kontostand;
	
	public static void setInhaber(String name)
	{
		Kontoinhaber = name;
		Kontostand = 0;
	}

	public void aufbuchen(double betrag)
	{
		Kontostand += betrag;
	}
	
	public void abbuchen(double betrag)
	{
		if (Kontostand >= betrag)
			{
				Kontostand -= betrag;
			}
		else
			{
				System.out.println("Nicht genügend Guthaben, Buchung abgbrochen!");
			}
	}
	
	public void returnKontostand()
	{
		System.out.println("Der Kontostand ist: "+Kontostand);
	}

	public static double getKontostand() {
		return Kontostand;
	}

	public static void setKontostand(double kontostand) {
		Kontostand = kontostand;
	}
}
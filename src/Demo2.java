public class Demo2 {
	
	public static void main()
	{
		Konto NeuesKonto = new Konto();
		String Name = "Philipp Kropik";

		Konto.setInhaber(Name);
		NeuesKonto.returnKontostand();
		NeuesKonto.abbuchen(100);
		
		
		
	}

}

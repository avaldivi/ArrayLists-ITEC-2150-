import java.util.ArrayList;


public class BikeTester
{

	public static void main(String[] args) 
	{
		ArrayList<Bike> bikeAL = new ArrayList<Bike>();
		Bike bike0 = new Bike ();
		bikeAL.add(bike0);
		Bike bike1 = new Bike ("Mongoose", "x100", 2014);
		bikeAL.add(bike1);
		Bike bike2 = new Bike ("Huffy", "x10", 2014);
		bikeAL.add(bike2);
		Bike bike3 = new Bike ("Dedler", "x1000", 2014);
		bikeAL.add(bike3);
		Bike bike4 = new Bike ("Stride", "x100", 2003);
		bikeAL.add(bike4);
		Bike bike5 = new Bike ("Googlite", "x1", 2001);
		bikeAL.add(bike5);
		Bike bike6 = new Bike ("Samsunger", "x10", 2014);	
		bikeAL.add(bike6);
		
		System.out.println("All Bikes");
		for (int i = 0; i < bikeAL.size(); i++)
		{
			System.out.println(bikeAL.get(i));
		}
		System.out.println("\nAll Bikes manufactured after 2004");
		for (int i = 0; i < bikeAL.size(); i++)
		{
			if (bikeAL.get(i).getYearManufactured() > 2004)
			{
				System.out.println(bikeAL.get(i));
			} 
			
		}
		}
}

import java.util.ArrayList;


public class SquareTester
{
	public static void main(String[] args)
	{
		ArrayList<Square> arraySq = new ArrayList<Square>();
		Square sq0 = new Square(3.0);
		arraySq.add(sq0);
		Square sq1 = new Square(6.0);
		arraySq.add(sq1);
		Square sq2 = new Square(9.0);
		arraySq.add(sq2);
		Square sq3 = new Square(12.0);
		arraySq.add(sq3);
		Square sq4 = new Square(15.0);
		arraySq.add(sq4);
		
		for (int i = 0; i < arraySq.size(); i++)
		{
			System.out.println(arraySq.get(i));
		}	
	}
}

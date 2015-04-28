import java.util.ArrayList;

/* Create a tester class which does the following in the main method:
Create an ArrayList of Strings called group
Add your name and four other names to group
SOP size of group
SOP the 3rd element in group
SOP group
Use the enhanced for loop to print each element of group */

public class ArrayTester
{

	public static void main(String[] args)
	{
		ArrayList <String> group = new ArrayList<String>();
		group.add("Adrianna");
		group.add("Kasiel");
		group.add("Brian");
		group.add("Nathalie");
		group.add("Julio");
		
		System.out.println("The size of the group is: " + group.size());
		System.out.println("What's in the third element? " + group.get(2));
		System.out.println(group);
		
		for (String s: group)
		{
			System.out.println("My name is " + s);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add(0, "B"); 
		names.add("C"); 
		names.remove(1); 
		System.out.println(names);

	}

}

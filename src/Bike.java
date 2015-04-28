
public class Bike
{

	private String manufacturer;
	private String name;
	private int yearManufactured;

	public Bike()
	{
		this.manufacturer = "default";
		this.name = "default name";
		this.yearManufactured = 2015;
	}

	public Bike(String manufacturer, String name, int yearManufactured)
	{
		this.manufacturer = manufacturer;
		this.name = name;
		this.yearManufactured = yearManufactured;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYearManufactured()
	{
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured)
	{
		this.yearManufactured = yearManufactured;
	}

	@Override
	public String toString()
	{
		return "Bike [ Manufacturer= " + manufacturer + ", Name= " + name
				+ ", Year Manufactured= " + yearManufactured + "]";
	}

}


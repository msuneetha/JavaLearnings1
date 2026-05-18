//non static block or java init block 

class Car
{
	private String brand;
	private double cost;
	
	static int count;//0->1 class variable
	
	{
		count++;
	}
	
	
	
	
	Car()
	{
		
	}
	
	Car(String brand, double cost)
	{
		this.brand=brand;
		this.cost=cost;
		
		
	}
	
	Car(String brand)
	{
		this.brand=brand;
		
		
	}
	
}
public class LaunchJavaBlock
{
	public static void main(String[] args)
	{
		//WAP to count number of object created
		Car c1=new Car();
		System.out.println(Car.count);//1
		
		Car c2=new Car("BMW");
		System.out.println(Car.count);//2
		
		Car c3=new Car("MERC", 656565.5);
		System.out.println(Car.count);//3
		
		
	}

}

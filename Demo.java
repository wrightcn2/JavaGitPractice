import java.util.Scanner;

public abstract class Demo
{
	public static void main(String[] args)
	{
		Demo demo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter you choice: quadtrilateral or polygon");
		String choice = scanner.nextLine();
	
		if(choice == "quadtrilateral" || choice == "Quadtrilateral" || choice == "QUADTRILATERAL")
		{
			demo = new Square();
		}
		if(choice == "polygon" || choice == "Polygon" || choice == "POLYGON")
		{
			demo = new Triangle();
		}
		demo.sayType();

		demo.sayName();	

	}
}

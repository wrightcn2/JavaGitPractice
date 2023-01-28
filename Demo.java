import java.util.*;


public class Demo
{
	private Demo demo;

	public Demo(Demo myDemo, String name)
	{
		myDemo = demo;
	}
	public static boolean isNotValid(String myChoice)
	{
		if(!(myChoice.equals("quadtrilateral")) || !(myChoice.equals("Quadtrilateral")) || !(myChoice.equals("QUADTRILATERAL")) || !(myChoice.equals("polygon")) || !(myChoice.equals("Polygon")) || !(myChoice.equals("POLYGON")))
		{
			return true;
		}	
		return false;
	}
	public static void main(String[] args)
	{
		Shape s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("***Learn two types of shapes!***");
		System.out.println("----------------------------------------------------");
		System.out.print("Enter your choice quadtrilateral or polygon: ");
		//System.out.println("\nhello world");
		String choice = scanner.nextLine();
		if(choice.equals("quadtrilateral") || choice.equals("Quadtrilateral") || choice.equals("QUADTRILATERAL"))
                {
                         s = new Square();
                         s.sayName();
                }
                else if(choice.equals("polygon") || choice.equals("Polygon") || choice.equals("POLYGON"))
                {
                  	//System.out.println("hello world");
                        s = new Triangle();
                        s.sayName();
                }
                else
                {
                        System.out.println("Error: Not a choice try again");
                        System.out.print("Enter your choice quadtrilateral or polygon: ");
                        choice = scanner.nextLine();
	
			while(isNotValid(choice))
			{
				try
				{
					if(choice.equals("quadtrilateral") || choice.equals("Quadtrilateral") || choice.equals("QUADTRILATERAL"))
					{
						s = new Square();
						s.sayName();
						return;
					}
					if(choice.equals("polygon") || choice.equals("Polygon") || choice.equals("POLYGON"))
					{
						//System.out.println("hello world");
						s = new Triangle();
						s.sayName();
						return;
					}
					else
					{
						System.out.println("Error: Not a choice try again");
						System.out.print("Enter your choice quadtrilateral or polygon: ");
						choice = scanner.nextLine();
					}
				}
				catch(InputMismatchException ime)
				{
						System.out.println("Please enter quadtrilateral or polygon! ");
                                		System.out.println("Enter your choice quadtrilateral or polygon: ");
                                		choice = scanner.nextLine();
				}
			}
		}
		System.out.println("----------------------------------------------------");

	}
}

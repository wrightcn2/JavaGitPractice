public abstract class Triangle extends Shape
{

	public Triangle(Demo myDemo, String name)
	{
		super(myDemo, name);
	}
	public void sayName()
	{
		System.out.println("I am a triangle!");
	}
	public void sayType()
	{
		System.out.println("I am a polygon!");
	}



}

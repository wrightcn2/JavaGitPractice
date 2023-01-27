public abstract class Shape
{
	private String name;
	private Demo demo;


	public Shape(Demo myDemo, String name)
	{
		myDemo = demo;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void sayName()
	{
		System.out.println("I am a shape...");
	}
	public abstract void draw();



}

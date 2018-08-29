class Person
{
	private String name;
	private int age;
	private static  String country = "cn";
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println(name+".."+age);
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+"..."+this.age);
	}

	public static void  showCountry()
	{
		System.out.println("country="+country);
	}
}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
	}
}

/*
当多个类中出现相同功能，但是功能主体不同，
这是可以进行向上抽取。这时，只抽取功能定义，而不抽取功能主体。

抽象：看不懂。

抽象类的特点：
1，抽象方法一定在抽象类中。
2，抽象方法和抽象类都必须被abstract关键字修饰。
3，抽象类不可以用new创建对象。因为调用抽象方法没意义。
4，抽象类中的抽象方法要被使用，必须由子类复写起所有的抽象方法后，建立子类对象调用。
	如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。


抽象类和一般类没有太大的不同。
该如何描述事物，就如何描述事物，只不过，该事物出现了一些看不懂的东西。
这些不确定的部分，也是该事物的功能，需要明确出现。但是无法定义主体。
通过抽象方法来表示。

抽象类比一般类多个了抽象函数。就是在类中可以定义抽象方法。
抽象类不可以实例化。


特殊：抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象。


练习：

abstract 关键字，和哪些关键字不能共存。
final：被final修饰的类不能有子类。而被abstract修饰的类一定是一个父类。
private: 抽象类中的私有的抽象方法，不被子类所知，就无法被复写。
		而抽象方法出现的就是需要被复写。
static：如果static可以修饰抽象方法，那么连对象都省了，直接类名调用就可以了。
		可是抽象方法运行没意义。



抽象类中是否有构造函数？
有，抽象类是一个父类，要给子类提供实例的初始化。

*/

abstract class Student
{
	abstract final void study();
	//abstract void study1();
	void sleep()
	{
		System.out.println("躺着");
	}
}
/*

class ChongCiStudent extends Student
{
	void study()
	{
		System.out.println("chongci study");
	}
}

class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
*/
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		//new Student();
		//new BaseStudent().study();
	}
}

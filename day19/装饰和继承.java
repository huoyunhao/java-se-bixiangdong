/*


MyReader//专门用于读取数据的类。
	|--MyTextReader
		|--MyBufferTextReader
	|--MyMediaReader
		|--MyBufferMediaReader
	|--MyDataReader
		|--MyBufferDataReader

class MyBufferReader
{
	MyBufferReader(MyTextReader text)
	{}
	MyBufferReader(MyMediaReader media)
	{}
}
上面这个类扩展性很差。
找到其参数的共同类型。通过多态的形式。可以提高扩展性。

class MyBufferReader extends MyReader
{
	private MyReader r;
	MyBufferReader(MyReader r)
	{}
}	


MyReader//专门用于读取数据的类。
	|--MyTextReader
	|--MyMediaReader
	|--MyDataReader
	|--MyBufferReader


以前是通过继承将每一个子类都具备缓冲功能。
那么继承体系会复杂，并不利于扩展。

现在优化思想。单独描述一下缓冲内容。
将需要被缓冲的对象。传递进来。也就是，谁需要被缓冲，谁就作为参数传递给缓冲区。
这样继承体系就变得很简单。优化了体系结构。





装饰模式比继承要灵活。避免了继承体系臃肿。
而且降低了类于类之间的关系。

装饰类因为增强已有对象，具备的功能和已有的是相同的，只不过提供了更强功能。
所以装饰类和被装饰类通常是都属于一个体系中的。




*/


class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

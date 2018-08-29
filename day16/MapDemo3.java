/*
map扩展知识。

map集合被使用是因为具备映射关系。

"yureban"   Student("01" "zhangsan");

"yureban" Student("02" "lisi");

"jiuyeban" "01" "wangwu";
"jiuyeban" "02" "zhaoliu";

一个学校有多个教室。每一个教室都有名称。


*/
import java.util.*;

class Student
{
	private String id;
	private String name;
	Student(String id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+":::"+name;
	}
}
class  MapDemo3
{

	public static void demo()
	{
		HashMap<String,List<Student>> czbk = new HashMap<String,List<Student>>();

		List<Student> reyu = new ArrayList<Student>();
		List<Student> jiuye = new ArrayList<Student>();

		czbk.put("yureban",reyu);
		czbk.put("jiuyeban",jiuye);

		reyu.add(new Student("01","zhagnsa"));
		reyu.add(new Student("04","wangwu"));
		jiuye.add(new Student("01","zhouqi"));
		jiuye.add(new Student("02","zhaoli"));


		Iterator<String> it = czbk.keySet().iterator();

		while(it.hasNext())
		{
			String roomName = it.next();
			List<Student> room = czbk.get(roomName);
			
			System.out.println(roomName);
			getInfos(room);
		}

		

	
	}
	public static void getInfos(List<Student> list)
	{
		Iterator<Student> it = list.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}




	public static void main(String[] args) 
	{
		 demo();
		
		/*
		HashMap<String,List<Student>> czbk = new HashMap<String,List<Student>>();

		HashMap<String,String> yure = new HashMap<String,String>();
		
		HashMap<String,String> jiuye = new HashMap<String,String>();

		czbk.put("yureban",yure);
		czbk.put("jiuyeban",jiuye);


		yure.put("01","zhagnsan");
		yure.put("02","lisi");

		jiuye.put("01","zhaoliu");
		jiuye.put("02","wangwu");



		//遍历czbk集合。获取所有的教室。
		Iterator<String> it = czbk.keySet().iterator();

		while(it.hasNext())
		{
			String roomName = it.next();
			HashMap<String,String> room = czbk.get(roomName);
			
			System.out.println(roomName);
			getStudentInfo(room);
		}

		
//		getStudentInfo(jiuye);
//		getStudentInfo(yure);
*/
		
	}
	public static void getStudentInfo(HashMap<String,String> roomMap)
	{
		Iterator<String> it = roomMap.keySet().iterator();

		while(it.hasNext())
		{
			String id = it.next();
			String name = roomMap.get(id);
			System.out.println(id+":"+name);
		}
	}
}

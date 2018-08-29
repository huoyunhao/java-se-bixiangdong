
package pack;

/*
为了简化类名的书写，使用一个关键字，import.
import 导入的是包中的类。
建议，不要写通配符 * ，需要用到包中的哪个类，就导入哪个类。



c:\myclass

c:\myclass\packb\DemoA.class
c:\myclass\packb\haha\DemoZ.class

import packb.*;
import packb.haha.*;


建立定包名不要重复，可以使用url来完成定义，url是唯一的。

www.itcast.cn

package cn.itcast.demo
package cn.itcast.test


*/

import packb.haha.hehe.heihei.*;
import packa.*;
import packb.*;


class  PackageDemo
{
	public static void main(String[] args) 
	{

		DemoC c = new DemoC();

//		packa.DemoA d = new packa.DemoA();
//		d.show();

//		packb.DemoB d = new packb.DemoB();
//		d.method();
	}
}



/*

PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 pack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 pack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 错误

错误原因：类名写错。

因为类名的全名是：包名.类名




PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误


错误原因：packa包不在当前目录下
需要设置classpath，告诉jvm去哪里找指定的packa包。



PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误

错误原因：有了包，范围变大，一个包中的类要被访问，必须要有足够大的权限。
所以被访问的类要被public修饰。



PackageDemo.java:9: show() 在 packa.DemoA 中不是公共的；无法从外部软件包中对其进
行访问
                d.show();
                 ^
1 错误

错误原因：类公有后，被访问的成员也要公有才可以被访问。





总结：
	包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。

	不同包中的子类还可以直接访问父类中被protected权限修饰的成员。

包与包之间可以使用的权限只有两种，public  protected。


             public   protected       default     private
同一个类中     ok         ok             ok          ok
同一个包中     ok         ok             ok
子类           ok         ok             
不同包中       ok



java.lang : java的核心包 jdk1.2版本以后，该包中的类自动导入。
java.awt: 用于制作图形界面。
java.io:input output  用于操作设备上的数据。
java.util : 这里定义是java的工具类。集合，日期。
java.net:用于网络通讯的。
java.applet:  application  let        server  let    servlet      java server page   jsp  

class haha implements Servlet

class hehe extends HttpServlet

*/
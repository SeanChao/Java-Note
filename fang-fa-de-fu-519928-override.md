#方法的复写(Override)
复写也称为覆盖、重写
- 在具有父子关系的两个类中
- 父类和子类各有一个函数，它们的返回值类型、函数名和参数列表完全相同

示例：

```java
package xyz.sean.testOverride;

public class Person {
	String name;
	int age;
	
	void introduce () {
		ystem.out.println("watashino namaeha "+name+". My age is "+age);
	}
}

class student extends Person {
	String address;
	//以下即为复写
	void introduce (){
		System.out.println("我的名字是"+name+"我的年龄是"+age);
		System.out.println("我的家在"+address);
	}
}
```
可以使用`super.xxx()`调用父类中的方法，以消除程序中的重复代码
示例：

```java
class student extends Person {
	String address;
	//以下即为复写
	void introduce (){
//		System.out.println("我的名字是"+name+"我的年龄是"+age);
		super.introduce();
		System.out.println("我的家在"+address);
	}
}
```
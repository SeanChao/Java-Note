# 继承
关键字：`extend`
面向对象三大基本特征之一，可减少程序中的重复代码
一、什么是继承
一个类得到了另一个类的成员变量和成员方法
** Java中只支持单继承，不支持多继承（一个子类继承一个父类）**
此外，可加入自己的成员变量和成员方法。
示例：
```java
public class Person {
	String name;
	int age;
	
	void eat(){
		System.out.println("I'm eating!");
	}
	void introduce(){
		System.out.println("My name is "+name+". My age is "+age);
	}
}

class Student extends Person {
	int grade;
	
	void study(){
		System.out.println("I'm studying!");
	}
}
```
测试类：
```java
public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Sean";
		stu.age = 17;
		stu.eat();
		stu.introduce();
		stu.study();
}
```
运行结果：
>I'm eating!
My name is Sean. My age is 17
I'm studying!

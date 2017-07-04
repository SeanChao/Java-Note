# this关键字

-this是隐式参数，即在方法的参数；列表中没有出现，但编译器在编译时存在的参数，因此能在方法中使用（隐式参数还有super（父类））

## 使用this调用成员变量和成员函数

`this`在成员函数中指代调用此方法的对象，因此在下例中，两次输出的效果一致

```java
public class Person {
    String name;

    void talk(){
        System.out.println("My name is "+this.name);
        System.out.println("My name is "+name);
    }
}
```

常用形式示例：

```java
public class Person {
    String name;
    int age;
    String address;

    Person(){
        System.out.println("无参数的构造函数");
    }

    Person(String name , int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void talk(){
        System.out.println("My name is "+name);
    }
}
```

## 使用this调用构造函数

目的：**消除程序中的重复代码**  
**注意**

- this\(...\)；必须是构造函数中的第一条语句
> Constructor call must be the first statement in a constructor
- this括号中的参数列表决定了所调用的是哪一个构造函数



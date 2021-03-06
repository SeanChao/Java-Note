#内存分区
- 栈：存放局部变量
- 堆：存放new出来的对象
- 方法区：存放类的信息，static变量,常量（字符串常量）池等

示例：
`Student s1 = new Student();`
JVM首先在方法区,classpath内寻找Student类，找不到报错，若找到则通过类加载器Class Loader加载类Student类，加载后在方法区内就有了Student类的信息，包括：
1.代码（属性，方法……）
2.static变量
3.常量池（字符串常量等）
此Student对象的方法通过一个地址指向方法区内共有的方法
随后，在栈内存内生成s1，并通过一个地址指向刚才创建的Student对象
`s1.name = "Sean"`
堆内的name通过地址指向方法区内常量值"Sean"
![内存分析1](/assets/Java内存分析.PNG)
在代码中定义另外一个类Computer
并在Student类中增加变量：
```Computer computer```
添加代码：
```
Computer c = new Computer(); 
s.computer = c;
```
调用或修改c.brand等价于修改s.computer.brand
最后内存图:
![内存分析2](/assets/内存分析2.PNG)
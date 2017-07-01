#内存分区
- 栈：存放局部变量
- 堆：存放new出来的对象
- 方法区：存放类的信息，static变量,常量（字符串常量）池等

示例：
`Student s1 = new Student();`
JVM首先在方法区,classpath内寻找Student类，找不到报错，若找到则通过类加载器Class Loader加载类Student类，加载后在方法区内就有了Student类的信息。
1.代码
2.static变量
3.常量池（字符串常量等）
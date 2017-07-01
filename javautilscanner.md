#Scanner类：接收键盘输入
需要导入：java.util.Scanner
使用时，先生成一个Scanner对象，传入参数System.in
调用Scanner对象的`next()`方法接收键盘输入，返回值类型：`String`
```java
Scanner s = new Scanner(System.in);
String str = s.next();
System.out.println("Input:"+str);
```
此外，还有`nextInt()`方法，返回值类型:`int`
```java
public static int plus(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		return a+b;
}
```
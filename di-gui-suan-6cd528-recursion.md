
#递归算法(Recursion)
递归：即在自己的方法体内调用自己
```java
void recursion(){
    recursion();
}
```
直接运行会效果同死循环，在方法内调用`recursion()`时，在栈内生成了一个同样的方法，如此循环，最终导致栈内存溢出`StackOverFlow Exception`
因此，为了防止栈溢出，需要在方法体内定义调用条件。例如：
```java
public static void recursion(){
		i++;
		if (i<=10){
			System.out.println("Recursion:"+i);
			recursion();
		}else{
			System.out.println("---END---");
		}
	}
```
最终i=10,循环运行11次，无报错。
递归头：什么时候不调用
递归体：什么时候调用

##实例：使用递归实现阶乘算法
```java
	public static long factorial (long n) {
		if( n == 1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
```
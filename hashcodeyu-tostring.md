# hashCode()与toString()
hashCode()与toString()方法都来自java.lang.Object类
## Hash算法
任意长度数据-->hash算法-->散列值
- hash算法特点：
输入1-->散列值1
……       ……
输入n-->散列值n
- hashCode()
如果两个对象用equals()相比相等，则所得hashCode相等
示例：

```java
class User{
    String name;
    int age;
    
    public User(){
    }
    
    public user (String name , int age ){
        this.name = name ;
        this.age = age ;
    }
    
    public int hashCode(){
        int result = 17 //一般为正质数
        result = 31 * result + age ; //性能好，使用31
        result = 31 * result + name.hashCode();
        return result;
    }

import java.util.*;
class Test {
    public static void main (String [] args) {
           User u = new User("zhangsan",15);
           HashMap <User,String> map = new HashMap<User,String>();
           map.put(u,"abc")
           String s = map.get(new User("zhangsan",15));
    }
    
}

```

-toString()

```java
User u = new User("sc",15);
System.out.println(u);//运行结果：User@aa9c71b9
//(系统自动调用toString()方法)

public String toString(){
    String result = "age:"+age+","+"name:"+name;
    return result;
}
```
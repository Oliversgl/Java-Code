# 就近原则和this关键字

## 成员变量和局部变量

局部变量：变量定义在方法中

成员变量：变量定义在类中，方法外

## 就近原则

谁离我近，我就用谁

```Java
public class GirlFriend{
	private int age;
	public void method(){
		int age = 10;
		System.out.println(age);//就近原则
        System.out.println(this.age);//调用成员变量的age
	}
}
```

## this关键字

作用：可以区别成员变量和局部变量
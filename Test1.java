package Section5_Plus;
import java.util.*;

class Number {
	private int n1,n2,num;
	Number(int newN1,int newN2){
		n1=newN1;
		n2=newN2;
	}
	public void Addition() {
		num=n1+n2;
		System.out.println("两数相加后的结果为："+num);
	}
	public void Subtration() {
		num=n1-n2;
		System.out.println("两数相减后的结果为："+num);
	}
	public void Multiplication() {
		num=n1*n2;
		System.out.println("两数相乘后的结果为："+num);
	}
	public void Divation() {
		num=n1/n2;
		System.out.println("两数相除后的结果为："+num);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个操作数：");
		int n1=reader.nextInt();
		System.out.print("请输入另一个操作数：");
		int n2=reader.nextInt();
		Number t1=new Number(n1,n2);
		t1.Addition();
		t1.Subtration();
		t1.Multiplication();
		t1.Divation();
	}
}

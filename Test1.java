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
		System.out.println("������Ӻ�Ľ��Ϊ��"+num);
	}
	public void Subtration() {
		num=n1-n2;
		System.out.println("���������Ľ��Ϊ��"+num);
	}
	public void Multiplication() {
		num=n1*n2;
		System.out.println("������˺�Ľ��Ϊ��"+num);
	}
	public void Divation() {
		num=n1/n2;
		System.out.println("���������Ľ��Ϊ��"+num);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ����������");
		int n1=reader.nextInt();
		System.out.print("��������һ����������");
		int n2=reader.nextInt();
		Number t1=new Number(n1,n2);
		t1.Addition();
		t1.Subtration();
		t1.Multiplication();
		t1.Divation();
	}
}

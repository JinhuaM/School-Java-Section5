class Person{
	String name;
	int age;
public int biJiao(int a1,int a2){
	if(a1>a2)
	return a1;
	else
	return a2;
}
}

public class DebugApp{
	public static void main(String agrs[]){
	int x=1;
	int y=2;
	Person p=new Person();
	p.name="����";
	p.age=20;
	int s=p.biJiao(x,y);
	System.out.println("�ϴ������"+s);
}
}
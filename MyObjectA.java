class MyObjectA{
 public static void main(String[] ages){
	Student s1=new Student();
	s1.setStudent("����",13,80,90,85);
	System.out.println("��ã��ҽ�"+s1.name+"���ҽ���"+s1.age+"��");
	System.out.println("�ҵ��ܷ���"+s1.total());
	System.out.println("�ҵ�ƽ������"+s1.average());
}
}
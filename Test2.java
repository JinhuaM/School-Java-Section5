package Section5_Plus;
import java.util.*;

public class Test2 {
 public static void main(String[] args) {
	 int[][] arry=new int[3][4];
	 Scanner reader=new Scanner(System.in);
	 System.out.println("����һ���������еľ���");
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<4;j++) {
			 arry[i][j]=reader.nextInt();
		 }
	 }
	 System.out.println("�����������Ϊ��");
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<4;j++) {
			 System.out.print(arry[i][j]+"\t");
			 if(j==3)
				 System.out.println();
		 }
	 }
	 int max=arry[0][0];
	 int row = 0,column=0;
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<4;j++) {
			 if(arry[i][j]>max) {
				 max=arry[i][j];
				 row=i;
				 column=j;
			 }
		 }
	 }
	 System.out.println("�þ��������ֵΪ��"+max+" ���±�Ϊ"+row+","+column);
 }
}

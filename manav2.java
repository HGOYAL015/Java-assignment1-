package ll;
import java.util.*;

class student{
	String roll;
	String name;
	student(String r,String n){
		roll=r;
		name=n;
	}
	
}

public class manav2 {
	public static void main(String args[]) {
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		for(int i=0;i<t;i++) {
			int nos=x.nextInt();
			student det[]=new student[nos];
			int roll[]=new int[nos];
			for(int j=0;j<nos;j++)
			{
				String r=x.next();
				String n=x.next();
				student stu=new student(r,n);
				det[j]=stu;
				roll[j]=Integer.parseInt(r.substring(3));
			}
			for(int j=0;j<nos;j++) {
				int minIndex=j;
				int te=roll[j];
				for(int k=j+1;k<nos;k++)
					if(roll[k]<te) {
						te=roll[k];
						minIndex=k;
					}
				if(minIndex!=j) {
					int temp=roll[j];
					roll[j]=roll[minIndex];
					roll[minIndex]=temp;
					student temp2 = det[j];
					det[j]=det[minIndex];
					det[minIndex]=temp2;
				}
			}
			
			for(int j=0;j<nos;j++)
			{
				System.out.println(det[j].roll+" "+det[j].name);
			}
		}
		
	}
}

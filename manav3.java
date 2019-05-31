package ll;
import java.util.*;

class student3{
	String roll;
	String name;
	student3(String r,String n){
		roll=r;
		name=n;
	}
}

public class manav3 {
	public static void main(String args[]) {
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		for(int i=0;i<t;i++) 
		{
			int nota=x.nextInt();
			int nos=x.nextInt();
			int k=x.nextInt();
			
			student3 det_ta[]=new student3[nota];
			for(int j=0;j<nota;j++) 
			{
				String r=x.next();
				String n=x.next();
				student3 dta=new student3(r,n);
				det_ta[j]=dta;
			}
			
			student3 det[]=new student3[nos];
			int roll[]=new int[nos];
			for(int j=0;j<nos;j++)
			{
				String r=x.next();
				String n=x.next();
				student3 stu=new student3(r,n);
				det[j]=stu;
				roll[j]=Integer.parseInt(r.substring(3));
			}
			
			for(int j=0;j<nos;j++) {
				int minIndex=j;
				int te=roll[j];
				for(int m=j+1;m<nos;m++)
					if(roll[m]<te)
						{
							te=roll[m];
							minIndex=m;
						}
				
					int temp=roll[j];
					roll[j]=roll[minIndex];
					roll[minIndex]=temp;
					student3 temp2 = det[j];
					det[j]=det[minIndex];
					det[minIndex]=temp2;
				
			}
			
			for(int j=0,a=0,m=0;j<nos;j++) 
			{
				if(a==k && m<k)
				{
					m++;
					a=0;
				}
				a++;
				System.out.println(det[j].roll+" "+det[j].name+" "+det_ta[m].roll+" "+det_ta[m].name);
			}
			
		}
	}
}

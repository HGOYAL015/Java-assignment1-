package ll;

import java.util.Scanner;

class student4{
	String roll;
	String name;
	student4(String r,String n){
		roll=r;
		name=n;
	}
}


public class manav4 {
	public static void main(String args[]) {
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		for(int i=0;i<t;i++) 
		{
			int nota=x.nextInt();
			int nos=x.nextInt();
			int k=x.nextInt();
			
			student4 det_ta[]=new student4[nota];
			for(int j=0;j<nota;j++) 
			{
				String r=x.next();
				String n=x.next();
				student4 dta=new student4(r,n);
				det_ta[j]=dta;
			}
			
			student4 det[]=new student4[nos];
			int roll[]=new int[nos];
			for(int j=0;j<nos;j++)
			{
				String r=x.next();
				String n=x.next();
				student4 stu=new student4(r,n);
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
					student4 temp2 = det[j];
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
			
			for(int j=0,m=0;j<nota;j++) 
			{
				System.out.println(det_ta[j].roll+" "+det_ta[j].name);
				
				if(j!=nota-1)
					for(int a=0;a<k;a++,m++) 
						System.out.println(det[m].roll+" "+det[m].name);
				else
					while(m!=nos) {
						System.out.println(det[m].roll+" "+det[m].name);
						m++;
					}
			
			}
			
		}
	}
}

package ll;
import java.util.Scanner;

class student5{
	String name;
	String roll;
	int marks;
	student5(String n,String r,int m){
		name=n;
		roll=r;
		marks=m;
	}
}

public class manav5 {
	
	static int search(String n,student5 det[],int nos) {
		int index=0;
		for(int l=0;l<nos;l++)
		{
			if(n.equals(det[l].roll))
			{
				index=l;
				break;
			}
		}
		return index;
	}
	
	public static void main(String args[]) {
		
		Scanner x=new Scanner(System.in);
		
		int t=x.nextInt();
		for(int i=0;i<t;i++) {
			int nos=x.nextInt();
			int roll[]=new int[nos];
			student5 det[]=new student5[nos];
			for(int j=0;j<nos;j++) {
				String r=x.next(),n=x.next();
				int m=0;
				student5 stu=new student5(n,r,m);
				det[j]=stu;
				roll[j]=Integer.parseInt(r.substring(3));
			}
			
			int na=x.nextInt();
			for(int j=0;j<na;j++) {
				int n2=x.nextInt();
				for(int k=0;k<n2;k++) 
				{
					String n=x.next();
					int m=x.nextInt();
					int index=search(n,det,nos);
					det[index].marks=det[index].marks+m;
				}
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
					student5 temp2 = det[j];
					det[j]=det[minIndex];
					det[minIndex]=temp2;
				
			}
			
			for(int j=0;j<nos;j++) 
				if(det[j].marks!=0)
					System.out.println(det[j].roll+" "+det[j].name+" "+det[j].marks);
		}
	}
}

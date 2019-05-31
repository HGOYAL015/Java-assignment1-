package ll;
import java.util.*;

class students{
	String roll;
	String name;
	students(String r,String n){
		roll=r;
		name=n;
	}
}

public class manav {
	public static void main(String args[]) {
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		for(int i=0;i<t;i++) {
			String r=x.next();
			String n=x.next();
			students st=new students(r,n);
			System.out.println(st.roll+" "+st.name);
		}
	} 
}

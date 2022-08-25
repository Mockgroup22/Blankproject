
public class Test {

	public static void main(String[] args) {
		int result=0;
		
		int no=153; 
		int temp =no; 
		 int rem = 0;
		
			while(temp!=0) {
		 rem=temp%10;     //3,5
		 result=result+(rem+rem+rem); //27+125=152+1=153
		 temp=temp/10; //15
			}
		 if(result==no) 
			 System.out.println("no is armstrong");
		 else
			 System.out.println("no is not armstrong");
	}

}

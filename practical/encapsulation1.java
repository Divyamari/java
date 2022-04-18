import java.util.Scanner;
class encap_example{
	private String student_name;
	private int user_id;
	private String password;
	int total,average,percentage;

	public String get_student_name()
	{
		return student_name;
	}
	public int get_user_id()
	{
		return user_id;
	}
	public String get_password()
	{
		return password;
	}
	public void set_student_name(String newval)
	{
		student_name=newval;
	}
	public void set_user_id(String newval)
	{
		user_id=newval;
	}
	public void set_password(String newval)
	{
		Password=newval;
	}
	public void calculation(int sub1,int sub2,int sub3,int sub4, int sub5)
	{
		
	  total=sub1+sub2+sub3+sub4+sub5;
	  percentage =total/5;
	  
	  System.out.println("total:"+total);
	  System.out.println("percentage:"+percentage);
	
	if (mark>=41 && mark<=50){
		System.out.println("E Grade");
	}
	else if(mark>=51 && mark<=60){
		System.out.println("D Grade");
	}
	else if(mark>=61 && mark<=70){
		System.out.println("C Grade");
	}
	else if(mark>=71 && mark<=80){
		System.out.println("B Grade");
	 }
	else if(mark>=81 && mark<=90){
		System.out.println("A Grade");
	}
	else if(mark>=91 && mark<=100){
		System.out.println("S Grade");
	 }
	else{
		System.out.println("FAIL");
	 }
}

public class encapsulation1
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int user_id;
	String student_name,password;
	int sub1,sub2,sub3,sub4,sub5;
	
	system.out.println("Enter name:");
	student_name=sc.nextLine();
	system.out.println("Enter userId:");
	user_id=sc.nextInt();
	system.out.println("Enter Password:");
	password=sc.nextLine();
	System.out.println("Subject 1:");
	sub1=sc.nextInt();
	System.out.println("subject 2:");
	sub2=sc.nextInt();
	System.out.println("subject 3:");
	sub3=sc.nextInt();
	System.out.println("subject 4:");
	sub4=sc.nextInt();
	System.out.println("subject 5:");
	sub5=sc.nextInt();
	
	
	encap_example obj = new encap_example();

	obj.set_user_id(user_id);
	obj.set_password(password);
	
	System.out.println("Name:"+name);
	System.out.println("User Id:"+obj.get_user_id());
	System.out.println("Password:"+obj.get_password());
	
	//calculation o = new calculation();
	obj.calculation(sub1, sub2, sub3, sub4, sub5);
	
	}
	}
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
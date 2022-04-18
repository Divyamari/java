import java.util.*;
class ecanp_demo
{
	private String Pass_word;
	private int user_id;
	private int otp;
	
	public String get_pass()
	{
		return Pass_word;
	}
	public int get_user_id()
	{
		return user_id;
	}
	public int get_otp()
	{
		return otp;
	}
	public void set_pass(String newval)
	{
		Pass_word=newval;
	}
	public void set_user_id(int newval)
	{
		user_id=newval;
	}
	public void set_otp(int newval)
	{
		otp=newval;
	}
	
}
public class encapsulation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int op1,u_id;
		String name,pass;
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your password:");
		pass=sc.nextLine();
		System.out.println("Enter your OTP:");
		op1=sc.nextInt();
		System.out.println("Enter your User ID:");
		u_id=sc.nextInt();
		
		ecanp_demo obj=new ecanp_demo();
		obj.set_pass(pass);
		obj.set_otp(op1);
		obj.set_user_id(u_id);
		
		System.out.println("Name:"+name);
		System.out.println("Password:"+obj.get_pass());
		System.out.println("OTP:"+obj.get_otp());
		System.out.println("User ID :"+obj.get_user_id());
		
		
		
	}
}





































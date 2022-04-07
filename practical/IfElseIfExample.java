import java.util.Scanner;

class IfElseIfExample{

public void show(){
Scanner s = new Scanner(System.in);
System.out.println("Enter time");
int time = s.nextInt();

if (time<12){
	System.out.println("hii....Good Morning");
	}
	
else if (time<17){
	System.out.println("hii....Good Afternoon");
	}
	
else if (time<21){
	 System.out.println("hii...Good Evening");
	 }
	 
else {
	System.out.println("hii....Good Night");
	}
}
public static void main(String args[]){
	IfElseIfExample e = new IfElseIfExample();
    e.show();
}

}
import java.util.Scanner;

class IfElseIfAssignment{

public void display(){
Scanner s = new Scanner(System.in);
System.out.println("Enter mark");
int mark = s.nextInt();

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
public static void main (String args[]){
	IfElseIfAssignment obj = new IfElseIfAssignment();
	obj.display();
}
}
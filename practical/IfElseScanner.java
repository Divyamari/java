import java.util.Scanner;
	
class IfElseScanner{
	
public void display() {
Scanner s = new Scanner(System.in);
System.out.println("Enter age");
int age = s.nextInt();

if(age >=18){ 

System.out.println("you are eligible");

}

else{
	
System.out.println("you are not eligible");

}
}
public static void main(String args[]){
IfElseScanner obj = new IfElseScanner();
obj.display();
}
}
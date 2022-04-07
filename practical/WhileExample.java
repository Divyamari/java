class WhileExample{

public void display(){

int x = 1;
while (x<=20){
System.out.println("the value of x :" +x);
x++;
}
}
public static void main(String args[]){
	WhileExample obj = new WhileExample();
	obj.display();
}
}
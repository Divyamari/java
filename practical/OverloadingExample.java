public class OverloadingExample{
static int plusMe(int x,int y){
return x+y;
}
static int plusMe(int x, int y, int z){
return x+y+z;
}
static double plusMe(double x, double y){
return x+y;
}
	public static void main (String args[]){
		int a = plusMe(15,65);
		int b = plusMe(45,65,84);
		double c = plusMe(77.5,3.5);
		System.out.println("int 2 Arguments:"+a);
		System.out.println("int 3 Arguments:"+b);
		System.out.println("double Arguments:"+c);
		}
}
class Factorial{
public static void main(String args[]){
int n=5;
int ans=1;
for (int i=1;i<=n;i++){
ans = ans*i;
}
System.out.println("the factorial of " + n + " is " + ans);
}
}
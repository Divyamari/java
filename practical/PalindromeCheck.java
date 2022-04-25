import java.util.Scanner;
class PalindromeCheck{

 public static void main(String args[]){
      String str;
	  String rev ="";
      
	  Scanner s = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = s.nextLine();
 
      int length = str.length();
 
      
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
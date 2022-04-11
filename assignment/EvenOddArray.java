import java.util.Scanner;
public class EvenOddArray
{
    public static void main(String[] args)
    {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter elements in array : ");
        numbers = sc.nextInt();
        int[] arrNum = new int[numbers];
        System.out.println("Enter " + numbers + " elements : ");
        for(int a = 0; a < numbers; a++) 
        {
            arrNum[a] = sc.nextInt();
        }
        
        System.out.print("Odd numbers : ");
        for(int a = 0 ; a < numbers ; a++)
        {
            if(arrNum[a] % 2 != 0)
            {
                System.out.print(arrNum[a] + " ");
            }
        }
        System.out.println("");
       
        System.out.print("Even numbers : ");
        for(int a = 0 ; a < numbers ; a++)
        {
            if(arrNum[a] % 2 == 0)
            {
                System.out.print(arrNum[a] + " ");
            }
        }
        sc.close();
    }
}
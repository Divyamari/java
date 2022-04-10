
public class LsArray{

public static void main(String args[]) {
int arr[] = new int []{25,95,2,17,65,88};
int smallest = arr[0];
int largest = arr[0];

for (int i=1; i<arr.length; i++){

if(arr[i]<smallest)
	smallest = arr[i];
else if (arr[i]>largest)
	largest = arr[i];
	{
System.out.println("smallest number:"+smallest);
System.out.println("largest number:"+largest);
}
}
}
}
class DuplicateArray{
public static void main(String args[]){
String [] names = {"RM","JK","JIMIN","SUGA","JK","V","RM","JHOPE","JIN"};
for( int i=0;i<names.length-1; i++)
{
	for (int j = i+1; j<names.length; j++)
	{
		if( (names[i].equals(names[j])) && (i!= j) )
		{
		System.out.println("DuplicateArray:"+names[j]);
		}
	}
}
}
}
class TrianglePatternExample{
	
public void ppattern(int num){
for (int i=0; i<num; i++){
	for (int j=0;j<=i;j++){
		System.out.print("+");
	
	}
	System.out.println();
}
}
public static void main ( String args[]){
	TrianglePatternExample p = new TrianglePatternExample();
	int num = 6;
	p. ppattern(num);
}
}
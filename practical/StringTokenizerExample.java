import java.util.StringTokenizer;
public class StringTokenizerExample{
	public void myy(){
	StringTokenizer t = new StringTokenizer("Anudip Foundation Skill And Career Development Centre"," ");
	while (t.hasMoreTokens()){
		System.out.println(t.nextToken());
		}
	
	StringTokenizer st = new StringTokenizer("I am Divya, Staying in Chennai,Studying in Anudip");
	while(st.hasMoreTokens()){
	System.out.println("Next Token: " + st.nextToken(","));
	}
	}
	
	public static void main(String args[]){
	StringTokenizerExample m = new StringTokenizerExample();
	m.myy();
	}
}
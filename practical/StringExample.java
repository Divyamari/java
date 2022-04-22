public class StringExample{
	public void show(){
		char [] arr= {'j','a','v','a'};
		String s = new String(arr); //convert ch array to string
		System.out.println("value is:"+s);
		System.out.println(arr);
		}
		public void myfunction(){
		String m = "divya";
		String m1 = "divya";
		String m2 = new String("divya");
		}
		public static void main(String[] args){
		StringExample obj = new StringExample();
		obj.show();
		obj.myfunction();
		}
		}
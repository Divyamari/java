public class StringExample{
	public void show(){
		char [] arr= {'j','a','v','a'};
		String s = new String(arr); //convert ch array to string
		System.out.println("value is:"+s);
		System.out.println(arr);
		}
		public void myfunction(){
		String m = "abirami";
		String m1 = "divya j";
		String m3= "divya j";
		String m4 = "mohan";
		String m2 = new String("divya");
		System.out.println(m.equals(m1));
		System.out.println(m.equalsIgnoreCase(m2));
		System.out.println(m2.equals(m1));
		System.out.println(m==m2);
		System.out.println(m3 == m1);
		System.out.println(m4.compareTo(m));
		System.out.println(m.compareTo(m4));
		System.out.println(m1.compareTo(m3));
		}
		
		public void display(){
		String s = "Anudip" + "Foundation";
		System.out.println(s);//string s= (new StringBuilder()).append("Anudip").append("Foundation").toString();
		String s1 = 11+13+ "divya" +20+22;
		System.out.println(s1);
		System.out.println(s.concat(s1));
		}
		public static void main(String[] args){
		StringExample obj = new StringExample();
		obj.show();
		obj.myfunction();
		obj.display();
		}
		}
public class ToStringExample{
	int rollno;
	String name,addr;
	
		ToStringExample(int rollno,String name, String addr){
			this.rollno = rollno;
			this.name = name;
			this.addr = addr;
			}
			public String toString(){
				return rollno + " " +name + " " +addr;
				}
			public static void main(String args[]){
				ToStringExample s = new ToStringExample(1,"Divya", "Chennai");
				ToStringExample s1 = new ToStringExample(2,"Abirami","mumbai");
				
				System.out.println(s);
				System.out.println(s1);
				}
				}
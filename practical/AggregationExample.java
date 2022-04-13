class Address{
String street ,city, state, country;
int pincode;

public Address(String street, String city,String state, String country, int pincode){
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
	}
}

class Student{
int studentId;
String studentName, courseName, centreName;
Address addr;//aggregation

public Student(int studentId, String studentName,String courseName,String centreName,Address addr){
	this.studentId = studentId;
	this.studentName = studentName;
	this.courseName = courseName;
	this.centreName = centreName;
	this.addr = addr;
	}

public void display(){
	System.out.println("Id is:" +studentId+ "," + "  name is:" +studentName+ "," + "  course is:" +courseName+ "," + "  centre is:" +centreName);
	System.out.println(addr.street+ ",  " +addr.city+ ",  " +addr.state+ ",  " +addr.country+ ",  " +addr.pincode);
	}
}

 class AggregationExample{
	public static void main (String args[]){
	Address a = new Address("XYZ road","chennai","tamil nadu","india",600045);
	Address a1 = new Address("ABC road", "chennai", "tamil nadu","india",600045);
	
	Student s = new Student(3002,"Divya","Java","karapakkam",a);
	Student s1 = new Student(3001,"Abirami","Java","karapakkam",a1);
	s.display();
	s1.display();
}
}
	
	
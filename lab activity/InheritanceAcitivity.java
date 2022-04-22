class Employee {
long employeeId;
String employeeName,employeeAddress;
long employeePhone;
double basicSalary;
double specialAllowance = 250.80;
double Hra = 1000.50;
Employee(long Id,String Name,String Address,long phone,double basicSalary) {
this.employeeId = Id;
this.employeeName = Name;
this.employeeAddress = Address;
this.employeePhone = phone;
this.basicSalary = basicSalary;
System.out.println("\n employeeId:" +Id);
System.out.println("employeeName:" +Name);
System.out.println("employeeAddress:" +Address);
System.out.println("employeePhone:" +phone);
System.out.println("basicSalary:" +basicSalary);
}
public void CalculateSalary() {
double salary;
salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
System.out.println("Salary :" +salary);
}
}
class Manager extends Employee {
Manager(long Id, String Name, String Address, long phone, double basicSalary) {
super(Id, Name, Address, phone, basicSalary);
}
}
class Trainee extends Employee {
Trainee(long Id, String Name, String Address, long phone, double basicSalary) {
super(Id, Name, Address, phone, basicSalary);
}
}
class InheritanceActivity {
public static void main(String[] args) {
Manager m = new Manager(126534,"Peter","Chennai,India",237844,65000);
m.CalculateSalary();
Trainee t = new Trainee(29846,"Jack","Mumbai,India",442085,45000);
t.CalculateSalary();
}
}
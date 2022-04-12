//parent class
class Vehicle{
String type= "4-wheeler";
String brand = "Ford";
}
//child class
class Car extends Vehicle{
String modelname = "abc123";
}
//main method class
class SingleInhExample{
public static void main(String[]args){
Car c =new Car();
System.out.println("car brand is :" +c.brand);
System.out.println("car model is:" +c.modelname);
}
}

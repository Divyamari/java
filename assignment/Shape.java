 interface ShapeEx {
	void getArea();
	void  getSides();
}
	class Rectangle implements ShapeEx{
	public void getArea() {
		int length = 2;
		int breath = 5;
		int area_rec = length*breath;
		System.out.println("Area of Rectangle:"+area_rec);
	}
	public void getSides() {
		System.out.println("Rectangle has four sides");
		}
	}
	class Circle implements ShapeEx{
	public void getArea() {
		int radius = 2;
		double pi = 3.14;
		double area_cir = pi*radius*radius;
		System.out.println("Area of Circle:"+area_cir);
	}
	public void getSides() {
		System.out.println("Circle has no sides");
	}
	}
	class Triangle implements ShapeEx{
	public void getArea() {
		float breath = 4, height = 10;
		float area_tri = (breath*height)/2;
		System.out.println("Area of Triangle:"+area_tri);
	}
	public void getSides() {
		System.out.println("Triangle has three sides");
	}
	}
	public class Shape{
	public static void main (String args[]) {
		Rectangle r = new Rectangle();
		r.getArea();
		r.getSides();
		Circle c = new Circle();
		c.getArea();
		c.getSides();
		Triangle t =  new Triangle();
		t.getArea();
		t.getSides();
	}
	}
	
	
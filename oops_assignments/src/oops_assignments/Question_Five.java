package oops_assignments;
abstract class Shape{
	abstract void draw();
	
}
class Line extends Shape{
	public void draw() {
		System.out.println("Drawing Line");
		
	}
	
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}
class Cube extends Shape{
	public void draw() {
		System.out.println("Drawing Cube");
	}
	
}

public class Question_Five {

	public static void main(String[] args) {
		Shape s= new Line();
		s.draw();
		Cube c= new Cube();
		c.draw();
		Rectangle r= new Rectangle();
		r.draw();
		
	}

}

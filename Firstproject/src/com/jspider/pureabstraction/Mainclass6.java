package com.jspider.pureabstraction;
interface Shape{
	void draw();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing circle");
		
	}
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing square");
		
	}
	
}
class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing triangle");
		
	}
}
class ShapeToolkit{
	static void drawShape(Shape s) {
		if(s!=null) {
			s.draw();
		}
	}
}
public class Mainclass6 {
	public static void main(String[] args) {
		Circle c=new Circle();
		ShapeToolkit.drawShape(c);
		Square s=new Square();
		ShapeToolkit.drawShape(s);
		Triangle t=new Triangle();
		ShapeToolkit.drawShape(t);
	}

}

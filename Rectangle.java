package Exam2;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle ( double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() {
		double A;
		A = width * length;
		return A;
	}
	
	public double getPerimeter() {
		double p;
		p = 2 * (width+length);
		return p;
	}

}

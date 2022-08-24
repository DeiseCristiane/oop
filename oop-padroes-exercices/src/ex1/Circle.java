package ex1;

public class Circle {
	private double radius;
	private String color;
	
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}


	public Circle() {
		this.radius = 1.0;
		this.color = "red";
		
	}
	
	
	public Circle (double r) {
		this.radius = r;
		this.color = "red";
	}
	
	public Circle(double r, String color) {
		
	}
	
	public String getColor() {
		return this.color;
		
	}
	
	
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}


	public void setColor(String newColor) {
		this.color = newColor;
	}


	public double getRadius() {
		return this.radius;
		
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	

}

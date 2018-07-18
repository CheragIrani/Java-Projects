package oo;

public class Rectangle extends Shape {
	private double width;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	private double height;
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area(){
		return width * height;
	}

}

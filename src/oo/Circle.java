package oo;

public class Circle extends Shape {

	private double diameter;
	
	public double getDiameter() {
		return this.diameter;
	}
	
	public void setDiameter(double value){
		this.diameter = value;
	}
	
	public double area() {
		return Math.PI * (this.diameter/2)*(this.diameter/2);
	}
}

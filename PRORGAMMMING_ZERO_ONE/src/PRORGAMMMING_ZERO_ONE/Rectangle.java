package PRORGAMMMING_ZERO_ONE;

public class Rectangle {
	
	double length;
	double width;
	
Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
}

double getArea() {
	return length * width;
	
}

double getPerimeter() {
	return 2 * (length + width);
	
	}
}
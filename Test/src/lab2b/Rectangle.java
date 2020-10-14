package lab2b;

public class Rectangle {
private double length;
private double width;
public double getLength() {
	return length;
}

public Rectangle() {
	setWidth(1);
	setLength(1);
}

public Rectangle(double length, double width) {
	setLength(length);
	setWidth(width);
}

public void setLength(double length) {
	if(length>=0&&length<=40)
	{
		 this.length = length;
	}
	else 
	{
		System.out.println("Invalid length");
	}
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	if(length>=0&&length<=40)
	{
		 this.width = width;
	}
	else 
	{
		System.out.println("Invalid length");
	}
}
@Override
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + "]";
}

}

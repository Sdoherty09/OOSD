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
public double getArea()
{
	return width*length;
}
public double getPerimeter()
{
	return (width*2)+(length*2);
}
public String printRectangle()
{
	String output="";
	for (int i=0;i<width;i++)
	{
		for(int j=0;j<length;j++)
		{
			if(i==0||i==width-1)
			{
				output+="*";
			}
			else
			{
				if(j==0||j==length-1)
				{
					output+="*";
				}
				else
				{
					output+=" ";
				}
			}
		}
		output+="\n";
	}
	return output;
}
@Override
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + "]";
}

}

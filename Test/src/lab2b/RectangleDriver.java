package lab2b;

public class RectangleDriver {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		System.out.println(rect.toString());
		rect=new Rectangle(10,4);
		System.out.println(rect.toString());
		System.out.println("Area: "+rect.getArea()+"\nPerimeter: "+rect.getPerimeter());
		System.out.println(rect.printRectangle());
	}
	
}

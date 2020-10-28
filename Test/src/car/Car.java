package car;

public class Car {
private String make;
private String model;
private double engineSize;
private double price;
private boolean sold;

public Car() {
	setMake("");
	setModel("");
	setEngineSize(0.0);
	setPrice(0.0);
}

public Car(String make, String model, double engineSize, double price) {
	setMake(make);
	setModel(model);
	setEngineSize(engineSize);
	setPrice(price);
}

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getEngineSize() {
	return engineSize;
}
public void setEngineSize(double engineSize) {
	this.engineSize = engineSize;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isSold() {
	return sold;
}
public void sellCar() {
	if(sold)
	{
		System.out.println("Car is already sold");
	}
	else
	{
		this.sold=true;
		System.out.println("Sold car");
	}
}

@Override
public String toString() {
	return "Car [make=" + make + ", model=" + model + ", engineSize=" + engineSize + ", price=" + price + ", sold="
			+ sold + "]";
}

}

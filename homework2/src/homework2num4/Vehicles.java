package homework2num4;

public class Vehicles {
	private String brand;
	private String color;
	public void run() {
		System.out.println("我已经开动");
	}
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void showInfo() {
		System.out.println(brand+color);
	}
	
}

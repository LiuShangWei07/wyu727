package homework2num1;

public class Vehicle {
	private int speed;
	private int size;
	public void speedUp() {
		System.out.println("¼ÓËÙ");
	}
	public void speedDown() {
		System.out.println("¼õËÙ");
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

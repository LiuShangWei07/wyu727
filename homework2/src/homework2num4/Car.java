package homework2num4;

public class Car extends Vehicles {
	private int seats;
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void showCar() {
		System.out.println(seats+getBrand()+getColor());
		
	}
	
}

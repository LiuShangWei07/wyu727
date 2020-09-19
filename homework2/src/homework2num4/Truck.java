package homework2num4;

public class Truck extends Vehicles {
	private float load;

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	public void showTruck() {
		System.out.println(load+getBrand()+getColor());
	}
}

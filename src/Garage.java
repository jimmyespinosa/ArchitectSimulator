
public class Garage extends Building{
	
	/**
	 * How many cars are in the garage
	 */
	private int cars;

	public void setCars(int cars) {
		this.cars = cars;
	}
	
	public int getCars() {
		return cars;
	}


	//I thought this could be the best way to determine what floor the garage has. To prevent
	//dual true booleans, we'd have to create an if/else statement later on.
	public boolean gravelFloor;
	public boolean cementFloor;

}


public class Garage extends Building{
	
	public int cars;
	
	//I thought this could be the best way to determine what floor the garage has. To prevent
	//dual true booleans, we'd have to create an if/else statement later on.
	public boolean gravelFloor;
	public boolean cementFloor;

	public Garage(double length, double width) {
		super(length, width);
	}
}

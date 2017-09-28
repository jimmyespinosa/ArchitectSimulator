
public class Test {

	public static void main(String[] args) {
		// This Class will make instances of the classes and output the text representation
		
		/*
		 * Below we're testing the Garage Method
		 */
		Garage twoCar = new Garage();
		
		twoCar.setCars(2);
		System.out.println(twoCar.getCars());
		
		/*
		 * Below we're testing the House Method
		 */
		House niceHouse = new House();
		
		niceHouse.setNumBathrooms(12);
		//niceHouse.setRooms(20);
		
		System.out.println(niceHouse.getNumBathrooms());
		System.out.println(niceHouse.toString());
		
		//Below we implement the method getMLSListing which was implemented from the MLSInterface class
		System.out.println(niceHouse.getMLSListing());
		
		/*
		 * Below we're testing the Building Method
		 */
		
		Building building = new Building();
		//sqFoot is taking an argument of length and width
		System.out.println(building.sqFoot(560.0, 450.0));
	}

}

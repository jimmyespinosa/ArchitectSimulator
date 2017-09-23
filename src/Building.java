
public class Building {

		public abstract class Blueprint {
		
	//	A building has a number of floors, and a number of windows.  
		public int floors;
		public int windows;
		public double length, width;
	
		public double Building (double length, double width){
			double totalFloorSpace;
			totalFloorSpace = length * width;
			return totalFloorSpace;
		}
	} 
		
//	public static void main(String args[]){
//		Garage twoCar = new Garage();
//		
//		twoCar.setCars(3);
//		System.out.println(twoCar.getCars());
//		
//		House myHome = new House();
//		
//		myHome.setRooms(3);
//		
//		myHome.getRooms();
//		System.out.println(myHome.getRooms());
//	}
}
	



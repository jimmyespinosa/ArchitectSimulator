
public class Building {
		
	//	A building has a number of floors, and a number of windows.  
		private int floors;
		private int windows;
		private double length, width;
	
		public double sqFoot (double length, double width){
			double totalFloorSpace;
			totalFloorSpace = length * width;
			return totalFloorSpace;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public int getWindows() {
			return windows;
		}

		public void setWindows(int windows) {
			this.windows = windows;
		}

		public int getFloors() {
			return floors;
		}

		public void setFloors(int floors) {
			this.floors = floors;
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

	



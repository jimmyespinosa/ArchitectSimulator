
public class House extends Building{

	private int total = 0;
	
	private int average;
	
	private int[] rooms;		
	
	/**
	 * Number of bathrooms in building
	 */
	private int numBathrooms;
	
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}
/********************************************************************************************************************************/
	
	/**
	 * Number of rooms and average size of room
	 */
	
	private void setRooms(){
		 String[] arrayw = new String[4]; //populate array
		 getRooms(arrayw);
	}

	public int[] getRooms(String[] a) {
		return rooms;
		
	}

	/********************************************************************************************************************************/

	
	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
	
	public int avgRoomSize(int[] rooms) {
		
		for (int i = 0; i < rooms.length; i++){
			total =+ i;
			
		}
		
		setAverage(total / rooms.length);
		
		return getAverage();
		
	}


	
	
}

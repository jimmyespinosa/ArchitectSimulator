
public class House extends Building{
//	A House is a building
	
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
	private int[] rooms;
	
	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}

	public int[] getRooms() {
		return rooms;
		
	}


	private int total = 0;
	
	private int average;
	
	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
	
	
	/**
	 * 
	 * 
	 */
	
	public void avgRoomSize(int[] rooms) {
		
		for (int i = 0; i < rooms.length; i++){
			total =+ i;
			
		}
		
		setAverage(total / rooms.length);
		
	}


	
	
}

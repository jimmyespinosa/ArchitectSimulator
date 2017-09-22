
public class House extends Building{
//	A House is a building
	public int numBathrooms;
	
	public int[] rooms;
	
	private int total = 0;
	public int average;
	
	public House(double length, double width) {
		super(length, width);
		// TODO Auto-generated constructor stub
	}
	public void avgRoomSize(int[] rooms) {
		for (int i = 0; i < rooms.length; i++){
			total =+ i;
		}
		
		average = total / rooms.length;
		
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public int[] getRooms() {
		return rooms;
	}
	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	
	
	
}

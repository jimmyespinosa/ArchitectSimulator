
public class Room extends House implements Comparable {
	// A room has a length, width, a floor covering, and a number of closets.

	private double roomLength, roomWidth;

	private boolean hasFloorCovering;

	private int numOfClosets;

	public Room(double L, double W, int C) {
		roomLength = L;
		roomWidth = W;
		numOfClosets = C;
	}

	
	public int compareTo(Object temp) {
		Room other = (Room) temp;
		if (getNumOfClosets() > other.getNumOfClosets()) {
			return 1;
		} else if (getNumOfClosets() < other.getNumOfClosets()) {
			return -1;
		} else {
			return 0;
		}
	}

	public double getRoomLength() {
		return roomLength;
	}

	public void setRoomLength(double roomLength) {
		this.roomLength = roomLength;
	}

	public double getRoomWidth() {
		return roomWidth;
	}

	public void setRoomWidth(double roomWidth) {
		this.roomWidth = roomWidth;
	}

	public boolean isHasFloorCovering() {
		return hasFloorCovering;
	}

	public void setHasFloorCovering(boolean hasFloorCovering) {
		this.hasFloorCovering = hasFloorCovering;
	}

	public int getNumOfClosets() {
		return numOfClosets;
	}

	public void setNumOfClosets(int numOfClosets) {
		this.numOfClosets = numOfClosets;
	}

	/**
	 * Here we calculate the room dimensions.
	 * 
	 * @param x
	 *            is room Length
	 * @param y
	 *            is room Width
	 */
	public void setRoomDimensions(int x, int y) {
		roomLength = x;
		roomWidth = y;
	}

	public double getRoomDimensions() {
		return roomLength * roomWidth;
	}
}

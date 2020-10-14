package lab2;

public class HotelRoom {
	
private int roomNumber;
private String roomType;



public HotelRoom(int roomNumber, String roomType) {
	setRoomNumber(roomNumber);
	setRoomType(roomType);
}

public HotelRoom() {
	setRoomNumber(0);
	setRoomType("");
}

public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}

@Override
public String toString() {
	return "HotelRoom [roomNumber=" + roomNumber + ", roomType=" + roomType + "]";
}

}

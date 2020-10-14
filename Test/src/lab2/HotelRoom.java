package lab2;

public class HotelRoom {
	
private int roomNumber;
private String roomType;
private int vacant;
private double rate;

public HotelRoom(int roomNumber, String roomType) {
	setRoomNumber(roomNumber);
	setRoomType(roomType);
}
public HotelRoom(int roomNumber, String roomType, int vacant, double rate) {
	setRoomNumber(roomNumber);
	setRoomType(roomType);
	setVacant(vacant);
	setRate(rate);
}

public HotelRoom() {
	setRoomNumber(0);
	setRoomType("");
	setVacant(0);
	setRate(0.0);
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

public int getVacant() {
	return vacant;
}

public void setVacant(int vacant) {
	this.vacant = vacant;
}

public double getRate() {
	return rate;
}

public void setRate(double rate) {
	this.rate = rate;
}

@Override
public String toString() {
	return "HotelRoom [roomNumber=" + roomNumber + ", roomType=" + roomType + ", vacant=" + vacant + ", rate=" + rate
			+ "]";
}



}

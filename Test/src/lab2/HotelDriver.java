package lab2;

public class HotelDriver {

	public static void main(String[] args) {
		HotelRoom roomA=new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		System.out.println("Room number is "+roomA.getRoomNumber()+", type is "+roomA.getRoomType());
		HotelRoom roomB=new HotelRoom(201, "Double");
		System.out.println("Room number is "+roomB.getRoomNumber()+", type is "+roomB.getRoomType());
	}

}

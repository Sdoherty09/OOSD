package lab2;

public class HotelDriver {

	public static void main(String[] args) {
		HotelRoom roomA=new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		HotelRoom roomB=new HotelRoom(201, "Double");
		System.out.println("Room number is "+roomA.getRoomNumber()+", type is "+roomA.getRoomType());		
		System.out.println("Room number is "+roomB.getRoomNumber()+", type is "+roomB.getRoomType());
		roomA.setVacant(1);
		roomA.setRate(100.0);
		roomB.setVacant(0);
		roomB.setRate(80.0);
		System.out.println(roomA.toString());
		System.out.println(roomB.toString());
		HotelRoom roomC=new HotelRoom(202,"Single",0,90.0);
		System.out.println(roomC.toString());
	}

}

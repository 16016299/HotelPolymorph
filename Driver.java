package PolyHotel;

public class Driver {

	public static void main(String[] args) {
		
		Hotel h1 = new Hotel(101,"The Grand");
		
		h1.display();
		h1.bookARoom();
		h1.display();
		h1.CancelARoom();
		h1.display();

	}

}

package PolyHotel;

import java.util.Scanner;

public class Hotel {
	int hotelNumber;
	String hotelName;
	Floor floors[] = new Floor[4];
	
	public Hotel(int nos, String name){
		hotelNumber = nos;
		hotelName = name;
		
		Floor f1 = new Floor(1);
		Floor f2 = new Floor(2);
		Floor f3 = new Floor(3);
		Floor f4 = new Floor(4);
		
		floors[0] = f1;
		floors[1] = f2;
		floors[2] = f3;
		floors[3] = f4;

	}
	
	public void display()
	{
	System.out.println("Hotel Name: "+hotelName);
	for (int counter=0;counter <floors.length; counter++)
		{
		floors[counter].displayFloor(); //uses the method in floor
		}
	}
	
	public void display(int floornos) //the floor number will be passed to the method
	{
		System.out.println("Hotel Name: "+hotelName);
		floors[floornos].displayFloor();
	}
	
	public void bookARoom()
	{
		Scanner kboard = new Scanner(System.in);
		int floorchoice;
		System.out.println("Which floor would you like to stay on?");
		floorchoice = kboard.nextInt();
		floors[floorchoice-1].findaRoomtoBook();
	}
	
	public void CancelARoom()
	{
		Scanner kboard = new Scanner(System.in);
		int floorchoice;
		System.out.println("Which floor are you staying stay on?");
		floorchoice = kboard.nextInt();
		floors[floorchoice-1].findaRoomtoCancel();
	}
	
}

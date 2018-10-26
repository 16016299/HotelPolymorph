package PolyHotel;

import java.util.Scanner;

public class Room {


	private int roomNos;
	private Customer occupier;
	private boolean status;

	public Room(int rnos)
	{
		roomNos = rnos;
		status = true; //free
	}
	
	public void display()
	{
		System.out.println("Room number: "+roomNos);
		if (status==true)
			System.out.println("Room is free");
		else
			occupier.display();
	}
	
	public void bookroom(Customer newperson)
	{
	if (status==true)
		{
		status = false;
		occupier = newperson;
		}
	else
		System.out.println("Sorry room booked");
	}
	
	public void bookroom()
	{
	System.out.println("Room "+roomNos);
	if (status==true)
		{
		Customer newperson = new Customer();
		newperson.getname();
		newperson.getemail();
		status = false;
		occupier = newperson;
		}
	else
		System.out.println("Sorry room booked");
	}
	public void cancelRoom()
	{
		status = true;
		occupier = null;
		System.out.println("Room cancelled");
	}
	
	public int returnRoomNos()
	{
		return(roomNos);
	}


}

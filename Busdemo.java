package bus.Ticket.Reservation;
import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();//Arraylist - collection
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,40));
		int useropt =1;
		Scanner s = new Scanner(System.in);
		for(Bus b:buses)
		{
			b.displayBusinfo();
		}
		while(useropt==1)
		{
			System.out.println("enter 1 to book and 2 to exit");
			useropt=s.nextInt();
			if(useropt==1)
			{
				//System.out.println("booking.....");
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("YOUR BOOKING IS CONFIRMED");
				}
				else
					System.out.println("sorry bus is full.Try another bus or date");
			}
		}

	}

}

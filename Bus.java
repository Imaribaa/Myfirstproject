package bus.Ticket.Reservation;

public class Bus {
	private int busNo,capacity;
	private boolean ac;//get and set
	public Bus(int busNo,boolean ac,int cap) {
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=cap;
		// TODO Auto-generated constructor stub
	}
	public int getCapacity()//accessor method
	{
		return capacity;
	}
	public int setCapacity(int cap)//mutator method
	{
		return capacity=cap;
	}
	public boolean setAc(boolean val)//mutator method
	{
		return ac=val;
	}
	public void displayBusinfo()
	{
		System.out.println("bus No:"+busNo+" Ac:"+ac+" Total Capacity:"+capacity);
	}
	public int getBusNo() {
		// TODO Auto-generated method stub
		
		return busNo;
	}
}

package problem3;

public class TicketTester {
	public static void main(String[] args) {
		WalkupTicket walk1=new WalkupTicket(14);

		System.out.println("Price: "+walk1.Price);
		System.out.println(walk1);

		AdvanceTicket Advance=new AdvanceTicket (14,16);
		System.out.println("Price: "+Advance.Price);
		System.out.println(Advance);

		AdvanceTicket Advance2 = new AdvanceTicket(12,5);
		System.out.println("Price: "+ Advance2.Price);
		System.out.println(Advance2);

		StudentAdvanceTicket StudentAdvance= new StudentAdvanceTicket(15,16,"(ID required)");
		System.out.println("Price: "+StudentAdvance.Price);
		System.out.println(StudentAdvance+ "" + StudentAdvance.getID());

		StudentAdvanceTicket StudentAdvance2= new StudentAdvanceTicket(16,5,"(ID required)");
		System.out.println("Price: "+StudentAdvance2.Price);
		System.out.println(StudentAdvance2+ "" + StudentAdvance2.getID());

	}

}

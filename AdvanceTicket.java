package problem3;

public class AdvanceTicket extends Ticket {

	public AdvanceTicket(int Number, int daysBefore) {
		super(Number);
		 if (daysBefore < 10) {
	            Price = 40;
	        } else {
	            Price = 30;
	        }
	}

}

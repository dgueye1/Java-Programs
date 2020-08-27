package problem3;

public class StudentAdvanceTicket extends AdvanceTicket {
	private String ID;

	public StudentAdvanceTicket(int Number, int daysBefore, String ID) {
     super(Number, daysBefore);
     Price/=2;
     this.ID=ID;
     
	}
	 public String getID() {
	        return ID;
	    }
}

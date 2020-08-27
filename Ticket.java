package problem3;

public abstract class Ticket {
	 private int Number;
	    protected double Price;
	   
	    public Ticket(int number) {
	        this.Number = number;
	    }
	   
	    public double getPrice() {
	        return Price;
	    }
	   
	    public String toString() {
	        return "Number: "+Number+", price: "+Price;
	    }
	   
	    
}

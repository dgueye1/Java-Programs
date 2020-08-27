package Question2;

public class GroceryItemOrder {
	    private String name;
	    private int quantity;
	    private double pricePerUnit;
	    
	 
	    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
	 
	        this.name = name;
	        this.quantity = quantity;
	        this.pricePerUnit = pricePerUnit;
	        
	 
	    }
	 
	    public double getCost() {
	 
	        return this.quantity * this.pricePerUnit;
	    }
	 
	    public void setQuantity(int quantity) {
	 
	        this.quantity = quantity;
	 
	    }
}

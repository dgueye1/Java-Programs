package Question2;
public class GroceryList {
	 private GroceryItemOrder[] grocery;
	    int count;
	    
	    public GroceryList() {
	 
	        grocery = new GroceryItemOrder[10];
	        count = 0;
	 
	    }
	 
	    public void add(GroceryItemOrder item) {
	        this.grocery[count] = item;
	        count++;
	        
	    }
	 
	    public double getTotalCost() {
	        double totalcost = 0;
	        for(int i = 0; i < this.count; i++){
	        totalcost = totalcost + this.grocery[i].getCost();
	        }
	                 
	        return totalcost;
	    }
}

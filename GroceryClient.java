package Question2;

public class GroceryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GroceryList grocery = new GroceryList();
		 GroceryItemOrder chicken = new GroceryItemOrder("chicken", 3, 3.50);
		 grocery.add(chicken);
		 GroceryItemOrder grapes = new GroceryItemOrder("grapes", 6, 1.00);
		 grocery.add(grapes);
		 GroceryItemOrder tomatoes = new GroceryItemOrder("tomatoes", 2, 1.10);
		 grocery.add(tomatoes);
		 GroceryItemOrder bread = new GroceryItemOrder("bread", 4, 3.05);
		 grocery.add(bread);
		 GroceryItemOrder milk = new GroceryItemOrder("milk", 2, 2.99);
		 grocery.add(milk);
		 GroceryItemOrder asparagus = new GroceryItemOrder("asparagus", 2, 1.99);
		 grocery.add(asparagus);
		 GroceryItemOrder potatoes = new GroceryItemOrder("potatoes", 3, 1.99);
		 grocery.add(potatoes);
		 GroceryItemOrder chips = new GroceryItemOrder("chips", 2, 1.49);
		 grocery.add(chips);
		 GroceryItemOrder cereal = new GroceryItemOrder("cereal", 1, 5.99);
		 grocery.add(cereal);
		 GroceryItemOrder ham = new GroceryItemOrder("ham", 2, 4.39);
		 grocery.add(ham);
		 System.out.println(grocery.getTotalCost());
	}

}

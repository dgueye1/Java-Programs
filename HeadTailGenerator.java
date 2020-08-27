import java.util.*;
public class HeadTailGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Scanner game = new Scanner(System.in);
     System.out.println("Number of times to play the game: ");
     int numgame = game.nextInt();
     double[] array = new double [numgame];
     double count=0;
     double b=0; 
     for(int i=0; i < numgame; i++) {
    	 count=0;
    	 System.out.println("Enter the coin flips for game " + (i+1) + ": ");
    	  String coins = game.next();
    	 for(int j=0; j < coins.length(); j++) {
    		 
    		 if(coins.charAt(j)=='H' || coins.charAt(j) == 'h') {
    			 count++;
    		 }
    		 array[i]=count; 
    		  b = count/coins.length()*100;
    	 }

		 System.out.print("Game " + (i+1)+ ": " +(int)count + " heads " + "(" + (int) b + "%"+ ")" +";" ); 
		 if (b>50) {
			 System.out.println("You win"); 
		 }
		 else {
			 System.out.println("You lose"); 
		 }
    		 
     }
    	 
     }         
	}
	


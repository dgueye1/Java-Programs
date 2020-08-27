import java.util.*;
public class CollegeAdmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Problem2();
	}
	public static void Problem2() {
		Scanner grade = new Scanner(System.in);
		  System.out.println("What is your GPA: ");
		  double GPA = grade.nextDouble();
		  System.out.println("What is your SAT score: ");
		  int SAT = grade.nextInt();
		  
		  if(GPA >= 1.8) {
			  if(SAT >= 900) {
				  System.out.println("You are accepted!");
			  } else {
				  System.out.println("I'm sorry you are not accepted.");
			  }
			  
		  } else {
			  System.out.println("I'm sorry you are not accepted.");
		  }
	}
}

import java.util.Scanner;

public class attempt {

	public static void main(String[] args) {
	String cat;
	boolean j = true;
	do {
	Scanner sc = new Scanner (System.in);
	System.out.println("Hi, would you like to convert Euro in Dollars or Dollars in Euro. For Euro in Dollar please press 1, for Dollar in Euro any number.");
	int x1= sc.nextInt();
	sc.nextLine();
	
	if (x1==1) {
	System.out.println("Please enter the amount of Euro that you would like to convert");
	// euro dollar set up 
	double euro = sc.nextDouble();
	sc.nextLine();
	double dollar = euro*1.34;
	System.out.println("Your converted amount in Dollar is:" +dollar);
	
	}
	else {
		// dollar euro setup
		System.out.println("Please enter the amount of Dollars that you would like to convert");
		double dollar = sc.nextDouble();
		sc.nextLine();
		double euro = dollar*0.84;
		System.out.println("Your converted amount in Euro is:" +euro);
		
		

		
	
	}
	System.out.println("Would you like to convert another amount then press y if not press n");
	cat =sc.nextLine();
	if (cat.equals("y")) {
		j=true;
	
	}
	else  if(cat.equals("n")) {
		j=false;
	}
		
}while (j); 
	
	

	

	
	}
package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args){	// TODO Automatisch generierter Methodenstub
	do{
	Scanner sc = new Scanner (System.in);
	System.out.print("Wählen Sie 1 für Euro in Dollar und 2 für Dollar in Euro");
	double zahl= sc.nextDouble();
	if(zahl==1){ 
		System.out.print("Euro in Dollar");
		double euro= sc.nextDouble();
		double dollar= euro*1.34 ;
		System.out.println("\n Dollar=" + dollar);
	}
	else{
		System.out.print("Dollar in Euro");
		double dollar= sc.nextDouble();
		double euro = dollar*0.86 ;
		System.out.println("\n Dollar=" + euro);
	}
	}while (true);
	}	
}
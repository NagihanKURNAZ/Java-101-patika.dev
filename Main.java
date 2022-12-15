import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {

	public static void main(String[] args) {
	
	 
		Scanner input = new Scanner(System.in);
		
		double km, perkm = 2.20, opentaximeter = 10, totalAmount; 
		
		System.out.println("******* Taximetre Account *********");
		System.out.println("How Many Kilometers Traveled? : ");
		km = input.nextDouble();
		
		totalAmount = opentaximeter + (km*perkm) ;
		
		totalAmount = (totalAmount<20) ? 20 : totalAmount;
		
		System.out.println("Total Amount: " +totalAmount);
		
		
		
		
		

	}

}

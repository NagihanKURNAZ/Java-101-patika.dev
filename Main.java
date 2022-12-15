import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, toplamtutar;
		int a, e, d, m, p;
		
		System.out.println("Kaç kilo armut aldınız?");
		a = input.nextInt();
		System.out.println("Kaç kilo elma aldınız?");
		e = input.nextInt();
		System.out.println("Kaç kilo domates aldınız?");
		d = input.nextInt();
		System.out.println("Kaç kilo muz aldınız?");
		m = input.nextInt();
		System.out.println("Kaç kilo patlıcan aldınız?");
		p = input.nextInt();
		
		toplamtutar = ((a*armut) + (e*elma) + (d*domates) + (m*muz) + (p*patlıcan));
		System.out.println("Toplam Tutar: " +toplamtutar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

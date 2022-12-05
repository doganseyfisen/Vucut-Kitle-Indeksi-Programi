import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		
		int kilo;
		float boy;
		double indeks;
		Scanner input = new Scanner(System.in);
		System.out.print("Boyunuzu (örn. 1,68) giriniz: ");
		boy = input.nextFloat();
		System.out.print("Kilonuzu giriniz: ");
		kilo = input.nextInt();
		indeks = (kilo)/(boy * boy);
		System.out.println("Vücut Kitle İndeksiniz: "+ indeks);
		}
	}	

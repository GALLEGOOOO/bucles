import java.util.Scanner;
public class ACT43 {
	
	public static void main(String[] args) {
		
	Scanner e = new Scanner(System.in);
	
	int diferent_a=0;
	char lletra;
	
	System.out.print("Introdueix el text que vulguis lletra per lletra");
	System.out.println("\n");
	
	do {
		lletra = e.next().charAt(0);
		if(lletra !='a') {
			diferent_a++;
		}
		if(lletra == '*') {
		}
	}while(lletra!='*');
	
	System.out.println("En tot el text hi ha "+diferent_a+" lletres diferents a A.");
	}
}
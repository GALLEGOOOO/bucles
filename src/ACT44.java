import java.util.Scanner;
public class ACT44 {
	
	public static void main(String[] args) {
		
	Scanner e = new Scanner(System.in);
	
	int a=0;
	char lletra;
	
	System.out.print("Introdueix el text que vulguis lletra per lletera");
	System.out.println("\n");
	
	do {
		lletra = e.next().charAt(0);
		if(lletra=='a' ||lletra=='e'|| lletra=='i' ||lletra=='o'|| lletra=='u' || lletra=='A' ||lletra=='E'|| lletra=='I' ||lletra=='O'|| lletra=='U') {
			a++;
		}
	}while(lletra!='*');
	
	System.out.println("En tot el text hi ha "+a+" vocals");
	}
}
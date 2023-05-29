import java.util.Scanner;
public class ACT42 {
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int a=0;
		char lletra;
		
		System.out.print("Introdueix el text que vulguis lletra per lletera");
		
		do {
			lletra = e.next().charAt(0);
			if(lletra=='a') {
				a++;
			}
		}while(lletra!='*');
		
		System.out.println("En tot el text hi ha "+a+" lletres a.");
	}

}
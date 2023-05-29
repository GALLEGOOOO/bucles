import java.util.Scanner;
public class ACT45 {
	
	public static void main(String[] args) {
		
	Scanner e = new Scanner(System.in);
	
	int numero=0;
	char lletra;
	String text="";
	
	System.out.println("Introdueix el text que vulguis lletra per lletra");
	
	do {
		lletra = e.next().charAt(0);
		text = text + lletra;
		if(lletra=='a' || lletra=='A'){
			if(text.length()>=2) {
				int posicio = text.length()-2;
				if(text.charAt(posicio)=='l' || text.charAt(posicio) == 'L') {
					numero++;
				}
			}
			else {
			}
		}
	}while(lletra != '*');
	
	System.out.println("El text que has escrit és\n" + text + "\ni en total hi ha "+numero+" combinacions LA");
	}
}
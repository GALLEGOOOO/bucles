import java.util.Scanner;
public class ACT37 {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Introduïu el número el factorial del qual cal trobar: ");
	    int n = scanner.nextInt();
	    int resultat = factorial(n);
	    
	    System.out.println("El factorial de " + n + " és " + resultat);
	}

	public static int factorial(int n) {
	     int resultat = 1;
	     for (int i = 1; i <= n; i++) {
	    	 resultat = resultat * i;
	    }
	    return resultat;
	}
}	

 
 
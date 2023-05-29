import java.util.Scanner;
public class ACT40 {
	
	public static void main(String[] args) {

	   int numberOfRows;
	   int number = 1;

	   System.out.print("Introdueix un numero: ");
	   Scanner in = new Scanner(System.in);
			    numberOfRows = in.nextInt();
			    
	   for (int row = 1; row <= numberOfRows; row++)
	    {
	   for (int column = 1; column <= row; column++)
	     {
	       System.out.print(number + " ");
	       number++;
	     }
	     System.out.println();
	    }
	}
}


 
 
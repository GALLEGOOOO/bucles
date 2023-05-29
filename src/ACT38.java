import java.util.Scanner;
public class ACT38 {
	
	public static void main(String[] ar) {
		
		int N;
		int C;
		int inparell;
      
      Scanner teclat = new Scanner(System.in);
      
      System.out.println("Introdueix un numero imparell");
      N = teclat.nextInt();
      C = 0;
      inparell = 1;
      
      while (C<N) {
    	  System.out.println(inparell);
    	  C++;
    	  inparell = inparell+2;
      }

	}
}

 
 
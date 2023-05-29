import java.util.Scanner;
public class ACT36 {
	
	public static void main(String[] ar) {
		
      int N;
      int M;
      int multiple;
      
      Scanner num = new Scanner(System.in);

      System.out.println("Introdueix el primer numero");
      N = num.nextInt();
      
      System.out.println("Introdueix el segont numero");
      M = num.nextInt();
      
      multiple = 1;
    		  
      while (N*multiple>M) {
    	  System.out.println(N*multiple);
    	  multiple++;
      }
	}
}

 
 
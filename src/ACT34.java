import java.util.Scanner;
public class ACT34 {
	
	public static void main(String[] ar) {
		
      double elevadors;
      double mitja;
      double mitja_final;
      double valors;
      
      valors=0;
      elevadors=0;
      mitja=0;
      
      Scanner valor = new Scanner(System.in);
      
      do {
      valors = valor.nextDouble();
      mitja = mitja + valors;
      
      if (valors!=0) {
      elevadors++;
	}
      
    }
    while(valors!=0);
      mitja_final = mitja / elevadors;
      System.out.println(mitja_final);
	}
}

 
 
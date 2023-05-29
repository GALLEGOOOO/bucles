import java.util.Scanner;
public class ACT35 {
	
	public static void main(String[] ar) {
		
      double elevadors;
      double mitja;
      double mitja_final;
      double valors;
      double valor_petit;
      double valor_gran;
      
      valors=0;
      elevadors=0;
      mitja=0;
      valor_gran=0;
      valor_petit=Math.pow(10, 308);
      
      Scanner valor = new Scanner(System.in);
      
      do {
      valors = valor.nextDouble();
      mitja = mitja + valors;
      
      if (valors!=0) {
      elevadors++;
      
      if (valors>valor_gran) {
    	  valor_gran = valors;
      }
      
      if (valors<valor_petit) {
    	  valor_petit = valors;
      }
	}
      
    }
    while(valors!=0);
      mitja_final = mitja / elevadors;
     System.out.println(mitja_final);
     System.out.println(valor_gran);
     System.out.println(valor_petit);
	}
}

 
 
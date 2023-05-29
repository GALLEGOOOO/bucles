import java.util.Scanner;
public class ACT33 {
	
	public static void main(String[] ar) {
		
      double suma;
      double valores;
      
      Scanner valor = new Scanner(System.in);
      valores = 1;
      suma = 0;
      
      while (valores!=0) {
    	  valores = valor.nextDouble();
      	  suma = suma +  valores;
    }
		System.out.println(suma);

}
}

 
 
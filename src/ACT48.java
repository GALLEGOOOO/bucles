import java.util.Scanner;
public class ACT48 {
	
	 public static void main(String[] args) {
	   
	       int numero_ordenador;
	       int numero_usuario;
	       int vidas = 3;
	       
	       System.out.println("Adivina el numero que estoy pensando");
	       System.out.println("Tienes 3 intentos");
	       
	       Scanner secreto = new Scanner(System.in);
	       
	       numero_ordenador = (int) ((Math.random() * 10)+1);
	       numero_usuario = secreto.nextInt();
	       
	       while (vidas>1) {
	           if (numero_usuario==numero_ordenador) {
	               System.out.println("Has Acertado, Felicidades");
	               break;
	           }
	           else {
	               if (numero_usuario>numero_ordenador) {
	                   System.out.println("Lo siento, Has fallado \n" + "El numero que habia pensado es menor que el que tu has introducido");
	                   vidas = vidas-1;
	               }
	               else {
	                   System.out.println("Lo siento, Has fallado \n" + "El numero que habia pensado es mayor que el que tu has introducido");
	                   vidas = vidas-1;
	               }
	           }
	           numero_usuario = secreto.nextInt();
	       }
	       if (vidas==1) {
	       System.out.println("Lo siento, ya no te quedan vidas \n" + "El numero que habia pensado era el " + numero_ordenador);
	       }
	  }
}
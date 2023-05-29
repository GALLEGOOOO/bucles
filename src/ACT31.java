import java.util.Scanner;
public class ACT31 {
	
	public static void main(String[] args) {
		
        int diners;
        int b500;
        int b200;
        int b100;
        int b50;
        int b20;
        int b10;
        int b5;
        int m2;
        int m1;
        int I;
        
        Scanner billets = new Scanner (System.in);
        diners = billets.nextInt();
        System.out.println(diners + " Euros equivalen a:");
        for (I=0;diners>=500;I++)  {
        	b500 = diners/500;
            System.out.println(b500 + " billets de 500€");
            diners = diners%500;
        }
        for (I=1;diners>=200;I++)  {
        	b200 = diners/200;
            System.out.println(b200 + " billets de 200€");
            diners = diners%200;
        }
        for (I=2;diners>=100;I++)  {
        	b100 = diners/100;
            System.out.println(b100 + " billets de 100€");
            diners = diners%100;
        }
        for (I=3;diners>=50;I++)  {
        	b50 = diners/50;
            System.out.println(b50 + " billets de 50€");
            diners = diners%50;
        }
        for (I=4;diners>=20;I++)  {
        	b20 = diners/20;
            System.out.println(b20 + " billets de 20€");
            diners = diners%20;
        }
        for (I=5;diners>=10;I++)  {
        	b10 = diners/10;
            System.out.println(b10 + " billets de 10€");
            diners = diners%10;
        }
        for (I=6;diners>=5;I++)  {
        	b5 = diners/5;
            System.out.println(b5 + " billets de 5€");
            diners = diners%5;
        }
        for (I=7;diners>=2;I++)  {
        	m2 = diners/2;
            System.out.println(m2 + " monedes de 2€");
            diners = diners%2;
        }
        for (I=8;diners>=1;I++)  {
        	m1 = diners/1;
            System.out.println(m1 + " monedes de €");
            diners = diners%1;
        }
    
    }
}
 
 
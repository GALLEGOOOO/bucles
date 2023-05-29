import java.util.Scanner;
public class ACT32 {
	
	public static void main(String[] ar) {
		
        double diners;
        double b500;
        double b200;
        double b100;
        double b50;
        double b20;
        double b10;
        double b5;
        double m2;
        double m1;
        double c50;
        double c20;
        double c10;
        double c5;
        double c1;
        int I;
        
        Scanner billets = new Scanner(System.in);
        diners = billets.nextDouble();
        
        System.out.println(diners + "€ equivalen a:");
        
        for (I=0;diners>=500;I++) {
        	b500 = Math.floor(diners/500);
        	System.out.println(b500 + " billets de 500€");
        	diners = diners%500;
        }
        for (I=1;diners>=200;I++) {
        	b200 = Math.floor(diners/200);
        	System.out.println(b200 + " billets de 200€");
        	diners = diners%200;
        }
        for (I=2;diners>=300;I++) {
        	b100 = Math.floor(diners/100);
        	System.out.println(b100 + " billets de 100€");
        	diners = diners%100;
        }
        for (I=3;diners>=50;I++) {
        	b50 = Math.floor(diners/50);
        	System.out.println(b50 + " billets de 50€");
        	diners = diners%50;
        }
        for (I=4;diners>=20;I++) {
        	b20 = Math.floor(diners/20);
        	System.out.println(b20 + " billets de 20€");
        	diners = diners%20;
        }
        for (I=5;diners>=10;I++) {
        	b10 = Math.floor(diners/10);
        	System.out.println(b10 + " billets de 10€");
        	diners = diners%10;
        }
        for (I=6;diners>=5;I++) {
        	b5 = Math.floor(diners/500);
        	System.out.println(b5 + " billets de 5€");
        	diners = diners%5;
        }
        for (I=7;diners>=2;I++) {
        	m2 = Math.floor(diners/2);
        	System.out.println(m2 + " monedes de 2€");
        	diners = diners%2;
        }
        for (I=8;diners>=1;I++) {
        	m1 = Math.floor(diners/1);
        	System.out.println(m1 + " monedes de 1€");
        	diners = diners%1;
        }
        for (I=9;diners>=0.5;I++) {
        	c50 = Math.floor(diners/0.5);
        	System.out.println(c50 + " monedes de 50 centims");
        	diners = diners%0.5;
        }
        for (I=10;diners>=0.2;I++) {
        	c20 = Math.floor(diners/0.2);
        	System.out.println(c20 + " monedes de 20 centims");
        	diners = diners%0.2;
        }
        for (I=11;diners>=0.1;I++) {
        	c10 = Math.floor(diners/0.1);
        	System.out.println(c10 + " monedes de 10 centims");
        	diners = diners%0.1;
        }
        for (I=12;diners>=0.05;I++) {
        	c5 = Math.floor(diners/0.05);
        	System.out.println(c5 + " monedes de 5 centims");
        	diners = diners%0.05;
        }
        for (I=13;diners>=0.01;I++) {
        	c1 = Math.floor(diners/0.01);
        	System.out.println(c1 + " monedes de 1 centims");
        	diners = diners%0.01;
        }
        
    }

}

 
 
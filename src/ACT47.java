import java.util.Scanner;
public class ACT47 {
	
	public static void main(String[] args) {
		
		int numero;
        int x =2;
        
        Scanner primo = new Scanner(System.in);
        
        numero = primo.nextInt();
        
        boolean flag = false;
        while (x<numero/2) {
            if(numero%x==0) {
                flag = true;
                break;
            }
            x++;
        }
        if (!flag) {
            System.out.println(numero + " es primo");
        }
        else {
            System.out.println(numero + " no es primo");
        }
    }
}
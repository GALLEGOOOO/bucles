import java.util.Scanner;
public class ACT29 {
	
	public static void main(String[] ar) {
		
        int a;
        int b;
        int c;

        System.out.println("for");
        for(a=1;a<=20;a++) 
        {
            System.out.println(a);
        }
        
        b = 0;
        System.out.println("while");
        while (b<=20) {
            System.out.println(b);
            b++;
        }
        c = 0;
        System.out.println("do while");
        do {
            System.out.println(b);
            c++;
        }while (c<=20);
    }

}
import java.util.Scanner;
public class ACT39 {
	
	public static void main(String[] ar) {
	    Scanner teclat = new Scanner(System.in);

		
		int num;
		num=teclat.nextInt();
		
		StringBuilder asteriskBuilder = new StringBuilder();

		for (int i = 0; i < num; ++i) {
		    asteriskBuilder.append("*");
		}
		System.out.println(asteriskBuilder);
		System.out.println(asteriskBuilder);
		System.out.println(asteriskBuilder);
		System.out.println(asteriskBuilder);
		System.out.println(asteriskBuilder);
	}
}



 
 
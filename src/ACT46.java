import java.util.Scanner;
public class ACT46 {
	
	 public static void main(String[] args) {
		 
	        String text;
	        String text_final;
	        int I;
	   
	        I = 0;
	        text_final = "";
	        
	        Scanner escribir = new Scanner(System.in);
	        text = escribir.nextLine();
	        
	        while (!text.matches("[*]")) {
	            if (text.equalsIgnoreCase("L")) {
	                if (text.equals("")) {
	                    text_final = text_final+"\s";
	                }
	                else {
	                    text_final = text_final+text;
	                }
	                text = escribir.nextLine();
	                if (text.equalsIgnoreCase("A")) {
	                    if (text.equals("")) {
	                        text_final = text_final+"\s";
	                    }
	                    else {
	                        text_final = text_final+text;
	                    }
	                    text = escribir.nextLine();
	                    if (text.equals("")) {
	                        I++;
	                    }
	                }
	                else {
	                    if (text.equals("")) {
	                        text_final = text_final+"\s";
	                    }
	                    else {
	                        text_final = text_final+text;
	                    }
	                    text = escribir.nextLine();
	                }
	            }
	            else {
	                if (text.equals("")) {
	                    text_final = text_final+"\s";
	                }
	                else {
	                    text_final = text_final+text;
	                }
	                text = escribir.nextLine();
	            }
	        }
	        System.out.println("En el texto " + "'" + text_final + "'" + " hay " + I + " palabras LA");

	    }

	}
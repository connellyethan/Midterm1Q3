package main;

import java.util.Objects;

import java.util.Scanner;

public class CreditCardCheck {

	public static boolean length_test(Long card_number){
		
		String card_num = Objects.toString(card_number, null);
		
		return card_num.length()>=13 &&  card_num.length()<=16;
		
	}
	
	public static boolean check_begin(Long card_number){
		
		String card_num = Objects.toString(card_number, null);
		
		return card_num.startsWith("37") || card_num.startsWith("4") || card_num.startsWith("5") || card_num.startsWith("6");
		
	}

	public static boolean number_check(Long card_number) {
		
		String card_num = Objects.toString(card_number, null);
		
		int sum = 0;
		
		boolean value = false;
		
		for (int i = card_num.length() - 1; i >= 0; i--) {
			
			int n = Integer.parseInt(card_num.substring(i, i + 1));
			
			if (value) {
				
				n *= 2;
				
				if (n > 9) {
					
					n = (n % 10) + 1;
				}
			}
			
			sum += n;
			
			value = !value;
			
		}
		
		return (sum%10 == 0 && length_test(card_number) && check_begin(card_number));
		
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number: ");
		
		Long card_number = input.nextLong();
		
		input.close();
		
		if(!check_begin(card_number)){
			
			System.out.println("INVALID: not from a valid company");
			
		}
		
		else if(check_begin(card_number) && !number_check(card_number)){
			
			System.out.println("INVALID: not a valid number");
			
		}
		
		else{
			
			System.out.println("Credit card has been validated.");
			
		}
		

	}

}

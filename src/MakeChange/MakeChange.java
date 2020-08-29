package MakeChange;

import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Please let me know how much the item you are purchasing costs?");
		System.out.print("$");
		double item=kb.nextDouble();
		System.out.println("");
		System.out.println("**********");
		System.out.printf("The item you have selected costs $%.2f. %n" , item);
		System.out.println("**********");
		System.out.println("");
		
		System.out.println("How much money are you paying me with?");
		System.out.print("$");
		double pay=kb.nextDouble();
		System.out.println("");
		System.out.println("**********");
		System.out.printf("You have given me $%.2f to pay with. %n" , pay);
		System.out.println("**********");
		System.out.println("");
		
		if (pay<item) {
			System.out.println("You have not provided enough to pay for this item.");
		}
		else if(pay==item) {
			System.out.println("Thank you for paying in exact change!");
		}
		else {
			System.out.println("Perfect! Let me get your change!");
			
			double total=(pay-item)*100;
			int change=(int)total;
		while (change>0) {
			if (change% 2000>=0) {
				int twenty = change/2000;
				System.out.printf(twenty+" Twenty dollar bills,");
				change=change-twenty;
			}
			if(change% 1000<=0) {
				int ten = change/1000;
				System.out.printf(ten+" Ten dollar bills,");
				change=change-ten;
			}
			if(change% 500>=0) {
				int five = change/500;
				System.out.printf(five+" Five dollar bills,");
				change=change-five;
			}
			if(change% 100>=0) {
				int one = change/100;
				System.out.printf(one+" Ten dollar bills,");
				change=change-one;
			}
			if(change% 25>=0) {
				int quarter = change/25;
				System.out.printf(quarter+" quarters,");
				change=change-quarter;
			}
			if(change% 10>=0) {
				int dime = change/10;
				System.out.printf(dime+" dimes,");
				change=change-dime;
			}
			if(change% 5>=0) {
				int nickle = change/5;
				System.out.printf(nickle+" nickles,");
				change=change-nickle;
			}
			if(change% 1>=0) {
				int penny = change/1;
				System.out.printf(penny+" pennies.");
				change=change-penny;
				break;
			}
			 
			
		}
			
	
		
		kb.close();
	}
		
}
}

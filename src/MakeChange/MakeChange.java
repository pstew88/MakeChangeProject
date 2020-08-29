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
			
			double change=pay-item;
		while (change>0) {
			if (change% 20==0) {
				double twenty = change/20;
				int twentyInt=(int)twenty;
				System.out.printf(twentyInt+"Twenty dollar bills,");
				change=change-(twenty*20);
				break;
			}
			 
			
		}
			
	
		
		kb.close();
	}
		
}
}

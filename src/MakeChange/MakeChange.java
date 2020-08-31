package MakeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean repeat = true;
		System.out.println("**********************************");
		System.out.println("** Welcome to Angi's Apothecary **");
		System.out.println("**********************************");

		menu();
		
		int menuChoice = kb.nextInt();
		while (repeat = true) {
		
		if (menuChoice == 1) {
			System.out.println("Please let me know how much the item you are purchasing costs?");
			System.out.print("$");
			double item = kb.nextDouble();
			System.out.println("");
			System.out.println("**********");
			System.out.printf("The item you have selected costs $%.2f. %n", item);
			System.out.println("**********");
			System.out.println("");

			System.out.println("How much money are you paying with?");
			System.out.print("$");
			double pay = kb.nextDouble();
			System.out.println("");
			System.out.println("**********");
			System.out.printf("You have given me $%.2f to pay with. %n", pay);
			System.out.println("**********");
			System.out.println("");

			if (pay < item) {
				System.out.println("You have not provided enough to pay for this item.");
				menu();
				menuChoice=kb.nextInt();
			} else if (pay == item) {
				System.out.println("Thank you for paying in exact change!");
				menu();
				menuChoice=kb.nextInt();
			} else {
				System.out.println("Perfect! Let me get your change!");
				System.out.println("********************************");
				double total = ((pay - item) * 100) + .0001;
				int change = (int) total;

				while (change > 0) {
					if (change % 2000 >= 0) {
						int twenty = change / 2000;
						{
							if (twenty > 1) {
								System.out.print("|" + twenty + " Twenty dollar bills| ");
							} else if (twenty == 1) {
								System.out.print("|" + twenty + " Twenty dollar bill| ");
							}
						}
						change = change - twenty * 2000;
					}
					if (change % 1000 >= 0) {
						int ten = change / 1000;
						{

							if (ten > 1) {
								System.out.print("|" + ten + " Ten dollar bills|");
							} else if (ten == 1) {
								System.out.print("|" + ten + " Ten dollar bill|");
							}
							change = change - ten * 1000;
						}
						if (change % 500 >= 0) {
							int five = change / 500;
							if (five > 1) {
								System.out.print("|" + five + " Five dollar bills|");
							} else if (five == 1) {
								System.out.print("|" + five + " Five dollar bill|");
							}
							change = change - five * 500;
						}
						if (change % 100 >= 0) {
							int one = change / 100;
							if (one > 1) {
								System.out.print("|" + one + " One dollar bills|");
							} else if (one == 1) {
								System.out.print("|" + one + " One dollar bill|");
							}
							change = change - one * 100;
						}
						if (change % 25 >= 0) {
							int quarter = change / 25;
							if (quarter > 1) {
								System.out.print("|" + quarter + " Quarters|");
							} else if (quarter == 1) {
								System.out.print("|" + quarter + " Quarter|");
							}
							change = change - quarter * 25;
						}
						if (change % 10 >= 0) {
							int dime = change / 10;
							if (dime > 1) {
								System.out.print("|" + dime + " Dimes|");
							} else if (dime == 1) {
								System.out.print("|" + dime + " Dime|");
							}
							change = change - dime * 10;
						}
						if (change % 5 >= 0) {
							int nickle = change / 5;
							if (nickle > 1) {
								System.out.print("|" + nickle + " Nickles|");
							} else if (nickle == 1) {
								System.out.print("|" + nickle + " Nickle|");
							}
							change = change - nickle * 5;
						}
						if (change % 1 <= 0) {
							int penny = change / 1;
							if (penny > 1) {
								System.out.print("|" + penny + " Pennies|");
							} else if (penny == 1) {
								System.out.print("|" + penny + " Penny|");
							}
							change = change - penny * 1;

						}
						}
					}
				System.out.println("");
				menu();
				menuChoice=kb.nextInt();
				}

			}
		else if (menuChoice == 2) {
			System.out.println("");
			System.out.println("(∩_∩)");
			System.out.println("");
			menu();
			menuChoice=kb.nextInt();
			
			
			
		
		}
		else if (menuChoice== 3) {
			System.out.println("");
			System.out.println("*****************");
			System.out.println("Have a Great Day!");
			System.out.println("*****************");
			break;
		}
		else {
			System.out.println("**************");
			System.out.println("Invalid Option");
			System.out.println("**************");
			menu();
			menuChoice=kb.nextInt();
		}
		}
		kb.close();
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("  ***********************");
		System.out.println("1 ****** Check Out ******");
		System.out.println("2 **** Make Me Smile ****");
		System.out.println("3 ********* Exit ********");
		System.out.println("  ***********************");
	}
}
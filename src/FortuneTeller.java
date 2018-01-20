import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// Part 1: User Input.

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Hi!\nWelcome to Dismal Fortunes Incorporated.\nDFI's patented projection algorithms will help you cross the infinite bridge to happiness one step at a time.\nWe'll need some information to get started.\n(Enter \'quit\' at any time.)\nNow, let's begin.");
		System.out.println();

		System.out.println("What is your first name?"); // first name input
		String firstName = input.nextLine();
		if (firstName.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		while (firstName.trim().equals("") ) {
			System.out.println("Sorry, empty strings aren't accepted as names.  We apologize to anyone named:");
			firstName = input.nextLine();
		}

		System.out.println("What is your last name?"); // last name input
		String lastName = input.nextLine();
		if (lastName.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		while (lastName.trim().equals("") ) {
			System.out.println("Sorry, empty strings aren't accepted as names.  We apologize to anyone named:");
			firstName = input.nextLine();
		}

		System.out.println();
		System.out.println(
				"Note: the next set of questions must be answered with 0 or positive integer numerals (e.g. \'4\', \'45\', \'68\').");
		System.out.println();

		System.out.println("How many years you've been alive?"); // age input
		String age = input.nextLine();
		if (age.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		while (!((age.contains("0") || age.contains("1") || age.contains("2")) || age.contains("3") || age.contains("4")
				|| age.contains("5") || age.contains("6") || age.contains("7") || age.contains("8")
				|| age.contains("9"))) {
			System.out.println("Please insert an integer numeral.  For example, \'15\', \'35\', \'47\'.");
			age = input.nextLine();
		}
		while (Integer.parseInt(age) < 0) {
			System.out.println("Please insert a positive integer numeral.  For example, \'15\', \'35\', \'47\'.");
			age = input.nextLine();
		}

		System.out.println("What month were you born in?(Note: only values 1 - 12 will be accepted.)");// birth month input
		String month = input.nextLine();
		if (month.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		while (Integer.parseInt(month) <= 0 || Integer.parseInt(month) >= 13) {
			System.out.println("Please input including or between 1 - 12.");
			month = input.nextLine();
		}
		while (!((month.contains("0") || month.contains("1") || month.contains("2")) || month.contains("3")
				|| month.contains("4") || month.contains("5") || month.contains("6") || month.contains("7")
				|| month.contains("8") || month.contains("9"))) {
			System.out.println("Please insert an integer numeral.  For example, \'15\', \'35\', \'47\'.");
			month = input.nextLine();
		}

		System.out.println("How many siblings do you have?");// siblings input
		String sib = input.nextLine();
		if (sib.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		while (!((sib.contains("0") || sib.contains("1") || sib.contains("2")) || sib.contains("3") || sib.contains("4")
				|| sib.contains("5") || sib.contains("6") || sib.contains("7") || sib.contains("8")
				|| sib.contains("9"))) {
			System.out.println("Please insert an integer numeral.  For example, \'15\', \'35\', \'47\'.");
			sib = input.nextLine();
		}
		while (Integer.parseInt(sib) < 0) {
			System.out.println("Please insert a positive integer numeral.  For example, \'15\', \'35\', \'47\'.");
			age = input.nextLine();
		}

		System.out.println(
				"Finally, what is your favorite ROYGBIV color?\n\n(Enter \'help\' for the list of ROYGBIV colors.)");// ROYGBIV
																														// input
		String color = input.nextLine();
		if (color.trim().equalsIgnoreCase("quit")) {
			System.exit(0);
		} else {
			while (color.contains("h")) { // attempting to account for user mistype; wouldn't work if a ROYGBIV
											// contained an 'h'.
				System.out.println();
				System.out.println(
						"The list of ROYGBIV colors is as follows:\n\nRed Orange Yellow Green Blue Indigo Violet\n\nPlease choose one of the above options.");
				color = input.nextLine();
			}
		}
		input.close();

		// Part 2: Calculating a Fortune

		int retirement; // calculating retirement age
		if (Integer.parseInt(age) % 2 == 0) {
			retirement = 12;
		} else {
			retirement = 14;
		}

		String vacation; // calculating vacation home location
		if (Integer.parseInt(sib) < 0) {
			vacation = "Gary IN";
		} else if (Integer.parseInt(sib) == 0) {
			vacation = "Pascagoula MS";
		} else if (Integer.parseInt(sib) == 1) {
			vacation = "Slidell LA";
		} else if (Integer.parseInt(sib) == 2) {
			vacation = "Pecos TX";
		} else {
			vacation = "Montgomery AL";
		}

		String transport; // calculating transport method
		if (color.trim().equalsIgnoreCase("red")) {
			transport = "the forgotten tears of history";
		} else if (color.trim().equalsIgnoreCase("orange")) {
			transport = "the fragmented memories of unrequited love";
		} else if (color.trim().equalsIgnoreCase("yellow")) {
			transport = "the buried remorse of adolescence";
		} else if (color.trim().equalsIgnoreCase("green")) {
			transport = "the floating angst of lost oppurtunities";
		} else if (color.trim().equalsIgnoreCase("blue")) {
			transport = "the tired acknowledgement of failure";
		} else if (color.trim().equalsIgnoreCase("indigo")) {
			transport = "the discomforts of staggering silence";
		} else if (color.trim().equalsIgnoreCase("green")) {
			transport = "the clammy realization of your true motivations";
		} else {
			transport = "the bleakness of an uncolored life.";//catches non-ROYGBIV values for the variable 'color'
		}

		double account; // calculating account balance
		if (0 < Integer.parseInt(month) && Integer.parseInt(month) < 5) {
			account = 2.33;
		} else if (4 < Integer.parseInt(month) && Integer.parseInt(month) < 9) {
			account = 2.39;
		} else if (9 < Integer.parseInt(month) && Integer.parseInt(month) < 13) {
			account = 2.41;
		} else {
			account = -1.97;
		}

		// Part 3: Fortune Projection Output
		System.out.println();
		System.out.println("DFI projects that your fortune will be as follows: ");
		System.out.println();
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with $" + account
				+ " in the bank, a vacation home in " + vacation + ", and live with " + transport + ".");
	}
}

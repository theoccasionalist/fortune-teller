import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// Part 1: ask the user for intimate information about themselves.
		Scanner input = new Scanner(System.in);

		System.out.println("Hi!\nWelcom to part one of the interigation.\nWhat is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How many years have you been alive?");
		int age = input.nextInt();

		System.out.println("In integer format, what month were you born in?");
		int month = input.nextInt();

		System.out.println("How many siblings do you have?");
		int sib = input.nextInt();
		input.next();

		System.out.println(
				"Finally, what is your favorite ROYGBIV color?\nEnter \'help\' for the list of ROYGBIV colors.");
		String color = input.nextLine();
		while (color.contains("h")) { // attempting to account for user mistype; wouldn't work if a ROYGBIv contained
										// an 'h'.
			System.out.println(
					"The list of ROYGBIV colors is as follows:\nRed\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet\n\nSee, ROYGBIV!\nPlease choose one of the above options.");
			color = input.nextLine();
		}
		input.close();

		// Part 2: Calculating a Fortune

	 if(age%2==0) //calculating retirement age
	{
		int retirement = 12;
	}else
	{
		int retirement = 14;
	}
	 
	 if (sib < 0) {//calculating vacation home location 
		 String vacation = "Gary, IN"; 
	 }else if (sib == 0) {
		 String vacation = "Pascagoula, MS";
	 }else if (sib == 1) {
		 String vacation = "Slidell, LA";
	 }else if (sib == 2) {
		 String vacation = "Pecos, TX";		 
	 }else {
		 String vacation = "Montgomery, AL";
	 }
	 
	 if (color.trim().equalsIgnoreCase("red")) {
		 String transport = "Hybrid Hippo-Duck";
	 }else if (color.trim().equalsIgnoreCase("orange")) {
		 String transport =  "Nappy, dirty dog";
	 }else if (color.trim().equalsIgnoreCase("yellow")) {
		 String transport = "Steven's high-tech water bottle";
	 }else if (color.trim().equalsIgnoreCase("green")) {
		 String transport = "That one friend's bootleg car...you know, that ONE friend's car";
	 }else if(color.trim().equalsIgnoreCase("blue")) {
		 String transport = "A house pig";
	 }else if(color.trim().equalsIgnoreCase("indigo")) {
		 String transport = "The mean average of your childhood and adulthood.";
	 }else if(color.trim().equalsIgnoreCase("violet")) {
		 String transport = "That monkey from Indiana Jones and the Temple of Doom.";
	 }
	 
	 if (0 < month && month <5) {
		 double account = 2.33;
	 }else if(4 < month && month < 9) {
		 double account = 2.39;
	 }else if(9 < month && month < 13) {
		 double account = 2.41;
	 }else {
		 double account = 0.0;
	 }
	}
}

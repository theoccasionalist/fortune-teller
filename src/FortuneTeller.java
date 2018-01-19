import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// Part 1: ask the user for intimate information about themselves.
		Scanner input = new Scanner(System.in);

		System.out.println("Hi!\nWelcome to the interigation.\nWhat is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How many years have you been alive?");
		int age = input.nextInt();

		System.out.println("In integer format, what month were you born in?");
		int month = input.nextInt();

		System.out.println("How many siblings do you have?");
		int sib = input.nextInt();
		input.nextLine();

		System.out.println(
				"Finally, what is your favorite ROYGBIV color?\nEnter \'help\' for the list of ROYGBIV colors.");
		String color = input.nextLine();
		while (color.contains("h")) { // attempting to account for user mistype; wouldn't work if a ROYGBIv contained
										// an 'h'.
			System.out.println(
					"The list of ROYGBIV colors is as follows:\n Red Orange Yellow Green Blue Indigo Violet\n\nSee, ROYGBIV!\nPlease choose one of the above options.");
			color = input.nextLine();
		}
		input.close();

		// Part 2: Calculating a Fortune
	
	int retirement;
	 if(age%2==0) //calculating retirement age
	{
		retirement = 12;
	}else
	{
		retirement = 14;
	}
	 
	 String vacation;
	 if (sib < 0) {//calculating vacation home location 
		 vacation = "Gary IN"; 
	 }else if (sib == 0) {
		 vacation = "Pascagoula MS";
	 }else if (sib == 1) {
		 vacation = "Slidell LA";
	 }else if (sib == 2) {
		 vacation = "Pecos TX";		 
	 }else {
		 vacation = "Montgomery AL";
	 }
	 
	 String transport;
	 if (color.trim().equalsIgnoreCase("red")) {
		 transport = "hybrid Hippo-Duck";
	 }else if (color.trim().equalsIgnoreCase("orange")) {
		 transport =  "nappy, dirty dog";
	 }else if (color.trim().equalsIgnoreCase("yellow")) {
		 transport = "steven's high-tech water bottle";
	 }else if (color.trim().equalsIgnoreCase("green")) {
		 transport = "that one friend's bootleg car...you know, that ONE friend's car";
	 }else if(color.trim().equalsIgnoreCase("blue")) {
		 transport = "a house pig";
	 }else if(color.trim().equalsIgnoreCase("indigo")) {
		 transport = "the physical manifestation of your childhood.";
	 }else {
		 transport = "that monkey from Indiana Jones and the Temple of Doom.";
	 }
	 
	 double account;
	 if (0 < month && month <5) {
		 account = 2.33;
	 }else if(4 < month && month < 9) {
		 account = 2.39;
	 }else if(9 < month && month < 13) {
		 account = 2.41;
	 }else {
		 account = 0.0;
	 }
	 //Part 3: Fortune Projecting
	 System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with $" + account + " in the bank, a vacation home in " + vacation + ", and travel by " + transport + ".");
	}
}

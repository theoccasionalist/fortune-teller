import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// Part 1: User Input.
		
		Scanner input = new Scanner(System.in);

		System.out.println("Hi!\nWelcome to Dismal Fortunes Incorporated.\nDFI's patented projection algorithms will help you cross the infinite bridge to happiness one step at a time.\nWe'll need some information to get started.\n(Enter \'quit\' if at any time you feel the need to leave.)\nNow, let's begin.");
		System.out.println(); 
		
		System.out.println("What is your first name?"); //first name input
		String firstName = input.nextLine();
		if (firstName.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		}

		System.out.println("What is your last name?"); //last name input
		String lastName = input.nextLine();
		if (lastName.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		}

		System.out.println("How many years have you been alive?"); //age input
		String age = input.nextLine();
		if(age.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		} 
			
		System.out.println("In integer format, what month were you born in?");//birth month input
		String month = input.nextLine();
		if(month.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		}

		System.out.println("How many siblings do you have?");//siblings input
		String sib = input.nextLine();
		if(sib.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		} 

		System.out.println("Finally, what is your favorite ROYGBIV color?\nEnter \'help\' for the list of ROYGBIV colors.");//ROYGBIV input
		String color = input.nextLine();
		if(color.trim().equalsIgnoreCase("quit")){
			System.exit(0);
		} else { 
			while (color.contains("h")) { // attempting to account for user mistype; wouldn't work if a ROYGBIV contained an 'h'.
			System.out.println("The list of ROYGBIV colors is as follows:\n\nRed Orange Yellow Green Blue Indigo Violet\nPlease choose one of the options.");
			color = input.nextLine();
			}
		}	
		input.close();

		// Part 2: Calculating a Fortune
	
		int retirement; //calculating retirement age
		if(Integer.parseInt(age)%2==0)
		{
			retirement = 12;
		}else {
			retirement = 14;
		}
	 
		String vacation; //calculating vacation home location
		if (Integer.parseInt(sib) < 0) { 
			vacation = "Gary IN"; 
		}else if (Integer.parseInt(sib) == 0) {
			vacation = "Pascagoula MS";
		}else if (Integer.parseInt(sib) == 1) {
			vacation = "Slidell LA";
		}else if (Integer.parseInt(sib) == 2) {
			vacation = "Pecos TX";		 
		}else {
			vacation = "Montgomery AL";
		}
	 
		String transport; //calculating transport method
		if (color.trim().equalsIgnoreCase("red")) {
			transport = "hybrid hippo-duck";
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
	 
		double account; //calculating account balance
		if (0 < Integer.parseInt(month) && Integer.parseInt(month) <5) {
			account = 2.33;
		}else if(4 < Integer.parseInt(month) && Integer.parseInt(month) < 9) {
			account = 2.39;
		}else if(9 < Integer.parseInt(month) && Integer.parseInt(month) < 13) {
			account = 2.41;
		}else {
			account = 0.0;
		}
	 //Part 3: Fortune Projection Output
		System.out.println();
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with $" + account + " in the bank, a vacation home in " + vacation + ", and travel by " + transport + ".");
		}
	}

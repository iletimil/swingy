package view;

import models.Hunter;

public class ConsoleView {
	
	public static void printWelcome()
	{
		System.out.println("Welcome");
		System.out.println("Choose an option");
		System.out.println("1) Create a new Hero");
		System.out.println("2) Select a a former Hero");
		System.out.println("3) Run scarred - Exit");
	}
	
	public static void printHeroClasses()
	{
		Hunter hunter = new Hunter();
		
		System.out.printf("%s\n", "         Choose Your Class");
		System.out.println("|-----------------------------------------------|");
	}
}

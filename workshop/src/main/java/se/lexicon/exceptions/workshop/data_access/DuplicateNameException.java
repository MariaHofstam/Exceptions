package se.lexicon.exceptions.workshop.data_access;

public class DuplicateNameException extends Exception{

		public static void printMessage() {
			System.out.println("This name already exist in the list.");
		}
}

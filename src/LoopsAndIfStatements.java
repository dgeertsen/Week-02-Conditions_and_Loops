import java.util.Scanner;

public class LoopsAndIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input, uses the Scanner Object;
		// Scanner Object
		// accepting integers
		/*
		 * System.out.println("What is your age?"); int age = Integer.parseInt(
		 * kb.nextLine() );//parsing System.out.println("Oh, you are " + age +
		 * " years old.\n\n");
		 * 
		 * 
		 * //accepting doubles System.out.println("What is your GPA?"); double gpa =
		 * Double.parseDouble( kb.nextLine() ); System.out.println("Wow, " + gpa +
		 * " is very good.");
		 * 
		 * //accepting words, SINGLE System.out.println("What is your first name?");
		 * String fn = kb.next(); System.out.println("What is your last name?"); String
		 * ln = kb.next(); System.out.println("Hello " + fn + " "+ ln);
		 * 
		 * 
		 * 
		 * //accepting words, Multiple words
		 * System.out.println("What city do you live in?"); String city = kb.nextLine();
		 * 
		 * System.out.println(city);
		 */
		//worlds worse guessing game
		//Scanner Object
		Scanner kb = new Scanner(System.in);
		//worlds worst Guessing Game
		int rand = (int)(Math.random() * 10 + 1 );
		
		//World Worst Guessing Game
		System.out.println(rand);
		System.out.println("Guess my number 1 - 10. you have unlimited tries");
		boolean run = true;
		while(run) {
			int num = kb.nextInt();
			
			//the if statement
			if( num > rand) {
				System.out.println("too high!! Guess Again!");
			}
			else if(num < rand) {
				System.out.println("too low. Guess Again!");
			}
			else{
				System.out.println("GOT IT!!");
				run = false;
			}
		
		}
		


	}

}

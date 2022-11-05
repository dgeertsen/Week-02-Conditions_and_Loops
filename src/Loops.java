
public class Loops {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Loops. Know how many times you need to iterate
		//for(int i = 0; i <10;i++) {
		//	System.out.println(i);
		//	//i++ happens post iteration(after code executes)
		//}	
		//print even numbers 0 to 10
		for(int i = 500; i<=100;i++) {
			if(i%2==0) {
			System.out.println(i);
			//i++ happens post iteration(after code executes)
			}
		}	
		//while loop. iterate till condition is met.
		//condition checked at start
		//Don't know how much to run
		int x=10;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		//Do While Loop
		//Will run at least once
		//Checks condition at end.
		do
		{
			System.out.println(x);
			x++;
		}while(x<2); 		
	}

}

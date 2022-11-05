
public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if & else
		int age = 14;
		if (age >=16)
		{
			System.out.println("You can drive");
			
		}
		else
		{
			System.out.println("Please wait " + (16-age) + " years.");
		}
		//else if
		double costOfMilk =1.5;
		if(costOfMilk <=2)
		{
			System.out.println("Buying 2");
		
		}
		else if(costOfMilk <=3)
		{
			System.out.println("Buying 1");
		
		}
		else 
		{
			System.out.println("No milk for you!!!");
		
		}		
		//Switch Case
		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");	
			break;
		case 'C':
			System.out.println("70%");
			break;
		default:
			System.out.println("0%");
		}
		//Nested
		if(5==5) {
			if(4==4) {
				System.out.println("yes");
			}
				
		}
		//flatten above statement
		if(5==5 && 4==4)
		{
			System.out.println("yes");
		}
		
	}	
	
	

}

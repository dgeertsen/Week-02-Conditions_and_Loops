
public class Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a variable named age and assign it a value of 14.
		int age =14;
		
		//print the boolean expression age >=16 and print results.
		//Change age to 18 and run it again.
		System.out.println(age>=16);
		age =18;
		System.out.println(age>=16);
		
		//Using a conditional, print  "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise.
		//Change the value of age and rerun to see result
		boolean hasLicense = false;
		if(age >=16 && hasLicense){
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive.");
		}
		
		//Add a new variable has licneseBefore the conditional.
		//Change the boolean expression to accept the conditional to additionally include the need for hasLicense to be true
		//Try changing the values of age and HasLiocense and note the difference.
		//See above.
		
		//Create two new variables - costOFMilk & thirstLevel
		//Create a new conditional that prints "Milk Please", if costOFMilk < 2.50
		//or if thirstL:evel ? 6 and and prints "No Thanks", otherwise
		//Change the values and note different results
		double costOfMilk = 1.50;
		int thirstLevel = 1;
		if(costOfMilk < 2.50||thirstLevel > 6){
			System.out.println("Milk Please");
		}
		else {
			System.out.println("No Thanks");
		}
	
		//Create two new variables called numberOfCooklies & numberOfChilderen
		//you will evenly  the cookies to the children and keep the remaining
		//numberOfCooklies = 0: "Sad Face"
		//numberOfCooklies < 2: "Yes!"
		//numberOfCooklies < 5: "Woohoo!"
		//numberOfCooklies >= 5: "Jackpot!"
		int numberOfCookies = 20;
		int numberoChilderen =12;
		if(numberOfCookies%numberoChilderen>=5) {
			System.out.println("Jackpot!");
		} else if(numberOfCookies%numberoChilderen>=2) {
			System.out.println("Woohoo!");
		} else if(numberOfCookies%numberoChilderen==1) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		

		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loylatyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		System.out.println(loyaltyMemberStatus);
		switch (loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberDiscount = .10;
					break;
				case "GOLD":
					loyaltyMemberDiscount = .15;
					break;
				case "PLATINUM":
					loyaltyMemberDiscount = .15;
					break;
				default:
					break;		
		}
		System.out.println(loyaltyMemberDiscount);
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM		
		double billTotal = 640.50;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500 && loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
		} 
		else if (adjustedTotal > 500 &&loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";			
			}
		System.out.println(loyaltyMemberStatus);
		
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//otherwise, print "access denied"
		String username= "Tommy123";
		String password = "12345";
		if(username.equals("Tommy123") && password.equals("12345")) {
		}
		else {
			System.out.println("Invalid login, please try again.");
		}
		

		//write a for loop that prints each number from 0 to 9
		for(int i = 0; i<10;i++) {
			System.out.println(i);
		}
		//write a for loop that prints each number from 10 to 0 backwards
		for(int i = 10; i>=0;i--) {
			System.out.println(i);
		}		
		//write a for loop that prints every other number from 0 to 100
		for(int i = 0; i<=100;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		
		
		
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for(int i = 0; i<=100;i++) {
			if(i%2==0) {
			System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		int x = 100;
		while(x > 0) {
			System.out.println(x + " "+ x%3);
			x--;
		}
	}

}

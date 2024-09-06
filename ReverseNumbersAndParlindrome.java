import java.util.Scanner;

public class ReverseNumberToParlindrome{

   public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a four integer: ");
	int userInput = sc.nextInt();
	int reversedNumber = reverse(userInput);

	System.out.println(userInput == reversedNumber ? "true" : "false");
   }



	public static int reverse(int number) {
	
	int reverse = 0;
		
		while(number != 0){

		   reverse = (reverse * 10) + number % 10;

		   number = number / 10;

		} return reverse;
	} 
}



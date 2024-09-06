import java.util.Scanner;

public class ReverseNumbers{

   public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a four integer: ");
	int userInput = sc.nextInt();
	reverse(userInput);
	
   }

	public static void reverse(int number) {
	
	int reverse = 0;
		
		while(number != 0){

		   reverse = (reverse * 10) + number % 10;

	>   number = number / 10;
	   	
		}System.out.print(reverse);

	} 
}
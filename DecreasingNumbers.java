import java.util.Scanner;

public class DecreasingNumbers{

   public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first integers: ");
	int firstNumber = sc.nextInt();

	System.out.print("Enter second integers: ");
	int secondNumber = sc.nextInt();

	System.out.print("Enter third integers: ");
	int thirdNumber = sc.nextInt();

	System.out.println(displaySortedNumbers(smallestNumber +  middleNumber +  highestNumber));
   }


   public static int displaySortedNumbers(int firstNumber, int secondNumber, int thirdNumber){

	int highestNumber = firstNumber;

	if(secondNumber > highestNumber){
	   highestNumber = secondNumber;
	}

	if(thirdNumber > highestNumber){
	   highestNumber = thirdNumber;
	}


	int smallestNumber = firstNumber;

	if(secondNumber < smallestNumber){
	   smallestNumber = secondNumber;
	}

	if(thirdNumber < smallestNumber){
	   smallestNumber = thirdNumber;
	}

	
	int sum = firstNumber + secondNumber + thirdNumber;

	int middleNumber = sum - (firstNumber + thirdNumber);

	return highestNumber + middleNumber + smallestNumber;
   } 



}

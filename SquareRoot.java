import java.util.Scanner;

public class SquareRoot{

  public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a positive double number: ");
	double userInput = sc.nextDouble(); 
	isSquareRoot(userInput);

	System.out.println(isSquareRoot(userInput));
}


	public static double isSquareRoot(double number){

		double squareRoot = Math.sqrt(number);

		return squareRoot;
	}

}
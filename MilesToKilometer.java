import java.util.Scanner;

public class MilesToKilometer{

   public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Kilometers: ");
	int userInput = sc.nextInt();
	kilometerToMiles(userInput);
	System.out.println(kilometerToMiles(userInput) + " Miles");

	System.out.print("Enter Miles: ");
	int Miles = sc.nextInt();
	milesToKilometer(Miles);
	System.out.print(milesToKilometer(Miles) + " Kilometers");
   }




   public static double kilometerToMiles(double kilometer) {

	double convertionToMiles = kilometer * 0.62137119;
	return convertionToMiles;
   }


   
   public static double milesToKilometer(double mile) {

	double convertionToKilometer = mile * 1.609344;
	return convertionToKilometer;
   }

}	

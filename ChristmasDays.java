import java.util.Scanner;

public class ChristmasDays{

public static void main (String [] args){

   Scanner input = new Scanner(System.in);

	System.out.println("1: A Partridge in a Pear Tree");

	System.out.println("2: Two Turtle Doves");

	System.out.println("3: Three French Hens");

	System.out.println("4: Four Calling Birds");

	System.out.println("5: Five Golden Rings");

	System.out.println("6: Six Geese a-Laying");

	System.out.println("7: Seven Swans a-Swimming");

	System.out.println("8: Eight Maids a-Milking");

	System.out.println("9: Nine Ladies Dancing");

	System.out.println("10: Ten Lords a-Leaping");

	System.out.println("11: Eleven Pipers Piping");

	System.out.println("12: Twelve Drummers Drumming");

	System.out.println("Select Number: ");
   	int Day = input.nextInt();



	switch (Day) {

	case 1: 
		System.out.println("A Partridge in a Pear Tree.\nOn the first day of Christmas, my true love gave to me..."); break;
	
	case 2: 
		System.out.println("Two Turtle Doves.\nOn the second day of Christmas, my true love gave to me...\nTwo turtle doves, And a partridge in a pear tree...");break;

	case 3: 
		System.out.println("Three French Hens\nOn the third day of Christmas, my true love gave to me...\nThree French hens,Two turtle doves,And a partridge in a pear tree ...");break;
	 
	case 4: 
		System.out.println("Four Calling Birds\nOn the fourth day of Christmas, my true love gave to me...Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree...");break;

	case 5: 
		System.out.println("Five Golden Rings\nOn the fifth day of Christmas, my true love gave to me...\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;
	
	case 6: 
		System.out.println("Six Geese a-Laying\n6. Six Geese a-LayingOn the sixth day of Christmas,my true love gave to me...\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens\n,Two turtle doves,\nAnd a partridge in a pear tree...");break;

	case 7: 
		System.out.println("Seven Swans a-Swimming On the seventh day of Christmas, my true love gave to me...\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,nAnd a partridge in a pear tree...");break;
	
	case 8: 
		System.out.println("Eight Maids a-Milking\nOn the eighth day of Christmas, my true love gave to me...\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;

	case 9: 
		System.out.println("Nine Ladies Dancing\nNine Ladies Dancing\nOn the ninth day of Christmas, my true love gave to me...\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;
	
	case 10: 
		System.out.println("Ten Lords a-Leaping\nOn the tenth day of Christmas, my true love gave to me...\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;

	case 11: 
		System.out.println("Eleven Pipers Piping\nOn the eleventh day of Christmas, my true love gave to me...\nEleven pipers piping,\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;
	
	case 12: 
		System.out.println("Twelve Drummers Drumming\nOn the twelfth day of Christmas, my true love gave to me...\nTwelve drummers drumming,\nEleven pipers piping,\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");break;
   
     }
  }

}
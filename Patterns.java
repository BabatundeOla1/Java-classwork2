public class Patterns{

   public static void main(String...args){

	int row = 3;

	for(int count = 1; count <= row; count++){

		for(int space = 2 * (row - count); space >= 0; space--){
			System.out.print(" ");
		}	
			for(int counts = 1; counts <= count; counts++){
				System.out.print(counts + " ");
			}

	  	System.out.println();	
	}
   }

}

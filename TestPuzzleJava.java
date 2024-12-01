import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	        //..
		// Write your other test cases here.
		//..
		System.err.println(generator.getRandomLetter());
		System.out.println("your password is " + generator.generatePassword());
		System.out.println(generator.getNewPasswordSet(10));

		
		int [] table = {1,2,3,4,5,6,7,8,9,10};
		generator.shuffleArray(table);
		
	}
}

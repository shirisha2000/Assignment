package assignment;
import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String string = scanner.nextLine();
	    HashSet<Character> letters = new HashSet<>();
	    for (char character : string.toCharArray()) {
	      letters.add(character);
	    }
	    if (letters.size() == 26) {
	      System.out.println("The string is a pangram.");
	    } else {
	      System.out.println("The string is not a pangram.");
	    }
	  }
	}
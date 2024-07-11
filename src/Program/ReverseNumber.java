package Program;

public class ReverseNumber {
	  public static void main(String[] args) {
	    int num = 1234; // replace with any number

	    int reversedNum = 0;

	    while (num > 0) {
	      int digit = num % 10;
	      reversedNum = reversedNum * 10 + digit;
	      num = num / 10;
	    }

	    System.out.println("Reversed Number: " + reversedNum);
	  }
	}
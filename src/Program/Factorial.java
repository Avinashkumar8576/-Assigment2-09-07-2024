package Program;

public class Factorial {
	  public static void main(String[] args) {
	    int num = 5; // replace with any number
	    int factorial = 1;

	    for (int i = 1; i <= num; i++) {
	      factorial *= i;
	    }

	    System.out.println("Factorial of " + num + ": " + factorial);
	  }
	}
package Program;

public class Armstrong {
	  public static void main(String[] args) {
	    int num = 371; // replace with any number

	    int originalNum = num;
	    int sum = 0;
	    int n = String.valueOf(num).length();

	    while (num > 0) {
	      int digit = num % 10;
	      sum = sum + (int) Math.pow(digit, n);
	      num = num / 10;
	    }

	    if (originalNum == sum) {
	      System.out.println(originalNum + " is an Armstrong number");
	    } else {
	      System.out.println(originalNum + " is not an Armstrong number");
	    }
	  }
	}
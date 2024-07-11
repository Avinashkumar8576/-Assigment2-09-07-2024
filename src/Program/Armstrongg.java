package Program;

public class Armstrongg {
	  public static void main(String[] args) {
	    for (int i = 1; i <= 1000; i++) {
	      int originalNum = i;
	      int sum = 0;
	      int n = String.valueOf(i).length();

	      while (originalNum > 0) {
	        int digit = originalNum % 10;
	        sum = sum + (int) Math.pow(digit, n);
	        originalNum = originalNum / 10;
	      }

	      if (sum == i) {
	        System.out.println(i + " is an Armstrong number");
	      }
	    }
	  }
	}
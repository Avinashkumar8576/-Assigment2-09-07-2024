package Program;

public class Fibonacci {
	  public static void main(String[] args) {
	    int n = 10; // number of terms to print
	    int t1 = 0;
	    int t2 = 1;

	    System.out.print("Fibonacci Series: ");

	    for (int i = 1; i <= n; i++) {
	      System.out.print(t1 + " ");

	      int sum = t1 + t2;
	      t1 = t2;
	      t2 = sum;
	    }
	  }
	}

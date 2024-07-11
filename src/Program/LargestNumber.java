package Program;

public class LargestNumber {
	
	public static void main(String[]args) {
		
		int num1 =400, num2 =300, num3 =40;
		
		if(num1>num2 && num1>num3) {
			
			System.out.println(num1+"it is a largest number");
		}
		if (num2>num1 && num2>num3) {
			
			System.out.println(num2+"it is a largest number");	
		}
		else if (num3>num1 && num3>num2) {
			
			System.out.println(num3+"it is a largest number");
		}
	}

}

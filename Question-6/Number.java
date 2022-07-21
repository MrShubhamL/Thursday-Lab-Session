public class Number {
	public static void main(String[] args) {
		int i = 123654654;
		System.out.println("Number is: " + i);
		if ((i >> 31) == 0) {
			System.out.println("Given Number is 'Positive'");
		} else {
			System.out.println("Given Number is 'Negative'");
		}
	}
}

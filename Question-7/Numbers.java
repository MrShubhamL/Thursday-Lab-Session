
public class Numbers {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i + " - Deep (Multiple of 3)");
			}
			if(i%5==0) {
				System.out.println(i + " - Tech (Multiple of 5)");
			}
			if(i%3==0 && i%5==0) {
				System.out.println(i + " - DeepTech (Multiple of 3 & 5)");
			}
			else {
				System.out.println(i);
			}
			
		}

	}

}


public class Numbers {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i + " - Deep");
			}
			if(i%5==0) {
				System.out.println(i + " - Tech");
			}
			if(i%3==0 && i%5==0) {
				System.out.println(i + " - DeepTech");
			}
			else {
				System.out.println(i);
			}
			
		}

	}

}

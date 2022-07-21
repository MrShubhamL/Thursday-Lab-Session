public class Numbers {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.println("Deep");
			}
			if(i%5==0) {
				System.out.println("Tech");
			}
			if(i%2==0 && i%5==0) {
				System.out.println("DeepTech");
			}
		}

	}

}

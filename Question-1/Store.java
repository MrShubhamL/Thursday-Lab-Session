public class Store {
	public static void main(String[] args) {
		String customerName = "Paul";
		String brand = "idol";	// Brand Name
		double processor = 2.66;	// Processor Speed
		byte ram = 8;	// RAM Size
		short hardDisk = 500; // Hard Disk Size
		byte monitor = 15;	// Monitor Size (inch)
		char planA = 'A';	// plans
		char planB = 'B';	// plans
		char planC = 'C';	// plans
		char planD = 'D';	// plans
		
		System.out.println("Customer Name: " + customerName);
		System.out.println("Brand Name: " + brand);
		System.out.println("Processor Speed: " + processor + "GHz");
		System.out.println("Ram Capacity: " + ram + "GB");
		System.out.println("Hard Disk: " + hardDisk + "GB");
		System.out.println("Monitor Size: " + monitor + "inch");
		System.out.println("Plans: " + planA +","+ planB+"," + planC+","+ planD);
	}

}

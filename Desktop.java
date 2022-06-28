package week3.Day1.assisgnment.org.system;

public class Desktop extends Computer {

	public void desktopsize() {	}
	public static void main(String[] args) {
		
		Desktop size = new Desktop();
		size.desktopsize();
		double b = 16.1; 		
		System.out.println("The Desktop Size is : " + b);
		size.computermodel();
		System.out.println("The Computer Model is : " + size.computermodel());
		
	}
}
package acharya.com;

public class PrintAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 21;
		if (age > 0 && age <= 12) {
			System.out.println("Kid");
		} else if (age > 12 && age <= 19) {
			System.out.println("Teenager");
		} else if (age > 19 && age <= 40) {
			System.out.println("Youngsters");
		} else if (age > 40 && age <= 55) {
			System.out.println("aged man");
		} else if (age > 55 && age <= 70) {
			System.out.println("old man");
		}

	}

}

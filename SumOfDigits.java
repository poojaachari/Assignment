package acharya.com;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given_num = 1234;
		int sum = 0;
		while (given_num > 0) {
			sum += given_num % 10;
			given_num /= 10;
		}
		System.out.println("Sum is " + sum);

	}

}

package acharya.com;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 2, 3 };

		if (arr.length >= 1 && (arr[0] == 6 || arr[arr.length - 1] == 6)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

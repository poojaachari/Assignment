package acharya.com;

public class Array123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 3, 1 };
		boolean found = false;

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
				found = true;
				break;
			}
		}
		System.out.println(found);

	}

}

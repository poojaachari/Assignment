package Assignment;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element to search");
	
		int arr[]= {10,20,40,50,60,70,80,90};
	
		arr = new int[10];
		boolean found=false;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			found=true;
			break;
		}

		if(found) 
			System.out.println("It is in Array");
		else
			System.out.println("It is not in Array");
		
	}

}


import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Count :  ");
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student marks  :  "+(i+1));
			arr[i] =sc.nextInt();
			
			
		}System.out.println("--------------");
		for(int i=0 ;i<n;i++){
			System.out.println("The marks of student number: "+(i+1)+"  is  "+arr[i]);
		}
	}

}

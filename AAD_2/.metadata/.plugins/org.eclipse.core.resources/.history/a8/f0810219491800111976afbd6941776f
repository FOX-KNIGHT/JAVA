package AAD_1.Experiment_4;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		int[] arr= {15,7,22,9,18,4};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element to be found:");
		int k=sc.nextInt();
		for (int i=0; i<arr.length;i++) {
			for (int j=i; j<arr.length-1;j++) {
				if(arr[i]>arr[j+1]) {
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(k==i) {
				System.out.println("THE "+k+"th smallest element:"+ arr[i-1]);
			}
		}
	}
}
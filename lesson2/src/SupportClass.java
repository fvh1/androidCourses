import java.util.Arrays;
import java.util.Scanner;


public class SupportClass {
	//Manual input of integer array
	public static int[] input (int length){
		int [] arr=new int [length];
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<length;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
	//Selection sort
	public static int[] sort1 (int arr []){
		for (int i=0; i<arr.length; i++){
			//Min element 
			int min=arr[i];
			//Min element position
			int minPosition=i;
			for(int j=i+1; j<arr.length;j++){
				if (min>arr[j]){
					min=arr[j];
					minPosition=j;
				}
			}
			//Set min element of sub-array
			arr[minPosition]=arr[i];
			arr[i]=min;
		}
		return arr;
	}
	//Bubble sort
	public static int[] sort2 (int arr []){
		for (int i=0; i<arr.length;i++){
			for (int j=1;j<arr.length-i;j++){
				if (arr[j]<arr[j-1]){
					int bufer=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=bufer;
				}
			}
		}
		return arr;
	}
	//Lazy's sort
	public static int[] sort3 (int arr []){
		Arrays.sort(arr);
		return arr;
	}
	//Output
	public static void output (int arr[]){
		for (int i=0;i<arr.length;i++){
			System.out.print("\""+Integer.toString(arr[i])+("\"|"));
		}
		System.out.println();
	}
}

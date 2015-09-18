
public class SupportClass {
	public static int [][] input (int n){
		int [][] arr=new int [n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				arr[i][j]=(int)(Math.random()*100);
				
			}
			
		}
		return arr;
	}
	public static int [][] input (int n, int m){
		int [][] arr=new int [n][m];
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				arr[i][j]=(int)(Math.random()*100);
				
			}
			
		}
		return arr;
	}
	public static void output (int arr[][]){
		int n=arr.length;
		int m=arr[0].length;
		
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				System.out.print(Integer.toString(arr[i][j]).concat(" "));
				
			}
			System.out.println();
		}
		
	}
}

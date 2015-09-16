import java.util.Arrays;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1
		System.out.println("Task1");
			float [] array1= {1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.7f, 1.8f, 1.9f, 1.0f};
			double sum=0;
			//Why it doesn't work with float?
			for(float a:array1){
				System.out.print('"');
				System.out.print(a);
				System.out.print("\"|");
				sum+=a;
			}
			System.out.println();
			System.out.println("average value =  \""+Double.toString(sum/array1.length)+'"');
		//#2
			System.out.println("Task2");
			String katerina="Я говорю, отчего люди не летают так, как птицы? Знаешь, мне иногда кажется, что я птица. Когда стоишь на горе, так тебя и тянет лететь. Вот так бы разбежалась, подняла руки и полетела. Попробовать нешто теперь?";
			System.out.println(katerina.substring(0, katerina.length()/2));
			//katerina.length()/2- int. 7/3=2, but 7.0/3=2.3(3)
			System.out.println(katerina.substring(katerina.length()/2));
		//#3
			System.out.println("Task3");
			//Random int array
			int[] array2= new int [10];
			array2[0]=(int)(Math.random()*100);
			System.out.print(Integer.toString(array2[0]));
			int min=array2[0];
			int max=array2[0];
			for (int i=1;i<10;i++){
				array2[i]=(int)(Math.random()*100);
				//Array contains:
				System.out.print(", "+Integer.toString(array2[i]));
				//Max element search
				if (array2[i]>max){
					max=array2[i];
				}
				//Min element search
				if (array2[i]<min){
					min=array2[i];
				}
			}
			System.out.println();
			System.out.println("min value =  \""+Integer.toString(min)+'"');
			System.out.println("max value =  \""+Integer.toString(max)+'"');
		//#4
			System.out.println("Task4\nArray:");
			//Random int array
			int[] array3= new int [10];
			for (int i=0;i<10;i++){
				array3[i]=(int)(Math.random()*100);
				//Array contains:
				System.out.print("\""+Integer.toString(array3[i])+"\"|");
			}
			System.out.println("\nSorted array:");
			//New sorted array creation
			int[] array4=array3;
			Arrays.sort(array4);
			for (int i=0;i<10;i++){
				System.out.print("\""+Integer.toString(array4[i])+"\"|");
			}
			System.out.println("\nEven elements:");
			//Even elements
			for (int i:array3){
				int i2=i/2;
				if (i2*2==i){
					System.out.print("\""+Integer.toString(i)+"\"|");
				}
			}
	}

}

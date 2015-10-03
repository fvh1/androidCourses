import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static ArrayList<String> inputArrayList(char breakSymbol){
		ArrayList<String> arrayList=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		while (true){
			String brs=""+breakSymbol;
			String nextWord=sc.next();
			if (nextWord.contains(brs)){
				arrayList.add(nextWord.substring(0,nextWord.indexOf(brs)));
				return arrayList;
			}
			arrayList.add(nextWord);
		}
	}
	public static ArrayList<String> repeatRemover(ArrayList<String> arrayList) {
		int i=0;
		while (i<arrayList.size()){
			String nextString=arrayList.get(i);
			int j=i+1;
			while (j<arrayList.size()){
				if (nextString.equals(arrayList.get(j))){
					arrayList.remove(j);
				}
				else{
					j++;
				}
			}
			i++;
		}
		return arrayList;
	}
	public static void fileIO(ArrayList<String> arrayList){
		File f = new File("f.txt");
		if(f.exists() && !f.isDirectory()) {
			f.delete();
		}
		try {
			f.createNewFile();
			PrintWriter out = new PrintWriter(f.getAbsoluteFile());
			for(String nextString:arrayList){
				out.write(nextString+'\n');
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader r=new BufferedReader(new FileReader( f.getAbsoluteFile()));
			String s;
			try {
				while((s=r.readLine())!=null){
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	public static String [] manInput(){
		Scanner sc=new Scanner(System.in);
		String[] st={sc.next(), sc.next(),sc.next()};
		return st;
	}
	public static HashMap <String,ArrayList<String[]>> setHashMap(){
		HashMap <String,ArrayList<String[]>> hashMap=new HashMap <String,ArrayList<String[]>>();
		System.out.println("Input men (first_name middle_name last_name):");
		ArrayList <String[]> men=new ArrayList <String[]>();
		while (true){
			men.add(manInput());
			System.out.println("One more? y/anything else");
			Scanner sc=new Scanner(System.in);
			if (!sc.next().equalsIgnoreCase("y")){
				break;
			}
		}
		hashMap.put("man", men);
		ArrayList <String[]> women=new ArrayList <String[]>();
		System.out.println("Input women (first_name middle_name last_name):");
		while (true){
			women.add(manInput());
			System.out.println("One more? y/anything else");
			Scanner sc=new Scanner(System.in);
			if (!sc.next().equalsIgnoreCase("y")){
				break;
			}
		}
		hashMap.put("woman", women);
		return hashMap;
	}
	public static void randomMan (HashMap <String,ArrayList<String[]>> lig){
		while (true){
			System.out.println("Man or woman?");
			Scanner sc=new Scanner(System.in);
			String sex=sc.next();
			if (sex.equalsIgnoreCase("man")||(sex.equalsIgnoreCase("woman"))){
				ArrayList <String []> arr=lig.get(sex.toLowerCase());
				int n=(int)(Math.random()*arr.size());
				String human[]=arr.get(n);
				System.out.println(human[0]+" "+human[1]+" "+human[2]);
				System.out.println("One more? y/anything else");
				if (!sc.next().equalsIgnoreCase("y")){
					break;
				}
			}
			
		} 
	}
	public static void main(String[] args) {
		fileIO(repeatRemover(inputArrayList('g')));
		//randomMan(setHashMap());
	}

}

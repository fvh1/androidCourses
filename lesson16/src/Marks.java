import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Marks {
	public void highlight(){
		File newFile=new File("src/1.txt");
		String result="";
		try {
			BufferedReader r=new BufferedReader(new FileReader( newFile.getAbsoluteFile()));
			String s;
			try {
				while((s=r.readLine())!=null){
					char c=s.charAt(s.length()-1);
					if(c=='7'||c=='8'||c=='9'){
						result+=s.toUpperCase()+"\n";
					}else{
						result+=s+"\n";
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		try {
			PrintWriter out;
			out = new PrintWriter(newFile.getAbsoluteFile());
			out.write(result);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

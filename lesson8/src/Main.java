import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	public static String  archive(String string){
		Pattern pattern=Pattern.compile("(.)(\\1)+");
		Matcher matcher=pattern.matcher(string);
		while (matcher.find()){
			string=string.substring(0,matcher.start()+1)+new Integer(matcher.end()-matcher.start()).toString()+string.substring(matcher.end());
			matcher=pattern.matcher(string);
			
		}
		return string;
	}
	public static boolean fileExtentionIsJsonOrXML (String fileName){
		Pattern pattern=Pattern.compile("\\.[^\\s.]+$");
		Matcher matcher=pattern.matcher(fileName);
		String extension="";
		if (matcher.find()){
			extension=fileName.substring(matcher.start()+1);
		}
		if (!extension.equals("")){
			System.out.println(extension);
		}else{
			System.out.println("There is no extension");
		}
		return extension.equalsIgnoreCase("xml")||extension.equalsIgnoreCase("json");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(archive("Ollllolo ololoo prileteeelo nloooOOO"));
		System.out.println(fileExtentionIsJsonOrXML("1.xml"));
		System.out.println(fileExtentionIsJsonOrXML("json.xml.txt"));
		System.out.println(fileExtentionIsJsonOrXML("ololo"));
		System.out.println(fileExtentionIsJsonOrXML("json.xml."));
		
	}

}

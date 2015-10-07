import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileSystem {
	final String delimiter="/";
	final String rootName="sandbox";
	private String path;
	public FileSystem(){
		File sandbox=new File(rootName);
		if(sandbox.exists()){
			if (!sandbox.isDirectory()){
				sandbox.delete();
				sandbox.mkdir();
			}
		}else{
			sandbox.mkdir();
		}
		this.path=rootName;
	}
	public void work(){
		System.out.println("Type help to get commands list");
		while(true){
			String [] newCommand=getNewCommand();
			if (newCommand[0].equalsIgnoreCase("quit")){
				break;
			}else if (newCommand[0].equalsIgnoreCase("help")){
				System.out.println("cd to change current folder");
				System.out.println("delete <name/path> to delete file/folder");
				System.out.println("file <name/path> to create new file");
				System.out.println("folder <name/path> to create new folder");
				System.out.println("ls to get list of files/folders");
				System.out.println("open <name/path> -a to add data to file");
				System.out.println("open <name/path> -r to read file");
				System.out.println("open <name/path> -rw to rewrite file");
				
				System.out.println("quit to quit");
			}else if(newCommand[0].equalsIgnoreCase("cd")){
				if(newCommand.length>1){
					this.changeDirectory(newCommand[1]);
				}else{
					System.out.println("Invalid cd command usage");
				}
			}else if(newCommand[0].equalsIgnoreCase("ls")){
				this.list();
			}else if(newCommand[0].equalsIgnoreCase("folder")){
				if(newCommand.length>1){
					this.newFolder(newCommand[1]);
				}else{
					System.out.println("Invalid folder command usage");
				}
			}else if(newCommand[0].equalsIgnoreCase("file")){
				if(newCommand.length>1){
					this.newFile(newCommand[1]);
				}else{
					System.out.println("Invalid file command usage");
				}
			}else if(newCommand[0].equalsIgnoreCase("delete")){
				if(newCommand.length>1){
					this.delete(newCommand[1]);
				}else{
					System.out.println("Invalid delete command usage");
				}
			}else if(newCommand[0].equalsIgnoreCase("open")){
				if(newCommand.length>2){
					if(newCommand[2].equalsIgnoreCase("-r")){
						this.readFile(newCommand[1]);
					}else if(newCommand[2].equalsIgnoreCase("-a")||newCommand[2].equalsIgnoreCase("-rw")){
						this.writeFile(newCommand[1],newCommand[2]);
					}else{
						System.out.println("Invalid -argument");
					}
				}else{
					System.out.println("Invalid delete command usage");
				}
			}
		}
	}
	private String[] getNewCommand(){
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		String[] input=sc.next().split(" ");
		return input;
	}
	private String updatePath(String newPath){
		if (newPath.startsWith(delimiter)){
			newPath=rootName+newPath;
		}else {
			newPath=this.path+delimiter+newPath;
		}
		return newPath;
	}
	private void changeDirectory(String newPath){
		newPath=updatePath(newPath);
		File newFolder=new File(newPath);
		if (newFolder.exists()&&newFolder.isDirectory()){
			this.path=newPath;
		}else {
			System.out.println("Folder '"+newPath+"'is not exists");
		}
	}
	private void newFolder(String newPath){
		newPath=updatePath(newPath);
		File newFolder=new File(newPath);
		if (!newFolder.exists()){
			newFolder.mkdir();
		}
	}
	private void newFile(String newPath){
		newPath=updatePath(newPath);
		File newFile=new File(newPath);
		if (!newFile.exists()){
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void delete(File file){
		if (file.exists()){
			if (file.isDirectory()){
				for (File f:file.listFiles()){
					delete(f);
				}
			}
			file.delete();
		}
	}
	private void delete(String newPath){
		newPath=updatePath(newPath);
		File newFile=new File(newPath);
		if (newFile.exists()){
			if (newFile.isDirectory()){
				for (File f:newFile.listFiles()){
					delete(f);
				}
			}
			newFile.delete();
		}
		File check= new File(this.path);
		if (!check.exists()){
			this.path=rootName;
		}
	}
	private void list(){
		File newFile=new File(this.path);
		for (File f: newFile.listFiles()){
			System.out.println(f.getName());
		}
	}
	private void readFile(String newPath){
		newPath=updatePath(newPath);
		File newFile=new File(newPath);
		try {
			BufferedReader r=new BufferedReader(new FileReader( newFile.getAbsoluteFile()));
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
	private void writeFile(String newPath, String arg){
		newPath=updatePath(newPath);
		File newFile=new File(newPath);
		Scanner sc=new Scanner (System.in);
		System.out.println("Print :q and <Enter> for save exit");
		sc.useDelimiter(":q");
		String newRecord=sc.next();
		PrintWriter out;
		if (arg.equalsIgnoreCase("-rw")){
			try {
				out = new PrintWriter(newFile.getAbsoluteFile());
				out.write(newRecord);
				out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(arg.equalsIgnoreCase("-a")){
			try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(newFile.getAbsoluteFile(), true)));
					out.append(newRecord);
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		
	}
}

import java.util.Date;


public class SortBySize {
	public SortBySize(String sentance){
		this.sentance=sentance;
	}
	private String sentance;
	String [] sort(){
		long time=new Date().getTime();
		String [] sorted=this.sentance.split("[^\\p{L}]+");
		int [] length=new int [sorted.length];
		for (int i=0;i<sorted.length;i++){
			length[i]=sorted[i].length();
		}
		
			for (int i=0; i<sorted.length;i++){
				for (int j=1;j<sorted.length-i;j++){
					if (length[j]<length[j-1]){
						int iBufer=length[j];
						String sBufer=sorted[j];
						sorted[j]=sorted[j-1];
						length[j]=length[j-1];
						sorted[j-1]=sBufer;
						length[j-1]=iBufer;
					}
				}
			
		
		}
		for(String word:sorted){
			System.out.println(word);
		}
		System.out.println((new Date().getTime()-time));
		return sorted;
	}
}

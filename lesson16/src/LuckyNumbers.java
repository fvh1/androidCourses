
public class LuckyNumbers {
	public boolean isLuckyNumber(int i){
		
		return (i>99)&&(i<1000)&&((((i%10)==((i/10)%10)&&(((i%10)==((i/100)%10)))))||(((i%10)==((i/10)%10+1)&&(((i%10)==((i/100)%10+2))))));
	}
}

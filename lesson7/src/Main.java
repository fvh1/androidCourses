
public class Main {

	/**
	 * @param args
	 */
	public static boolean isBelarusNumber(String number){
		int counter=0;
		for (char c:number.toCharArray()){
			if (c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
				counter++;
			}
		}
		return number.matches("\\+[ 3-]+[ 7-]+[ 5-]+[\\(\\)\\d -]+")&&(counter==12);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.calculate();
	}

}


public class ScreenView implements Click{

	@Override
	public void onClick() {
		System.out.println("onClick");
		// TODO Auto-generated method stub
		
	}
	public void showUI(){
		System.out.println("showUI");
		Button button=new Button();
		button.setClick(this);
		button.test();
	}
}

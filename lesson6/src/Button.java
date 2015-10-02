
public class Button {
	private Click click;

	public void setClick(Click click) {
		System.out.println("setClick");
		this.click = click;
	}
	public void test(){
		System.out.println("test");
		this.click.onClick();
	}
}

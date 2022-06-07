# JavaStudy
class Point {
	private int x, y;
	public Point(int x, int y) { this.x=x; this.y=y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x=x; this.y=y; }
}
public class ColorPoint extends Point{
	private String color;
	public ColorPoint (int x, int y, String color) {
		super(x, y); // Point 생성자 불러오기
		this.color=color;
	}
	public void setPoint (int x, int y) {
		super.move(x, y); // Point 클래스의 move 메소드 불러오기
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void show() {
		System.out.println(color + "색으로(" + getX() + "," + getY()+")");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW"); // 3가지 매개변수 입력 생성자 생성하기
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	} // setPoint(), setColor(), show() 메소드 정의하기
}

# JavaStudy
class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }
}
public class NamedCircle extends Circle {
	private String name;
	public NamedCircle (int radius, String name) {
		super(radius);
		this.name = name;
	} // 생성자
	public void show() {
		System.out.println(name + ", " + "반지름 = " + getRadius());
	} // show() 메소드
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}

package preactice;

class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle {
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	String name;

	void show() {
		System.out.println(name + "반지름 =" + super.getRadius());
	}
}

public class CircleUse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w = new NamedCircle(5, "waffle");
		w.show();
	}
}

class MyPoint extends Object{
	int x;
	int y;
}

class Circle extends Object{
	MyPoint p ;
	int r;
	Circle() {
		p = new MyPoint();
	}
}

public class InheritanceTest_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println(c.toString()); // Circle@626b2d4a
		System.out.println(c); // Circle@626b2d4a
	
	}

}

class MyPoint{
	int x;
	int y;
}

class Circle { // »ó¼Ó
	MyPoint po = new MyPoint();
	int r;
}

public class includingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x="+c.po.x);
		System.out.println("c.y="+c.po.y);
		System.out.println("c.r="+c.r);

	}

}

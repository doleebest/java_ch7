class MyPoint4 extends Object{
	int x;
	int y;
	
	MyPoint4(int x, int y){
		this.x = x;
		this.y=y;
	}
	//Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x +", y:"+y;
	}
}


public class Overriding2 {

	public static void main(String[] args) {
		MyPoint4 p = new MyPoint4(1,2);
		//p.x = 3;
		//p.y = 5;
		//System.out.println(p.toString());
		System.out.println(p);
	}

}

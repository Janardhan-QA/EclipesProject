package PackTwo;

class TwoRam  {

	static int a = 10;
	static {
        m1();
		System.out.println("first static method");
		System.out.println(a);

	}
	public static void main(String args[]) {
		System.out.println("main method");
		m1();
		
	}

	public static void m1() {

		System.out.println(j);
	}

	static {
		System.out.println("second static method");
	}
	static int j = 20;
}
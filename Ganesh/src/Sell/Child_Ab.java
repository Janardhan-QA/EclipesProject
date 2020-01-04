package Sell;

public class Child_Ab extends Ab {

	int salary;
	String color ;
	
	void m1() {
		System.out.println("ref.age");
		
	}
	 
	public Child_Ab(int sal ,String col,int age,String nam) {
		//super(age,nam);
		this.salary=sal;
		this.color=col;
		this.m1();
		System.out.println(this);
		
		
	}

	public static void main(String[] args) {
		
		Child_Ab ref = new Child_Ab(100000,"white",28,"jannu");
		//ref.int
		System.out.println(ref);
//		System.out.println(ref.age);
//		System.out.println(ref.name);
		System.out.println(ref.salary);
		System.out.println(ref.color);
		
		

	}

}

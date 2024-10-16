package week1.day2;

public class Calculator {
	public String calculator(String name) {
		System.out.println(name);
		return name;
	}
	public int add(int a,int b) {
	return a+b;
	}
	public int sub(int c,int d) {
		return c-d;
	}
	public void method1() {
		System.out.println("This is addittion method");
	}
	public void method2() {
		System.out.println("This is subraction method");
	}
	
	public static void main(String[] args) {
		Calculator Casio = new Calculator ();
		String name = Casio.calculator("Casio");
		Casio.method1();
		int r = Casio.add(9, 7);
		System.out.println(r);
		Casio.method2();
		int q = Casio.sub(5, 2);
		System.out.println(q);
		
	}

}

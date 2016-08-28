package reflection.programcreek;

public class Foo {

	String s;

	public Foo() {
	}

	public Foo(String s) {
		this.s = s;
	}

	public void printExpression() {
		System.out.println(s);
	}

	public void print() {
		System.out.println("abc");
	}
}

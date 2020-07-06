package test;

class MyClass implements I1, I2 {

	public static void main(String[] args) {
		new MyClass().m();
	}

	@Override
	public void m() {
		I1.super.m();
		I2.super.m();
	}

}

interface I1 {

	default void m() {
		System.out.println("Interface 1 Method");
	}
}

interface I2 {

	default void m() {
		System.out.println("Interface 2 Method");
	}

}
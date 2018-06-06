package springtest.di.ioc.xml;

public class A {
	private B b;
	
	public A(B b) {
		this.b=b;
	}
	public void a() {
		System.out.println("ioc xml a");
		b.b();
	}
}

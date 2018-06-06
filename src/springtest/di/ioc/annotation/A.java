package springtest.di.ioc.annotation;

public class A {
	private B b;
	
	public A(B b) {
		this.b=b;
	}
	public void a() {
		System.out.println("a");
		b.b();
	}
}

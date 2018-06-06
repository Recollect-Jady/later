package springtest.di.ioc.xml;

public class Main {

	public static void main(String[] args) {
		
		C c =new C();
		
		B b =new B();
		b.setC(c);
		
		A a = new A(b);
		a.a();
	}

}

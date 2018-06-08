package springtest.di.ioc.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
@Autowired
	private B b;
	
	public A(B b) {
		this.b=b;
	}
	public void a() {
		System.out.println("ioc xml a");
		b.b();
	}
}

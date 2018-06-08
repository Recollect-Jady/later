package springtest.di.ioc.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
@Autowired
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void b() {
		System.out.println("ioc xml b");
		c.c();
	}
}

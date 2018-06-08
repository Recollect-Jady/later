package springtest.di.ioc.xml;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class C {
	

	public void c() {
		System.out.println("ioc xml c");
		System.out.println(new Date());
	}
}

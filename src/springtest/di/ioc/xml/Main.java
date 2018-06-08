package springtest.di.ioc.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springtest/di/ioc/xml/beans.xml");
		A a = context.getBean(A.class);
		a.a();
		
		A a2= context.getBean(A.class);
		System.out.println("a和a2 是同一个吗?"+(a==a2));
		//true  说明scope默认情况下(singleton),spring会缓存创建好的组件,再一次获取得到的是同一个
		
		D d= context.getBean(D.class);
		D d2= context.getBean(D.class);
		System.out.println("d和d2 是同一个吗?"+(d==d2));
		//false  说明scope=prototype,每次获取都会新创建一个
		ShortMessageService sms = context.getBean(ShortMessageService.class);
		sms.send("15200907851", "你好");
	}

}

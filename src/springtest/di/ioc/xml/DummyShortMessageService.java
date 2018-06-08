package springtest.di.ioc.xml;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class DummyShortMessageService implements ShortMessageService {

	@Override
	public void send(String phoneNumber, String message) {
		System.out.println(String.format("模拟法送短信[%s]到[%s]", message,phoneNumber));
	}

}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);

		// CustomerService service= new CustomerServiceImpl();
		CustomerService service = appcontext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		CustomerService service1 = appcontext.getBean("customerService", CustomerService.class);
		System.out.println(service1);
		System.out.println(service.findAll().get(0).getFirstname());

	}

}

package sample.securing;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(Application.class).run(args);
	}

}

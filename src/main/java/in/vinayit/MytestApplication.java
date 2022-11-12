package in.vinayit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MytestApplication {

	public static void main(String[] args) {
		//Changes for HIS-134
		ConfigurableApplicationContext run = SpringApplication.run(MytestApplication.class, args);
		run.close();
	}

}

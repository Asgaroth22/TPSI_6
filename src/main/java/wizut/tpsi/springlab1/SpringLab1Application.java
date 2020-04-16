package wizut.tpsi.springlab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"wizut.tpsi"})
@SpringBootApplication
public class SpringLab1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLab1Application.class, args);
	}

}

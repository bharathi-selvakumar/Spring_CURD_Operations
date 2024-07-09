package spring_boot_intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Task","spring_boot_intern	"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
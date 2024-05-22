package kr.co.strato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloMinikubeSbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMinikubeSbDemoApplication.class, args);
	}

	@GetMapping(value="/")
	public String HelloWorld() {
		return "Hello World from YoungRan!! test save!!!";
	}
}

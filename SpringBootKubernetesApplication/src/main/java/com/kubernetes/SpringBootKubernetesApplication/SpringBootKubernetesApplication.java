package com.kubernetes.SpringBootKubernetesApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootKubernetesApplication {

	@GetMapping("/")
	public String getMapping(){
		return "k8s";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKubernetesApplication.class, args);
	}

}

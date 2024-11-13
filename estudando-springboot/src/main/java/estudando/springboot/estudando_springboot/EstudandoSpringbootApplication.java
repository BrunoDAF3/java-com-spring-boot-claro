package estudando.springboot.estudando_springboot;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudandoSpringbootApplication {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Estudando Spring Boot", "Spring Boot", JOptionPane.INFORMATION_MESSAGE);

		SpringApplication.run(EstudandoSpringbootApplication.class, args);
		System.out.println("Spring Boot é da hora");
		
	}

	

}

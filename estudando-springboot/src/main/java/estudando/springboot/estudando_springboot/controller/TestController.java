package estudando.springboot.estudando_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String TestMessage(){
        return "Estudando Spring Boot REST APIs";
    }
}

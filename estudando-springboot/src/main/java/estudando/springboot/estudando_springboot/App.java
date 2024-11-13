package estudando.springboot.estudando_springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class App implements CommandLineRunner {

    @Autowired
    private ContainerTeste container;

    @Override
    public void run(String... args) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("Impressão de dentro do Bean");
        System.out.println(container.testeString());
       
    }

}

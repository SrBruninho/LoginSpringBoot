package srbruninho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainApplication {

    @GetMapping("/home")
    public String paginaInicial(){
        return "Página Inicial";
    }
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
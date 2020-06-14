package Silva.Carlos.projetocomlombok.controllers;

import Silva.Carlos.projetocomlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldComLombok {
    @GetMapping("/")
    public String index() {
        return "Hello World com lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto produto";
//    }
}

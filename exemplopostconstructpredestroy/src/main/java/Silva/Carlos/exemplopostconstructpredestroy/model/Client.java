package Silva.Carlos.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

//lombok annotations
@ToString
@Getter @Setter
@AllArgsConstructor

//springboot annotation
@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe Cliente");
    }
}

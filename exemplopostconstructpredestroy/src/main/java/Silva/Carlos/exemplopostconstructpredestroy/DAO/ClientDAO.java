package Silva.Carlos.exemplopostconstructpredestroy.DAO;

import Silva.Carlos.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//lombok
@Getter @Setter

// springboot
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto criado com sucesso");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado com sucesso");
    }
}

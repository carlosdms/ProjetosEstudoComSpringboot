package Silva.Carlos.projetocomlombok.controllers;

import Silva.Carlos.projetocomlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client("Carlos", "Silva", 34);
        Client client1 = new Client("Alex", "Silveira", 39);
        clients.add(client);
        clients.add(client1);

        return clients;
    }
}

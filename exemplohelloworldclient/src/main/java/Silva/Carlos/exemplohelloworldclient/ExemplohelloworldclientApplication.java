package Silva.Carlos.exemplohelloworldclient;

import Silva.Carlos.exemplohelloworldclient.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class ExemplohelloworldclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplohelloworldclientApplication.class, args);

//		 objeto 1 -> construtor vazio
		Client client = new Client();
		client.setName("Carlos");
		client.setLastName("Silva");
		client.setIncome(2000.00);
		System.out.println(client);

//		objeto 2 construtor cheio
		Client client1 = new Client("Silva","Carlos", 2100.15);
		System.out.println(client1);

//		objeto 3 cliente aparee apenas para exibição, não será guardado objeto na memória
		System.out.println(new Client("Carlito","Silva", 2564.08));

	}


}

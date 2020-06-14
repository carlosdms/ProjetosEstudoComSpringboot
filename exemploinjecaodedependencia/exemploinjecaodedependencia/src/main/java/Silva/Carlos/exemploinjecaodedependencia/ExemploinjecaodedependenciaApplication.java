package Silva.Carlos.exemploinjecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author carlos
 * @version 1.0.1
 * @since 13/06/2020 - 12:50
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

//		acoplado, errado
//		Pet pet = new Pet();
//		pet.execute();
	}
}

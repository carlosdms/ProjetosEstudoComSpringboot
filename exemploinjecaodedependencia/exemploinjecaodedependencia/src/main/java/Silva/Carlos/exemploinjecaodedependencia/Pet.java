package Silva.Carlos.exemploinjecaodedependencia;

import Silva.Carlos.exemploinjecaodedependencia.interfaces.AnimalInterface;
import Silva.Carlos.exemploinjecaodedependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author carlos
 * @version 1.0.1
 * @since 13/06/2020 - 12:50
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private AnimalInterface animalInterface;


//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }
}

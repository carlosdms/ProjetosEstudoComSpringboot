package Silva.Carlos.exemploinjecaodedependencia.model;

import Silva.Carlos.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author carlos
 * @version 1.0.1
 * @since 13/06/2020 - 12:50
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("auau");
    }
}

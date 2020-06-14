package Silva.Carlos.projetocomlombok.model;

import lombok.*;

/**
 * @author carlos
 * @since 06/09/2020
 * @version 1.0.1
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return ...
     */
    public int calculateAgeInMonths() {
        return age * 12;
    }
}

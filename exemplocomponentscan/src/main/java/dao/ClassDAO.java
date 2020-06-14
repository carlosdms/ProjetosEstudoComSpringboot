package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author carlos
 * @since 2020/06/13 - 17:00
 * @version 1.0.1
 */
@Getter @Setter
@Component
/**
 * constrtor da classe DAO relcionada ao banco de dados
 */
public class ClassDAO {
    @Autowired
    private ClassJDBC classJDBC;
}

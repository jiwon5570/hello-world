package hello.world.domain;

import hello.world.BoundedContext974Application;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BusinessLogic_table")
@Data
public class BusinessLogic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static BusinessLogicRepository repository() {
        BusinessLogicRepository businessLogicRepository = BoundedContext974Application.applicationContext.getBean(
            BusinessLogicRepository.class
        );
        return businessLogicRepository;
    }
}

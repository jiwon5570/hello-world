package hello.world.infra;

import hello.world.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogicHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<BusinessLogic>> {

    @Override
    public EntityModel<BusinessLogic> process(
        EntityModel<BusinessLogic> model
    ) {
        return model;
    }
}

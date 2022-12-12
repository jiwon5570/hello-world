package hello.world.domain;

import hello.world.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="businessLogics", path="businessLogics")
public interface BusinessLogicRepository extends PagingAndSortingRepository<BusinessLogic, >{

}

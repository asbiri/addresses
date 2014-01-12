package hello.database;

import hello.domain.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by astrid on 12.01.14.
 */
public interface AddressRepository extends MongoRepository <Address, String> {

}

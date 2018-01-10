package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.egiants.Customer;

interface CustomerRepository extends Repository<Customer, String> {
	 
   public void delete(Customer deleted);
 
    List<Customer> findAll();
 
    Optional<Customer> findOne(String id);
 
    Customer save(Customer saved);
}

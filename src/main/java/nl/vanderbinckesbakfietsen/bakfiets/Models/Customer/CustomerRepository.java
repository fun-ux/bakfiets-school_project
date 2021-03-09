package nl.vanderbinckesbakfietsen.bakfiets.Models.Customer;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);
}
package lk.ijse.edu.springbootdeployment.repository;

import lk.ijse.edu.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Additional query methods can be defined here if needed
}

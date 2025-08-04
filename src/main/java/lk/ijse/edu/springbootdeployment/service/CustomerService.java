package lk.ijse.edu.springbootdeployment.service;

import lk.ijse.edu.springbootdeployment.dto.CustomerDTO;
import lk.ijse.edu.springbootdeployment.entity.Customer;
import lk.ijse.edu.springbootdeployment.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setName(customerDTO.getName());
        customer.setAddress(customerDTO.getAddress());
        customerRepository.save(customer);
    }
}

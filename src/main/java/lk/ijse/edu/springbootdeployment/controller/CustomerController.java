package lk.ijse.edu.springbootdeployment.controller;

import lk.ijse.edu.springbootdeployment.dto.CustomerDTO;
import lk.ijse.edu.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return "Customer saved successfully";
    }
}

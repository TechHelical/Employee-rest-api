package com.codingshuttle.tutorial.controllers;


//Operations
//get /employees
//post /employees
//delete /employee/{id}


import com.codingshuttle.tutorial.dto.EmployeeDTO;
import com.codingshuttle.tutorial.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    public  EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }



    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path= "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
         return employeeService.deleteEmployeeById(id);
    }

}

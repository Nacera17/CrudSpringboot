package org.nacera.crudapp.controller;

import lombok.RequiredArgsConstructor;
import org.nacera.crudapp.entity.EmployeeEntity;
import org.nacera.crudapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping

    public List<EmployeeEntity> findAllEmployee(){
        return  employeeService.findAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmloyeeById(@PathVariable("id") Long id){
        return  employeeService.findByIdEmpl(id);
    }
@PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }
    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }
    @DeleteMapping("/{id}")
    public void   deleteEmployee(@PathVariable("id") Long  id ){
         employeeService.deleteEmployee(id);
    }

}


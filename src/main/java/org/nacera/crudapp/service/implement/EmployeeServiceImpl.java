package org.nacera.crudapp.service.implement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.nacera.crudapp.entity.EmployeeEntity;
import org.nacera.crudapp.repository.EmployeeRepo;
import org.nacera.crudapp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private  final EmployeeRepo employeeRepo;
    @Override
    public List<EmployeeEntity> findAllEmployee(){
        return employeeRepo.findAll();
    };
    @Override

    public Optional<EmployeeEntity> findByIdEmpl(Long id){
        return employeeRepo.findById(id);
    };
    @Override

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity){
        return employeeRepo.save(employeeEntity);
    };
    @Override

    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity){
        return employeeRepo.save(employeeEntity);

    };
    @Override

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);

    };

}

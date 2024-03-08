package org.nacera.crudapp.repository;

import org.nacera.crudapp.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo  extends JpaRepository<EmployeeEntity, Long> {
}

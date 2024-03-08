package org.nacera.crudapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "employee")
@Data @NoArgsConstructor @AllArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_gender")
    private String gender;
    @Column(name = "emp_date_birth")
    private Date dateBirth;
    @Column(name = "emp_add")
    private String address;


}

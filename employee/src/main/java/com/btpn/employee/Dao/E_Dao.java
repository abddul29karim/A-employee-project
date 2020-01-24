package com.btpn.employee.Dao;

import com.btpn.employee.Entity.Employee_Db;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface E_Dao {
    //create
    public void save(Employee_Db employee_db);

    //findall
    public List<Employee_Db> getEmp(Integer page, Integer limit);

    //findbyid
    public Employee_Db findById(Integer emp_id);

    //update
    public Employee_Db update(Employee_Db employee_db, Integer emp_id);

    //delete
    public void delemp(String nik);

    //findbynik
    public Employee_Db findByNik(String nik);

    //findbyemail
    public Employee_Db findByEmail(String email);

    //findbyname
    public Employee_Db findByName(String name);

}

package com.btpn.employee.Service;

import com.btpn.employee.Dao.DaoResponse;
import com.btpn.employee.Entity.Employee_Db;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface E_Service {
    //create
    public ResponseEntity<DaoResponse> save(Employee_Db employee_db);

    //findall
    public ResponseEntity<DaoResponse> getEmp(Integer page, Integer limit);

    //findbyid
    public int findall();

    //update
    public ResponseEntity<DaoResponse> update(Employee_Db employee_db, String nik);

    //delete
    public ResponseEntity<DaoResponse> delemp(String nik);

    //findbynik
    public ResponseEntity<DaoResponse> findByNik(String nik);

    //findbyemail
    public ResponseEntity<DaoResponse> findByEmail(String email);

    //findbyname
    public ResponseEntity<DaoResponse> findByName(String name);


}

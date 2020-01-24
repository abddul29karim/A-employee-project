package com.btpn.employee.Controller;

import com.btpn.employee.Dao.DaoResponse;
import com.btpn.employee.Dao.E_Dao;
import com.btpn.employee.Entity.Employee_Db;
import com.btpn.employee.Service.E_Service;
import com.btpn.employee.Service.E_ServiceImp;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = {"/employee"})
public class Api_Cont {
    @Autowired
    E_Service e_service;

    @Autowired
    E_Dao e_dao;

    //http://localhost:3002/employee/register
  @RequestMapping(value="/register", method=RequestMethod.POST)
    public ResponseEntity<DaoResponse> createemp(@RequestBody Employee_Db employee_db) {
     return e_service.save(employee_db);
  }

    //http://localhost:3002/employee/all
    @GetMapping(value="/", headers="Accept=application/json")
    public ResponseEntity<DaoResponse> getEmp(@RequestParam(name="page",defaultValue ="1") Integer page,@RequestParam(name="limit", defaultValue="10") Integer limit) {
       return e_service.getEmp(page,limit);
    }
/*
    // http://localhost:3002/employee/40
    @GetMapping(value = "/{emp_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DaoResponse> findById(@PathVariable("emp_id") Integer emp_id) {
          return e_service.findById(emp_id);
    }*/

     //http://localhost:3002/employee/40
     @PutMapping(value="/{nik}", headers="Accept=application/json")
     public ResponseEntity<DaoResponse> update(@RequestBody Employee_Db emp ,@PathVariable("nik") String nik) {
       return e_service.update(emp, nik);
     }

    //http://localhost:3002/employee/40
    @DeleteMapping(value="/{nik}", headers ="Accept=application/json")
    public ResponseEntity<DaoResponse> delemp(@PathVariable("nik") String nik) {
        return e_service.delemp(nik);
    }

    // http://localhost:3002/employee/40
    @GetMapping(value = "/{nik}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DaoResponse> findByNik(@PathVariable("nik") String  nik) {
        return e_service.findByNik(nik);
    }

    // http://localhost:3002/employee/40
    @GetMapping(value = "email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DaoResponse> findByEmail(@PathVariable("email") String  email) {
        return e_service.findByEmail(email);
    }

    // http://localhost:3002/employee/40
    @GetMapping(value = "name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DaoResponse> findByName(@PathVariable("name") String  name) {
        return e_service.findByName(name);
    }

}

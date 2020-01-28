package com.btpn.employee;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.btpn.employee.Controller.Api_Cont;
import com.btpn.employee.Dao.DaoResponse;
import com.btpn.employee.Dao.E_Dao;
import com.btpn.employee.Entity.Employee_Db;
import com.btpn.employee.Service.E_Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.AccessibleObject;

@ExtendWith(MockitoExtension.class)
public class employeeTest {
    //inject controller
    @InjectMocks
    Api_Cont api_cont;

    //inject autowired dari controller
    @Mock
    E_Service e_service;

    @Mock
    E_Dao e_dao;


    @Test
    public void createempTest() {
        Employee_Db dummy = new Employee_Db();
        dummy.setNik("12345678");
        dummy.setName("dummy");
        dummy.setEmail("dummy@gmail.com");
        dummy.setAddress("jakarta");
        DaoResponse responsedao = new DaoResponse();
        responsedao.setCode(201);
        responsedao.setData(dummy);
        responsedao.setStatus("Created");
        when(e_service.save(dummy)).thenReturn(ResponseEntity.status(201).body(responsedao));
        assertThat(api_cont.createemp(dummy).getStatusCodeValue()).isEqualTo(201);
    }

    @Test
    public void findNikTest() {
        Employee_Db dummy = new Employee_Db();
        dummy.setNik("12345678");
        DaoResponse responsedao = new DaoResponse();
        responsedao.setCode(200);
        responsedao.setData(dummy);
        responsedao.setStatus("data ditemukan");
        when(e_service.findByNik(dummy.getNik())).thenReturn(ResponseEntity.status(200).body(responsedao));
        assertThat(api_cont.findByNik(dummy.getNik()).getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void findNameTest() {
        Employee_Db dummy = new Employee_Db();
        dummy.setName("abdul karim");
        DaoResponse responsedao = new DaoResponse();
        responsedao.setCode(200);
        responsedao.setData(dummy);
        responsedao.setStatus("data ditemukan");
        when(e_service.findByName(dummy.getName())).thenReturn(ResponseEntity.status(200).body(responsedao));
        assertThat(api_cont.findByName(dummy.getName()).getStatusCodeValue()).isEqualTo(200);
    }

}

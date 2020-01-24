package com.btpn.employee;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.btpn.employee.Controller.Api_Cont;
import com.btpn.employee.Dao.DaoResponse;
import com.btpn.employee.Dao.E_Dao;
import com.btpn.employee.Entity.Employee_Db;
import com.btpn.employee.Service.E_Service;
import com.btpn.employee.Service.E_ServiceImp;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.junit.Before;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;


@SpringBootTest
class EmployeeApplicationTests {
   @Mock
    E_Dao e_dao;

   @Mock
    private Employee_Db employee_db;



   /* @InjectMocks
    E_Service e_service;

    @InjectMocks
    E_ServiceImp e_serviceImp;
    @Mock
    E_Dao e_dao;

    Employee_Db dummy = new Employee_Db();*/
  /* @Test
    public  void createemp(){
        dummy.setNik("1234");
        dummy.setName("abdul karim");
        dummy.setEmail("abdul@gmail.com");
        dummy.setAddress("jakarta");

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ResponseEntity<DaoResponse> test = e_service.save(dummy);
        assertThat(test.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public  void update(){
        dummy.setNik("1234");
        dummy.setName("abdul karim");
        dummy.setEmail("abdul@gmail.com");
        dummy.setAddress("jakarta");
        when(e_service.findByNik(dummy.getNik())).thenReturn(dummy);

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ResponseEntity<DaoResponse> test = api_cont.update(dummy, dummy.getEmp_id());
        assertThat(test.getStatusCodeValue()).isEqualTo(400);
    }

    @Test
    public void findById(){
        dummy.setNik(1234);
        dummy.setName("abdul karim");
        dummy.setEmail("abdul@gmail.com");
        dummy.setAddress("jakarta");
        when(e_service.findById(dummy.getEmp_id())).thenReturn(dummy);

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ResponseEntity<DaoResponse> test =api_cont.findById(dummy.getEmp_id());
        assertThat(test.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void getEmp(){
        dummy.setNik(1234);
        dummy.setName("abdul karim");
        dummy.setEmail("abdul@gmail.com");
        dummy.setAddress("jakarta");

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ResponseEntity<DaoResponse> test =api_cont.getEmp();
        assertThat(test.getStatusCodeValue()).isEqualTo(200);
    }

    //ResponseEntity<DaoResponse> delemp(Integer emp_id)
    @Test
    public void delemp(){
        dummy.setNik("11111111");
        dummy.setName("abdul karim");
        dummy.setEmail("abdul@gmail.com");
        dummy.setAddress("jakarta");
        when(e_service.findById(1)).thenReturn(dummy);

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ResponseEntity<DaoResponse> test =e_serviceImp.delemp();
        assertThat(test.getStatusCodeValue()).isEqualTo(200);
    }*/

}

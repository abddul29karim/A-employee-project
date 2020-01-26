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
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private Employee_Db employee_db;
    @MockBean
    private E_Service e_service;

    @Test
    public void getEmp() throws Exception{

    }
}

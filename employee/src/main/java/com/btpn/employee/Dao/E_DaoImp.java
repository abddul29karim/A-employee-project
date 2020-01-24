package com.btpn.employee.Dao;

import com.btpn.employee.Entity.Employee_Db;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class E_DaoImp implements E_Dao {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Employee_Db employee_db) {
        session().save(employee_db);
    }

    @Override
    public List<Employee_Db> getEmp() {
        @SuppressWarnings("unchecked")
        List<Employee_Db> list = session().createCriteria(Employee_Db.class).list();
        return list;
    }

    //https://www.candidjava.com/tutorial/spring-boot-hibernate-crud-example/
    @Override
    public Employee_Db findById(Integer emp_id) {
        return (Employee_Db) this.session().createQuery
                ("from Employee_Db where emp_id= :id_emp").
                setParameter("id_emp",emp_id).uniqueResult();
    }

    @Override
    public Employee_Db update(Employee_Db emp, Integer emp_id) {
        //Employee_Db employee_db = session().get(Employee_Db.class, emp_id);
        Employee_Db employee_db = findById(emp_id);
        employee_db.setName(emp.getName());
        employee_db.setEmail(emp.getEmail());
        System.out.println(emp.getEmail());
        employee_db.setAddress(emp.getAddress());
        session().save(employee_db);
        return employee_db;
    }

    @Override
    public void delemp(Integer emp_id) {
        Employee_Db employee_db = findById(emp_id);
        session().delete(employee_db);
    }

    @Override
    public Employee_Db findByNik(String nik) {
        return (Employee_Db) this.session().createQuery("from Employee_Db  where nik = :nik")
                .setParameter("nik", nik).uniqueResult();
    }

    @Override
    public Employee_Db findByEmail(String email) {
        return (Employee_Db) this.session().createQuery("from Employee_Db where email= :email")
                .setParameter("email", email).uniqueResult();
    }

    @Override
    public Employee_Db findByName(String name) {
        return (Employee_Db) this.session().createQuery("from Employee_Db where name= :name")
                .setParameter("name", name).uniqueResult();
    }

}

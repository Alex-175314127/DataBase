/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MyOracle;

/**
 *
 * @author admin
 */
public class Department {
    private int department_ID;
    private String department_name;
   
    
    private ArrayList<Employee> listEmployee = new ArrayList<Employee>();
    private ArrayList<Employee> managers = new ArrayList<Employee>() ;

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public Department(int department_ID, String department_name) {
        this.department_ID = department_ID;
        this.department_name = department_name;
    }

    public Department() {
    }

    public void readEmployees(){
        try {
            MyOracle ora = new MyOracle("172.23.9.185", "1521", "orcl", "MHS175314127", "MHS175314127");
            Connection con = ora.getConnection();           
            Statement stmt = con.createStatement();           
            String query = "select first_name,last_name from Employees where department_id="+department_ID;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Employee em = new Employee(rs.getString(1),rs.getString(2));
                listEmployee.add(em);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void readManager(){
        
    }
    public int getDepartment_ID() {
        return department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        this.department_ID = department_ID;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public ArrayList<Employee> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Employee> managers) {
        this.managers = managers;
    }

   

   

    
}

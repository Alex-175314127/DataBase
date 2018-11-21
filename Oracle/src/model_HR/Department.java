/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Department {
    private int department_ID;
    private String department_name;
    
    private ArrayList<Employee> listEmployee = new ArrayList<Employee>();

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
    
}

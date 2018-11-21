/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOracle;

import model_HR.Department;

/**
 *
 * @author admin
 */
public class testDepartment1 {
    public static void main(String[] args) {
        Department d = new Department(10,"Administration");
        d.readEmployees();
        for (int i = 0; i < d.getListEmployee().size(); i++) {
            System.out.println(d.getListEmployee().get(i).toString());
        }
//         Department d1 = new Department(20,"Marketing");
//        d1.readEmployees();
//        for (int i = 0; i < d1.getListEmployee().size(); i++) {
//            System.out.println(d1.getListEmployee().get(i).toString());
//    }
    }
}

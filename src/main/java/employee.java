package src.main.java;

import java.lang.String;

public class employee {
        java.lang.String name;
        int emp_id;
        java.lang.String department;
        java.lang.String designation;
        public void employee_print(){
            System.out.println("Name of the employee:" +name);
            System.out.println("ID of the employee:" +emp_id);
            System.out.println("Department of the employee:" +department);
            System.out.println("Designation of the employee:" +designation);
        }
        public static void main(String[] args){
            employee emp_obj=new employee();
            emp_obj.name="Hema";
            emp_obj.emp_id=1234;
            emp_obj.department="PD";
            emp_obj.designation="Developer";
            emp_obj.employee_print();

        }
    }


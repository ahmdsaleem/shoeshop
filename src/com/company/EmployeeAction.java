package com.company;


import com.company.beans.Employee;

public class EmployeeAction {

        private int employeeIndex=0;
        private Employee employees[] = new Employee[500];

        public void addEmployee(Employee employee){
            employees[employeeIndex]=employee;
            employeeIndex++;

        }

        public Employee viewEmployee(String id){
            for(int i=0;i<employeeIndex;i++){
                if(employees[i].getId().equalsIgnoreCase(id)){
                    return employees[i];
                }
            }
            return null;
        }

        public void updateEmployee(String id,Employee employee){
            for(int i=0;i<employeeIndex;i++){
                if(employees[i].getId().equalsIgnoreCase(id)){
                    employees[i]=employee;
                }
            }
        }

        public void deleteEmployee(String id){
            for(int i=0;i<employeeIndex;i++){
                if(employees[i].getId().equalsIgnoreCase(id)){
                    employees[i]=null;
                }
            }
        }



        public void listEmployees(){
            for(int i=0;i<employeeIndex;i++){
                if(employees[i]!=null) {
                    System.out.println(employees[i].getId());
                }
            }
        }
    }




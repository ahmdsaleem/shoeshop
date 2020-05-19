package com.company;

import com.company.beans.Employee;

import java.util.Scanner;

public class EmployeeView {
    EmployeeAction employeeAction = new EmployeeAction();

    public void showEmployeeMenu(int choice){

        int employeeChoice;
        String employeeId,employeeName,updatedEmployeeId,updatedEmployeeName;
        Employee addedEmployee = new Employee();
        Employee updatedEmployee = new Employee();

        if(choice==3){
            System.out.println("Press 1 to Add Employee");
            System.out.println("Press 2 to Search a Certain Employee");
            System.out.println("Press 3 to Update an Employee");
            System.out.println("Press 4 to Delete an Employee");
            System.out.println("Press 5 to List all Employees Present");

            Scanner scanner = new Scanner(System.in);
            employeeChoice = scanner.nextInt();
            scanner.nextLine();



            if(employeeChoice==1){

                System.out.println("Enter the Id of the Brand you want to add");
                employeeId = scanner.nextLine();
                addedEmployee.setId(employeeId);
                System.out.println("Enter the Name of the Brand you want to add");
                employeeName = scanner.nextLine();
                addedEmployee.setName(employeeName);
                employeeAction.addEmployee(addedEmployee);
                System.out.println("Employee is Added Successfully");
            }

            else if(employeeChoice==2){
                System.out.println("Enter the Id of the Employee you want to search");
                employeeId = scanner.nextLine();
                if(employeeAction.viewEmployee(employeeId) != null) {
                    System.out.println(employeeAction.viewEmployee(employeeId).getId() + " is Present");
                }
                System.out.println("Employee is Searched Successfully");
            }

            else if(employeeChoice==3){
                System.out.println("Enter the Id of the Employee you want to Replace");
                employeeId = scanner.nextLine();
                addedEmployee.setId(employeeId);
                System.out.println("Enter the Id of the Employee you want to Replace with");
                updatedEmployeeId = scanner.nextLine();
                updatedEmployee.setId(updatedEmployeeId);
                System.out.println("Enter the Name of the Employee you want to Replace with");
                updatedEmployeeName = scanner.nextLine();
                updatedEmployee.setName(updatedEmployeeName);
                employeeAction.updateEmployee(employeeId,updatedEmployee);
                System.out.println("Employee is Updated Successfully");
            }

            else if(employeeChoice == 4){
                System.out.println("Enter the Id of the Employee you want to Delete");
                employeeId = scanner.nextLine();
                employeeAction.deleteEmployee(employeeId);
                System.out.println("Employee is Deleted Successfully");
            }

            else if(employeeChoice == 5){
                employeeAction.listEmployees();
                System.out.println("Employees are Listed Successfully");
            }

        }
    }
}

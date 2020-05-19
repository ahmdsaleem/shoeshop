package com.company;

import com.company.beans.Customer;


import java.util.Scanner;

public class CustomerView {
    CustomerAction customerAction = new CustomerAction();

    public void showCustomerMenu(int choice){

        int customerChoice;
        String customerId,customerName,updatedCustomerId,updatedCustomerName;
        Customer addedCustomer = new Customer();
        Customer updatedCustomer = new Customer();


        if(choice==2){
            System.out.println("Press 1 to Add Customer");
            System.out.println("Press 2 to Search for a Certain Customer");
            System.out.println("Press 3 to Update Customer");
            System.out.println("Press 4 to Delete Customer");
            System.out.println("Press 5 to List all Customer Listed");

            Scanner scanner = new Scanner(System.in);
            customerChoice = scanner.nextInt();
            scanner.nextLine();

            if(customerChoice==1){
                System.out.println("Enter the Id of the Customer you want to add");
                customerId = scanner.nextLine();
                addedCustomer.setId(customerId);
                System.out.println("Enter the Name of the Customer you want to add");
                customerName = scanner.nextLine();
                addedCustomer.setName(customerName);
                customerAction.addCustomer(addedCustomer);
                System.out.println("Customer is Added Successfully");
            }

            else if(customerChoice==2){
                System.out.println("Enter the Id of the Customer you want to search for");
                customerId = scanner.nextLine();
                if(customerAction.viewCustomer(customerId) != null) {
                    System.out.println(customerAction.viewCustomer(customerId).getId() + " is Present");
                }
                System.out.println("Customer is Searched Successfully");
            }

            else if(customerChoice==3){
                System.out.println("Enter the Id of the Customer you want to Replace");
                customerId = scanner.nextLine();
                addedCustomer.setId(customerId);
                System.out.println("Enter the Id of the Customer you want to Replace with");
                updatedCustomerId = scanner.nextLine();
                updatedCustomer.setId(updatedCustomerId);
                System.out.println("Enter the Name of the Customer you want to Replace with");
                updatedCustomerName = scanner.nextLine();
                updatedCustomer.setName(updatedCustomerName);
                customerAction.updateCustomer(customerId,updatedCustomer);
                System.out.println("Customer is Updated Successfully");
            }

            else if(customerChoice == 4){
                System.out.println("Enter the Id of the Customer you want to Delete");
                customerId = scanner.nextLine();
                customerAction.deleteCustomer(customerId);
                System.out.println("Customer is Deleted Successfully");
            }

            else if(customerChoice == 5){
                customerAction.listCustomers();
                System.out.println("Customers are Listed Successfully");
            }

        }
    }

}

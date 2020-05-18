package com.company;

import com.company.beans.Customer;


public class CustomerAction {

    private int customerIndex=0;
    private Customer customers[] = new Customer[500];

    public void addCustomer(Customer customer){
        customers[customerIndex]=customer;
        customerIndex++;

    }

    public Customer viewCustomer(String id){
        for(int i=0;i<customerIndex;i++){
            if(customers[i].getId().equalsIgnoreCase(id)){
                return customers[i];
            }
        }
        return null;
    }

    public void updateCustomer(String id,Customer customer){
        for(int i=0;i<customerIndex;i++){
            if(customers[i].getId().equalsIgnoreCase(id)){
                customers[i]=customer;
            }
        }
    }

    public void deleteCustomer(String id){
        for(int i=0;i<customerIndex;i++){
            if(customers[i].getId().equalsIgnoreCase(id)){
                customers[i]=null;
            }
        }
    }



    public void listCustomers(){
        for(int i=0;i<customerIndex;i++){
            if(customers[i]!=null) {
                System.out.println(customers[i].getId());
            }
        }
    }
}





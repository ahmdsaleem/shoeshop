package com.company;

import com.company.beans.Order;

import java.util.Scanner;

public class OrderView {
    OrderAction orderAction = new OrderAction();

    public void showOrderMenu(int choice){

        int orderChoice;
        String orderId,updatedOrderId;
        Order addedOrder = new Order();
        Order updatedOrder = new Order();

        if(choice==4){
            System.out.println("Press 1 to Add an Order");
            System.out.println("Press 2 to Search for a Certain Order");
            System.out.println("Press 3 to Update an Order");
            System.out.println("Press 4 to Delete an Order");
            System.out.println("Press 5 to List all Orders Present");

            Scanner scanner = new Scanner(System.in);
            orderChoice = scanner.nextInt();
            scanner.nextLine();


            if(orderChoice==1){
                System.out.println("Enter the Id of the Order you want to add");
                orderId = scanner.nextLine();
                addedOrder.setId(orderId);
                orderAction.addOrder(addedOrder);
                System.out.println("Brand is Added Successfully");
            }

            else if(orderChoice == 2) {
                System.out.println("Enter the Id of the Order you want to search");
                orderId = scanner.nextLine();
                if (orderAction.viewOrder(orderId) != null) {
                    System.out.println(orderAction.viewOrder(orderId).getId() + " is Present");
                }
                    System.out.println("Order is Searched Successfully");
            }

            else if(orderChoice==3){
                System.out.println("Enter the Id of the Order you want to Replace");
                orderId = scanner.nextLine();
                addedOrder.setId(orderId);
                System.out.println("Enter the Id of the Order you want to Replace with");
                updatedOrderId = scanner.nextLine();
                updatedOrder.setId(updatedOrderId);
                System.out.println("Order is Updated Successfully");
            }

            else if(orderChoice == 4){
                System.out.println("Enter the Id of the Order you want to Delete");
                orderId = scanner.nextLine();
                orderAction.deleteOrder(orderId);
                System.out.println("Order is Deleted Successfully");
            }

            else if(orderChoice == 5){
                orderAction.listOrders();
                System.out.println("Orders are Listed Successfully");
            }

        }
    }
}

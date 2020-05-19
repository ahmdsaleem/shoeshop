package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String end="Start";
        do{
            int choice;
            Menu menu = new Menu();
            BrandView brandView = new BrandView();
            CustomerView customerView = new CustomerView();
            EmployeeView employeeView = new EmployeeView();
            OrderView orderView = new OrderView();
            ShelfView shelfView = new ShelfView();
            ShoeView shoeView = new ShoeView();


            menu.showMenu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            shoeView.showShoeMenu(choice);
            brandView.showBrandMenu(choice);
            customerView.showCustomerMenu(choice);
            employeeView.showEmployeeMenu(choice);
            orderView.showOrderMenu(choice);
            shelfView.showShelfMenu(choice);


            System.out.println("Enter \"End\" to end the Program");
            end = scanner.nextLine();

        }while(!(end.equalsIgnoreCase("End")));



    }

}

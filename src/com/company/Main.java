package com.company;

import com.company.beans.Shelf;
import com.company.beans.Shoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String end="Start";
        do{
            int choice;
            Menu menu = new Menu();
            ShoeView shoeView = new ShoeView();

            //Seed Data Start
            ShoeAction shoeAction = new ShoeAction();

            //Seed Data End

            menu.showMenu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            shoeView.showShoeMenu(choice);
            System.out.println("Enter \"End\" to end the Program");
            end = scanner.nextLine();

        }while(!(end.equalsIgnoreCase("End")));



    }

}

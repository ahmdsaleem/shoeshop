package com.company;

import com.company.beans.Shelf;

import java.util.Scanner;

public class ShelfView {
    ShelfAction shelfAction = new ShelfAction();

    public void showShelfMenu(int choice){

        int shelfChoice;
        String shelfId,updatedShelfId;
        Shelf addedShelf = new Shelf();
        Shelf updatedShelf = new Shelf();

        if(choice==5){
            System.out.println("Press 1 to Add Shelf");
            System.out.println("Press 2 to Search a Certain Shelf");
            System.out.println("Press 3 to Update a Shelf");
            System.out.println("Press 4 to Delete a Shelf");
            System.out.println("Press 5 to List all Shelves Present");

            Scanner scanner = new Scanner(System.in);
            shelfChoice = scanner.nextInt();
            scanner.nextLine();


            if(shelfChoice==1){

                System.out.println("Enter the Id of the Shelf you want to add");
                shelfId = scanner.nextLine();
                addedShelf.setId(shelfId);
                shelfAction.addShelf(addedShelf);
                System.out.println("Shelf is Added Successfully");
            }

            else if(shelfChoice==2){
                System.out.println("Enter the Id of the Shelf you want to search");
                shelfId = scanner.nextLine();
                if(shelfAction.viewShelf(shelfId) != null) {
                    System.out.println(shelfAction.viewShelf(shelfId).getId() + " is Present");
                }
                System.out.println("Brand is Searched Successfully");
            }

            else if(shelfChoice==3){
                System.out.println("Enter the Id of the Shelf you want to Replace");
                shelfId = scanner.nextLine();
                addedShelf.setId(shelfId);
                System.out.println("Enter the Id of the Shelf you want to Replace with");
                updatedShelfId = scanner.nextLine();
                updatedShelf.setId(updatedShelfId);
                shelfAction.updateShelf(shelfId,updatedShelf);
                System.out.println("Shelf is Updated Successfully");
            }

            else if(shelfChoice == 4){
                System.out.println("Enter the Id of the Shelf you want to Delete");
                shelfId = scanner.nextLine();
                shelfAction.deleteShelf(shelfId);
                System.out.println("Shelf is Deleted Successfully");
            }

            else if(shelfChoice == 5){
                shelfAction.listShelves();
                System.out.println("Shelves are Listed Successfully");
            }

        }
    }
}

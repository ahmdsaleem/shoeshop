package com.company;

import com.company.beans.Shoe;

import java.util.Scanner;

public class ShoeView {
    ShoeAction shoeAction = new ShoeAction();

    public void showShoeMenu(int choice){


        int ShoeChoice;
        String ShoeId,ShoeName,updatedShoeId,updatedShoeName;
        Shoe addedShoe = new Shoe();
        Shoe updatedShoe = new Shoe();


        if(choice==6){
            System.out.println("Press 1 to Add Shoe");
            System.out.println("Press 2 to Search a Certain Shoe");
            System.out.println("Press 3 to Update Shoe");
            System.out.println("Press 4 to Delete Shoe");
            System.out.println("Press 5 to List all Shoes Present");

            Scanner scanner = new Scanner(System.in);
            ShoeChoice = scanner.nextInt();
            scanner.nextLine();

            if(ShoeChoice==1){
                System.out.println("Enter the Id of the Shoe you want to add");
                ShoeId = scanner.nextLine();
                addedShoe.setId(ShoeId);
                System.out.println("Enter the Name of the Shoe you want to add");
                ShoeName = scanner.nextLine();
                addedShoe.setName(ShoeName);
                shoeAction.addShoe(addedShoe);
                System.out.println("Shoe is Added Successfully");
            }

            else if(ShoeChoice==2){
                System.out.println("Enter the Id of the Shoe you want to search");
                ShoeId = scanner.nextLine();
                if(shoeAction.viewShoe(ShoeId) != null) {
                    System.out.println(shoeAction.viewShoe(ShoeId).getId() + " is Present");
                }
                System.out.println("Shoe is Searched Successfully");
            }

            else if(ShoeChoice==3){
                System.out.println("Enter the Id of the Shoe you want to Replace");
                ShoeId = scanner.nextLine();
                addedShoe.setId(ShoeId);
                System.out.println("Enter the Id of the Shoe you want to Replace with");
                updatedShoeId = scanner.nextLine();
                updatedShoe.setId(updatedShoeId);
                System.out.println("Enter the Name of the Shoe you want to Replace with");
                updatedShoeName = scanner.nextLine();
                updatedShoe.setName(updatedShoeName);
                shoeAction.updateShoe(ShoeId,updatedShoe);
                System.out.println("Shoe is Updated Successfully");
            }

            else if(ShoeChoice == 4){
                System.out.println("Enter the Id of the Shoe you want to Delete");
                ShoeId = scanner.nextLine();
                shoeAction.deleteShoe(ShoeId);
                System.out.println("Shoe is Deleted Successfully");
            }

            else if(ShoeChoice == 5){
                shoeAction.listShoes();
                System.out.println("Shoes are Listed Successfully");
            }

        }
    }

}

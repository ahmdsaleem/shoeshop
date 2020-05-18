package com.company;

import com.company.beans.Brand;


import java.util.Scanner;

public class BrandView {
    BrandAction brandAction = new BrandAction();

    public void showBrandMenu(int choice){

        int BrandChoice;
        String BrandId,BrandName,updatedBrandId,updatedBrandName;
        Brand addedBrand = new Brand();
        Brand updatedBrand = new Brand();

        if(choice==1){
            System.out.println("Press 1 to Add Brand");
            System.out.println("Press 2 to Search a Certain Brand");
            System.out.println("Press 3 to Update a Brand");
            System.out.println("Press 4 to Delete a Brand");
            System.out.println("Press 5 to List all Brands Present");

            Scanner scanner = new Scanner(System.in);
            BrandChoice = scanner.nextInt();
            scanner.nextLine();

            Brand newBrand1= new Brand();
            newBrand1.setId("Brand 1");
            Brand newBrand2 = new Brand();
            newBrand2.setId("Brand 2");
            Brand newBrand3 = new Brand();
            newBrand3.setId("Brand 3");
            brandAction.addBrand(newBrand1);
            brandAction.addBrand(newBrand2);
            brandAction.addBrand(newBrand3);

            if(BrandChoice==1){

                System.out.println("Enter the Id of the Brand you want to add");
                BrandId = scanner.nextLine();
                addedBrand.setId(BrandId);
                System.out.println("Enter the Name of the Brand you want to add");
                BrandName = scanner.nextLine();
                addedBrand.setName(BrandName);
                brandAction.addBrand(addedBrand);
                System.out.println("Brand is Added Successfully");
            }

            else if(BrandChoice==2){
                System.out.println("Enter the Id of the Brand you want to search");
                BrandId = scanner.nextLine();
                System.out.println(brandAction.viewBrand(BrandId).getId()+" is Present");
                System.out.println("Brand is Searched Successfully");
            }

            else if(BrandChoice==3){
                System.out.println("Enter the Id of the Brand you want to Replace");
                BrandId = scanner.nextLine();
                addedBrand.setId(BrandId);
                System.out.println("Enter the Id of the Brand you want to Replace with");
                updatedBrandId = scanner.nextLine();
                updatedBrand.setId(updatedBrandId);
                System.out.println("Enter the Name of the Brand you want to Replace with");
                updatedBrandName = scanner.nextLine();
                updatedBrand.setName(updatedBrandName);
                brandAction.updateBrand(BrandId,updatedBrand);
                System.out.println("Brand is Updated Successfully");
            }

            else if(BrandChoice == 4){
                System.out.println("Enter the Id of the Shoe you want to Delete");
                BrandId = scanner.nextLine();
                brandAction.deleteBrand(BrandId);
                System.out.println("Brand is Deleted Successfully");
            }

            else if(BrandChoice == 5){
                brandAction.listBrands();
                System.out.println("Brands are Listed Successfully");
            }

        }
    }

}

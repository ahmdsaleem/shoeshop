package com.company;

import com.company.beans.Shoe;

public class Main {

    public static void main(String[] args) {
       ShoeAction shoeAction= new ShoeAction();
        Shoe newShoe= new Shoe();
        newShoe.setId("BATA 1");
        Shoe newShoe1 = new Shoe();
        newShoe1.setId("BATA 2");
        Shoe newShoe2 = new Shoe();
        newShoe2.setId("BATA 3");
        shoeAction.addShoe(newShoe);
        shoeAction.addShoe(newShoe1);
        shoeAction.listShoes();
//
//
//      //  if(shoeAction.viewShoe("BATA 1")!=null){
//          //  System.out.println(shoeAction.viewShoe("BATA 1").getId());
//        //}
//
//        shoeAction.updateShoe("BATA 2",newShoe2);

        shoeAction.deleteShoe("BATA 1");


        shoeAction.listShoes();


    }
}

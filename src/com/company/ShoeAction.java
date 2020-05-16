package com.company;

import com.company.beans.Shoe;

public class ShoeAction {

    private Shoe shoes[] = new Shoe[500];
    private int shoeIndex = 0;


    public void addShoe(Shoe shoe) {
        shoes[shoeIndex] = shoe;
        shoeIndex++;

    }

    public Shoe viewShoe(String id) {
        for (int i = 0; i < shoeIndex; i++) {
            if (shoes[i].getId().equalsIgnoreCase(id)) {
                return shoes[i];
            }
        }
        return null;
    }

    public void updateShoe(String id, Shoe shoe) {
        for (int i = 0; i < shoeIndex; i++) {
            if (shoes[i].getId().equalsIgnoreCase(id)) {
                shoes[i] = shoe;
            }
        }

    }

    public void deleteShoe(String id) {
        for (int i = 0; i < shoeIndex; i++) {
            if (shoes[i].getId().equalsIgnoreCase(id)) {
                shoes[i] = null;
            }
        }
    }

    public void listShoes() {
        for (int i = 0; i < shoeIndex; i++) {
            if (shoes[i]!= null) {
                System.out.println(shoes[i].getId());
            }
        }
    }
}
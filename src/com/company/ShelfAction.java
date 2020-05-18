package com.company;

import com.company.beans.Shelf;


public class ShelfAction {

    private int shelfIndex=0;
    private Shelf shelves[] = new Shelf[500];

    public void addShelf(Shelf shelf){
        shelves[shelfIndex]=shelf;
        shelfIndex++;

    }

    public Shelf viewShelf(String id){
        for(int i=0;i<shelfIndex;i++){
            if(shelves[i].getId().equalsIgnoreCase(id)){
                return shelves[i];
            }
        }
        return null;
    }

    public void updateShelf(String id,Shelf shelf){
        for(int i=0;i<shelfIndex;i++){
            if(shelves[i].getId().equalsIgnoreCase(id)){
                shelves[i]=shelf;
            }
        }
    }

    public void deleteShelf(String id){
        for(int i=0;i<shelfIndex;i++){
            if(shelves[i].getId().equalsIgnoreCase(id)){
                shelves[i]=null;
            }
        }
    }



    public void listShelves(){
        for(int i=0;i<shelfIndex;i++){
            if(shelves[i]!=null) {
                System.out.println(shelves[i].getId());
            }
        }
    }
}

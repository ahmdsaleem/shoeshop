package com.company;

import com.company.beans.Brand;


public class BrandAction {
    private int brandIndex=0;
    private Brand brands[] = new Brand[500];

    public void addBrand(Brand brand){
        brands[brandIndex]=brand;
        brandIndex++;

    }

    public Brand viewBrand(String id){
        for(int i=0;i<brandIndex;i++){
            if(brands[i].getId().equalsIgnoreCase(id)){
                return brands[i];
            }
        }
        return null;
    }

    public void updateBrand(String id,Brand brand){
        for(int i=0;i<brandIndex;i++){
            if(brands[i].getId().equalsIgnoreCase(id)){
                brands[i]=brand;
            }
        }
    }

    public void deleteBrand(String id){
        for(int i=0;i<brandIndex;i++){
            if(brands[i].getId().equalsIgnoreCase(id)){
                brands[i]=null;
            }
        }
    }



    public void listBrands(){
        for(int i=0;i<brandIndex;i++){
            if(brands[i]!=null) {
                System.out.println(brands[i].getId());
            }
        }
    }
}


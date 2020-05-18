package com.company;


import com.company.beans.Order;

public class OrderAction {
    private int orderIndex=0;
    private Order orders[] = new Order[500];

    public void addOrder(Order order){
        orders[orderIndex]=order;
        orderIndex++;

    }

    public Order viewOrder(String id){
        for(int i=0;i<orderIndex;i++){
            if(orders[i].getId().equalsIgnoreCase(id)){
                return orders[i];
            }
        }
        return null;
    }

    public void updateOrder(String id,Order order){
        for(int i=0;i<orderIndex;i++){
            if(orders[i].getId().equalsIgnoreCase(id)){
                orders[i]=order;
            }
        }
    }

    public void deleteBrand(String id){
        for(int i=0;i<orderIndex;i++){
            if(orders[i].getId().equalsIgnoreCase(id)){
                orders[i]=null;
            }
        }
    }



    public void listBrands(){
        for(int i=0;i<orderIndex;i++){
            if(orders[i]!=null) {
                System.out.println(orders[i].getId());
            }
        }
    }
}

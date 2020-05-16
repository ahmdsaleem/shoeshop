package com.company.beans;

public class Order {
    private String id;
    private String date;
    private String time;
    private String shoeIds[];
    private String quantities[];
    private String customerId;
    private String employeeId;
    private int total;
    private String orderType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String[] getShoeIds() {
        return shoeIds;
    }

    public void setShoeIds(String[] shoeIds) {
        this.shoeIds = shoeIds;
    }

    public String[] getQuantities() {
        return quantities;
    }

    public void setQuantities(String[] quantities) {
        this.quantities = quantities;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}

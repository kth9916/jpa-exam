package io.namoosori.customerexam.entity;

public class Customer {
    //
    private String id;
    private String name;
    private long registerDate;

    public Customer(String id, String name){
        this.id = id;
        this.name = name;
        this.registerDate = System.currentTimeMillis();
    }

    public static Customer Sample() {
        return new Customer("ID0001","Kim");
    }
}

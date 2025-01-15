package org.example.java8.lamdaexpression;

import java.util.Set;

 class LineItems{
    private Long id;
    private String itemName;
    private Double price;
    private Double weight;


     public LineItems(Long id, String itemName, Double price, Double weight) {
         this.id = id;
         this.itemName = itemName;
         this.price = price;
         this.weight = weight;
     }




     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }



}

public class OrderItem {
    private Long id;
    private String name;
    private String ordernum;
    private Set<LineItems> lineItems;
    private Double totalPrice;
    private Integer noOfItems;


    public OrderItem(Long id, String name, String ordernum, Set<LineItems> lineItems, Double totalPrice, Integer noOfItems) {
        this.id = id;
        this.name = name;
        this.ordernum = ordernum;
        this.lineItems = lineItems;
        this.totalPrice = totalPrice;
        this.noOfItems = noOfItems;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Set<LineItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItems> lineItems) {
        this.lineItems = lineItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(Integer noOfItems) {
        this.noOfItems = noOfItems;
    }



}

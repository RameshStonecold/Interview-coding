package org.example.designpatterns.statepattern;

import java.time.LocalDateTime;

public class PlaceOrder {
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderEnum getOrderEnum() {
        return orderEnum;
    }

    public void setOrderEnum(OrderEnum orderEnum) {
        this.orderEnum = orderEnum;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    String orderId;
    OrderEnum orderEnum;
    LocalDateTime orderDate;

    public PlaceOrder(String orderId, OrderEnum orderEnum, LocalDateTime orderDate) {
        this.orderId = orderId;
        this.orderEnum = orderEnum;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "orderId='" + orderId + '\'' +
                ", orderEnum=" + orderEnum +
                ", orderDate=" + orderDate +
                '}';
    }
}

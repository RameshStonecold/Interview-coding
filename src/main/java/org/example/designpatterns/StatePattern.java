package org.example.designpatterns;

import org.example.designpatterns.statepattern.OrderEnum;
import org.example.designpatterns.statepattern.PlaceOrder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class StatePattern {


    public static void main(String[] args) {

        PlaceOrder order = new PlaceOrder("12",OrderEnum.PLACE_ORDER, LocalDateTime.now());
        System.out.println("Order Placed :: "+order);

      PlaceOrder o1 =getDbList().get(0);
      System.out.println(" Order "+ o1);

    }

    public static List<PlaceOrder> getDbList(){
        List<PlaceOrder> list = new ArrayList<>();
        list.add(new PlaceOrder("12",OrderEnum.ORDER_DELIVERED,LocalDateTime.now()));
        return list;
    }
}

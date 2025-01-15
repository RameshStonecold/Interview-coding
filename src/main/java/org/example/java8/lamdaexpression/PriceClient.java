package org.example.java8.lamdaexpression;

import java.util.Set;
import java.util.stream.Collectors;

public class PriceClient {

    public Enum notify;



    public static void main(String[] args) {

        orderItem();





    }





    public static OrderItem orderItem(){

        LineItems item1 = new LineItems(1L,"Redmi5",139990.0,204.0);
        LineItems item2 = new LineItems(2L,"Redmi5",139990.0,204.0);
        LineItems item3 = new LineItems(3L,"Redmi5",139990.0,204.0);

        Set<LineItems> items = Set.of(item1,item2,item3);
        Double totalPrice = items.stream().collect(Collectors.summarizingDouble(LineItems::getPrice)).getSum();
        Integer noOfItems = items.size();

        return new OrderItem(1L,"mobile","Order234#",items,totalPrice,noOfItems);
    }


}

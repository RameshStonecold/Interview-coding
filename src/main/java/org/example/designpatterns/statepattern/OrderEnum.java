package org.example.designpatterns.statepattern;

public enum OrderEnum {

    PLACE_ORDER{
        @Override
        public void changeStatusToPlaceOrder(PlaceOrder order) throws OrderException {

            order.setOrderEnum(ORDER_PROCESSING);
            System.out.println("Order Processing ! ");
        }

        @Override
        public void changeStatusToOrderProcessing(PlaceOrder order) {

            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDispatched(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDelivered(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }
    },

    ORDER_PROCESSING{
        @Override
        public void changeStatusToPlaceOrder(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderProcessing(PlaceOrder order) {
            order.setOrderEnum(ORDER_DISPATCHED);
            System.out.println("Order Dispatched ! ");
        }

        @Override
        public void changeStatusToOrderDispatched(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDelivered(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }
    },

    ORDER_DISPATCHED{
        @Override
        public void changeStatusToPlaceOrder(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderProcessing(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDispatched(PlaceOrder order) {
            System.out.println("Order Dispatched ! ");
        }

        @Override
        public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDelivered(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }
    },
    ORDER_DELIVERED_AT_JUNCTION_POINT{
        @Override
        public void changeStatusToPlaceOrder(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderProcessing(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDispatched(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder order) {
            System.out.println("Order Delivered at local Junction point ! ");
        }

        @Override
        public void changeStatusToOrderDelivered(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }
    },
    ORDER_DELIVERED{
        @Override
        public void changeStatusToPlaceOrder(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderProcessing(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }


        @Override
        public void changeStatusToOrderDispatched(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder order) {
            System.out.println("Unknown state change exception");
        }

        @Override
        public void changeStatusToOrderDelivered(PlaceOrder order) {
            System.out.println("Order Delivered ! ");
        }
    };


    abstract public void changeStatusToPlaceOrder(PlaceOrder placeOrder) throws OrderException;
    abstract public void changeStatusToOrderProcessing(PlaceOrder placeOrder) throws OrderException;
    abstract public void changeStatusToOrderDispatched(PlaceOrder placeOrder)throws OrderException;
    abstract public void changeStatusToOrderDeliveredAtLocalJunction(PlaceOrder placeOrder) throws OrderException;
    abstract public void changeStatusToOrderDelivered(PlaceOrder placeOrder) throws OrderException;

}

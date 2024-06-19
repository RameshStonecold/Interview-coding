package org.example.psuedocode;

import java.util.HashMap;

public class PickARandomCardFromDeckOfCards {
    public static void main(String[] args) {

        pickCard();
    }

    private static void pickCard(){
        String [] suites = {"Spade","Club","Heart","Diamond"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String [] deck = new String[52];

        HashMap<String,String> map = new HashMap<>();
        for (int i=0; i<deck.length; i++){


            deck[i]= ranks[i%13]+suites[1/13];

            System.out.println(ranks[i%13]);

            System.out.println(suites[1/13]);

        }

    }


}
